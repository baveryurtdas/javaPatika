import java.util.Scanner;
public class KDVTutariHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran =0.18,kdvTutar,kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz : ");
        tutar=input.nextDouble();

        if(tutar>=0 && tutar<=1000){
            kdvOran=0.18;
        }else{
            kdvOran=0.08;
        }

         kdvTutar = tutar * kdvOran;
         kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı :" + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);



    }
}
