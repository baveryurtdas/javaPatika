package kitapsiralayici;

import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>(new OrderBookNameCompareTo());
        books.add(new Book("Korkunç Yıllar", "Cengiz Dağcı",1956,228));
        books.add(new Book("Türk Medeniyet Tarihi", "Ziya Gökalp",1926,296));
        books.add(new Book("Beş Şehir","Ahmet Hamdi Tanpınar",1946,240));
        books.add(new Book("Anılarım(1913-1922)","Cemal Paşa",2016,384));
        books.add(new Book("Bir Ömür Nasıl Yaşanır","İlber Ortaylı",2019, 288));

        for(Book book : books){
            System.out.println(book.getNameBook());
        }

        System.out.println("-------------");


        TreeSet<Book> kitaplar = new TreeSet<>(new OrderBookPageNumComparator());
        kitaplar.add(new Book("Korkunç Yıllar", "Cengiz Dağcı",1956,228));
        kitaplar.add(new Book("Türk Medeniyet Tarihi", "Ziya Gökalp",1926,296));
        kitaplar.add(new Book("Beş Şehir","Ahmet Hamdi Tanpınar",1946,240));
        kitaplar.add(new Book("Anılarım(1913-1922)","Cemal Paşa",2016,384));
        kitaplar.add(new Book("Bir Ömür Nasıl Yaşanır","İlber Ortaylı",2019, 288));


        for(Book kitap : kitaplar){
            System.out.println(kitap.getNameBook());
        }
    }
}
