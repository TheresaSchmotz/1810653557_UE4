import java.util.Date;

public class Book {

    private int pages;
    private Date released;
    private String title;
    private String isbn;


    //Getter

    public int getPages()
    {
        return pages;
    }

    public Date getReleased()
    {
        return released;
    }

    public String getTitle()
    {
        return title;
    }

    public String getIsbn()
    {
        return isbn;
    }


    //Konstruktor
    /*Jezt kann man in anderen Klassen Objekte mit Anfangswerten machen. Mit this bezieht man sich auf die Instanzvariable
     z.b:

    public class Wertzuweisung
    {
        public static void main(String[]args)
        {
            Book eins = new Book(576, 12.12.12, "Huehuehue", "FH4930528KD")
        }
    }
     */

    Book(int p, Date r, String t, String i)
    {
        this.pages=p;
        this.released=r;
        this.title=t;
        this.isbn=i;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public void setReleased(Date released)
    {
        this.released = released;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
}
