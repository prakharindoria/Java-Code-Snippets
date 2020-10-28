public class Book {
    public String getBname() {
        return bname;
    }

    public Book(String bname,String bauthor, double bprice) {
        this.bname = bname;
        this.bauthor = bauthor;
        this.bprice = bprice;
    }

    public double getBprice() {
        return bprice;
    }

    public void setBprice(double bprice) {
        this.bprice = bprice;
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

