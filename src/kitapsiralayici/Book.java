package kitapsiralayici;

public class Book {
    String nameBook, author ;
    int pageNum,dateOfPub;

    public Book(String nameBook, String author, int dateOfPub, int pageNum) {
        this.nameBook = nameBook;
        this.author = author;
        this.dateOfPub = dateOfPub;
        this.pageNum = pageNum;
        if (pageNum < 0) {
            System.out.println("Sayfa sayısı 0'dan küçük olamaz.");
            this.pageNum = 10;
        }
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String book) {
        this.nameBook = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if (pageNum < 0) {
            System.out.println("Sayfa sayısı 0'dan küçük olamaz.");
            this.pageNum = 10;
        } else {
            this.pageNum = pageNum;
        }
    }
}
