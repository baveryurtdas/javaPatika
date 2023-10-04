import java.util.Scanner;

public class notOrtalamasiHesaplama {
    public static void main(String[] args) {

        // Degiskenleri olustur
        int mat,fizik,kimya,turkce,tarih,muzik;
        // Scanner tanımlandı
        Scanner inp = new Scanner(System.in);
        // Kullanıcı Degerleri
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();
        System.out.print("Turkce Notunuz : ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();
        System.out.print("Muzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamaniz : " + sonuc);

        String durum = (sonuc >= 60) ? "Geçtiniz" : "Kaldınız";

        System.out.println("Sınıfı " + durum);
    }
}
