import java.util.HashSet;

public class Library {
    private static HashSet<Book> hs=new HashSet<Book>();


    public HashSet<Book> getHs() {
        return hs;
    }

    @Override
    public String toString() {
        return "Library{" +
                "hs=" + hs +
                '}';
    }

    public void setHs(HashSet<Book> hs) {
        this.hs = hs;
    }

    public boolean addBook(Book book) {
        if(hs.add(book))
        return true;
        else return false;
    }

    public int getBookCount() {
        return hs.size();
    }

    public HashSet<Book> getAllBooks() {
        HashSet<Book> h=new HashSet<Book>();
        h.addAll(this.hs);
        return h;
    }
}
