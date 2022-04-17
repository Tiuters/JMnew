package a.aaaaaa;

import java.util.Objects;


// https://www.examclouds.com/ru/java/java-core-russian/cloning
public class Clone2 {
}

class Car implements Cloneable {
    private String name;
    private Driver driver;

    public Car(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

//    public Car дайКопию() throws CloneNotSupportedException {
//        return (Car) super.clone();
//    }

    @Override
    public Car clone() throws CloneNotSupportedException {
//        return (Car) super.clone();
        return new Car("Гhрузовик", new Driver("Василий", 45));
    }

//    @Override
//    public Car clone() throws CloneNotSupportedException {
//        Car newCar = (Car) super.clone();
//        Driver driver = (Driver) this.getDriver().clone();
//        newCar.setDriver(driver);
//        return newCar;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Driver implements Cloneable {
    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Driver cloneW() throws CloneNotSupportedException {
//        return (Driver) super.clone();
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return age == driver.age && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class CloneCarDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Грузовик", new Driver("Василий", 45));
//        Car clonedCar = car.дайКопию();
        Car clonedCar = car.clone();
        System.out.println("Оригинал:\t" + car);
        System.out.println("Клон:        \t" + clonedCar);
        System.out.println(car.equals(clonedCar));

//        Driver clonedCarDriver = clonedCar.getDriver();
//        clonedCarDriver.setName("Вася");
//
//        System.out.println("Оригинал после изменения имени водителя:\t" + car.getName());
//        System.out.println("Клон после изменения имени водителя:   \t\t" + clonedCar);
        System.out.println(clonedCar.getClass());
    }
}
//***************************************************************************************************************************
class MyClass implements Cloneable{
    public Integer i = 10;

    public MyClass clone() throws CloneNotSupportedException{
        MyClass obj=(MyClass)super.clone();
        obj.i = i;
        return obj;
    }
    public String toString(){
        return i.toString();
    }
}

class Temp {
    public static void main(String []args) throws  CloneNotSupportedException{
        MyClass a = new MyClass();
        a.i = 11;
        MyClass b = a.clone();
        MyClass c = a;
        System.out.println("a: " + a + " b: " + b + " c: " + c);
        a.i=12;
        System.out.println("a: " + a + " b: " + b + " c: " + c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


