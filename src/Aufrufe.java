import java.util.Date;

public class Aufrufe {

    public static void main(String[] args) {

        //zu Aufgabe 3

        Date date1 = new Date(2018, 10, 2, 14, 9, 54);
        Book book1 = new Book(200, date1, "My Book", "");

        System.out.println("Das Buch hat" + book1.getPages()+ " Seiten, wurde am " + book1.getReleased() + "veröffentlicht und hat den Titel " + book1.getTiitle());


    }
}
