package generic;

public class Main {
    public static void main(String[] args) {
        Integer a = null;
        String str = "abc";

        A aObject = null;
        Nullable<A> n1 = new Nullable<>(aObject);
        n1.run();
    }
}
