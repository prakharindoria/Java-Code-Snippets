import java.util.Objects;

public class Book {


    public Book(String bname,String bauthor, double bprice) {
        this.bname = bname;
        this.bauthor = bauthor;
        this.bprice = bprice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.bprice, bprice) == 0 &&
                bname.equals(book.bname) &&
                bauthor.equals(book.bauthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bname, bauthor, bprice);
    }

    public double getBprice() {
        return bprice;
    }

    public void setBprice(double bprice) {
        this.bprice = bprice;
    }
    public String getBname() {
        return bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    private String bname;
    private String bauthor;
    private double bprice;
}

