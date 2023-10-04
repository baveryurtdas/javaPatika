import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class dataTypeJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan giriş almak için bir Scanner nesnesi oluşturuyoruz
        System.out.println("Bir tamsayı giriniz:"); // Kullanıcıya giriş yapması için bir mesaj yazıyoruz
        try { // Hata oluşabilecek kod bloğunu try-catch ile sarmalıyoruz

            long n = scanner.nextLong(); // Kullanıcının girdiği değeri long tipinde bir değişkene atıyoruz

            ArrayList<String> veriTipiListesi = new ArrayList<String>(); // Girdiğin değerin uyduğu veri tiplerini tutmak için bir ArrayList oluşturuyoruz

            if (n >= -128 && n <= 127) { // Girdiğin değer byte aralığında ise
                veriTipiListesi.add("byte"); // byte'ı listeye ekliyoruz
            }
            if (n >= -32768 && n <= 32767) { // Girdiğin değer short aralığında ise
                veriTipiListesi.add("short"); // short'u listeye ekliyoruz
            }
            if (n >= -2147483648 && n <= 2147483647) { // Girdiğin değer int aralığında ise
                veriTipiListesi.add("int"); // int'i listeye ekliyoruz
            }
            veriTipiListesi.add("long"); // Girdiğin değer her zaman long aralığına uyar, bu yüzden long'u listeye ekliyoruz
            Collections.sort(veriTipiListesi); // Listeyi sıralıyoruz
            System.out.println(n + " can be fitted in:"); // Girdiğin değerin hangi veri tiplerine uyduğunu yazdıracağımız bir mesaj yazıyoruz
            for (String veriTipi : veriTipiListesi) { // Listeyi döngü ile geziyoruz
                System.out.println("* " + veriTipi); // Her bir veri tipini yıldız ile başlayan bir satırda yazdırıyoruz
            }
        } catch (Exception e) { // Eğer girdiğin değer long aralığına bile uymazsa, bir hata oluşur ve catch bloğuna girer
            System.out.println("n can't be fitted anywhere."); // Bu durumda n'in hiçbir veri tipine uymadığını belirten bir mesaj yazdırıyoruz
        }
    }
}
