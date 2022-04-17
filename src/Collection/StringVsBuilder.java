package Collection;

public class StringVsBuilder {
    public static void main(String[] args) {

        long start = System.nanoTime();
        String s = "a" + "a"+ "a"+ "a"+ "a"+ "a"+ "a"+ "a"+ "a"+ "a"+ "a"+ "a"+ "a"+ "a"+ "a"+ "a"+ "a";
        long end = System.nanoTime();

        Long c = end - start;
        System.out.println("Concatenation = " + (end - start) + " nanoseconds");

        StringBuilder sb = new StringBuilder();

        start = System.nanoTime();
        sb.append("ы");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("п");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        end = System.nanoTime();

        System.out.println(sb);
        Long d = end - start;
        System.out.println("StringBuilder = " + (end - start) + " nanoseconds");
        System.out.println("Отношение = " + (d / c));
    }
}
