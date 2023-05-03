package hk.hku.entity;

public class BookEntity {
    private  String bookName;
    private Double bookPrice;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }

    public BookEntity(String bookName, Double bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public BookEntity() {
    }

    public static void main(String[] args) {
//        BookEntity bookEntity = new BookEntity();
//        bookEntity.setBookName("Java");
//        bookEntity.setBookPrice(100.00);

        BookEntity bookEntity = new BookEntity("Java", 100.00);
        System.out.println(bookEntity.toString());
    }
}
