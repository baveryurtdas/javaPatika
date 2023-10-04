import java.util.Scanner;

public class DikUcgendeHipotenus {
    public static void main(String[] args) {
        int a,b;
        double c;

        //Kullanıcıdan veri alma
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenar : ");
        a = girdi.nextInt();
        System.out.print("2. kenarı : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs : " + c);

    }
}
