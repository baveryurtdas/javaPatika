import java.util.Scanner;
public class taksimetreHesaplama {
    public static void main(String[] args) {
        int km;
        double perKM =2.20,total, startPrice=10,sortD;

        Scanner gidilen =new Scanner(System.in);
        System.out.println("Gidilen km sayısını girin : ");
        km = gidilen.nextInt();
        total = (km*perKM)+startPrice;
        //Sort Distance
        sortD = (total<20) ? 20 : total;
        System.out.println("Ödenecek Tutar : " + total);

    }
}
