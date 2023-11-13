public class Main {
    public static void main(String[] args) {
        Anonymus a = new Anonymus() {
            @Override
            public void run() {
                System.out.println(this.a);
                System.out.println("Anonim olarak yazılmış run metodu.");
                print();
            }

            public void print() {
                System.out.println("Print metodu");
            }
        };
        a.run();


    }
}
