package kitapsiralayici;

import java.util.Comparator;

public class OrderBookNameCompareTo implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return o1.getNameBook().compareTo(o2.getNameBook());
    }
}
