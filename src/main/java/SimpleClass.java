
public class SimpleClass {

    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        SimpleClass sc = new SimpleClass();
        System.out.println("Sum: " + sc.sum(5, 10));
    }
}
