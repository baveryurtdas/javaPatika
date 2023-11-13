//Out class
public class Out {
    public int a = 5;
    public static int b = 20;


    //Inner Class
    public static class In {
        public static int a = 10;

        public static void run() {
            System.out.println("In sınıfa ait run metodu çalıştı");
            int a = 1;
            System.out.println(a);
            System.out.println(In.a);
            System.out.println(Out.b);
        }
    }

    public static void run() {

        In.run();

    }


}
