package a.aaaaaa;

import java.util.Objects;

public class CloneExper  implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
//        CloneExper obj = (CloneExper) super.clone();  // static

        CloneExper obj1 = new CloneExper();
        Class2 class2 = new Class2("Aaaa");

        System.out.println(obj1.equals(obj1.cloneCloneExper()));
//        System.out.println(class2.equals(obj1.cloneClass2()));
    }

    public CloneExper cloneCloneExper() throws CloneNotSupportedException{
        CloneExper obj2 = (CloneExper) super.clone();
        return obj2;
    }

    public Class2 cloneClass2() throws CloneNotSupportedException{
        Class2 obj3 = (Class2) super.clone();
        return obj3;
    }
}

class Class2{
    String name;

    public Class2(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class2 class2 = (Class2) o;
        return Objects.equals(name, class2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
