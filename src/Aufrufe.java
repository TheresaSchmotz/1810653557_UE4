import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufrufe {

    public static void main(String[] args) {

        //zu Aufgabe 3

        Date date1 = new Date(2018, 10, 2, 14, 9, 54);
        Book book1 = new Book(200, date1, "My Book", "");

        System.out.println("Das Buch hat " + book1.getPages()+ " Seiten, wurde am " + book1.getReleased() + " veröffentlicht und hat den Titel " + book1.getTitle());


        //Aufgabe 4

        List<Book> lieblingsbuecher = new ArrayList<>();

        lieblingsbuecher.add(new Book(335, date1, "Harry Potter and the Philosopher's Stone", " 9783551551672"));
        lieblingsbuecher.add(new Book(304, date1, "Phantastische Tierwesen und wo sie zu finden sind", "3551556946"));
        lieblingsbuecher.add(new Book(239, date1, "Artemis Fowl", "3471772510"));
        lieblingsbuecher.add(new Book(304, date1, "Artemis Fowl: Die Verschwörung", "2070554031"));
        lieblingsbuecher.add(new Book(352, date1, "Skulduggery Pleasant 3 - Die Diablerie bittet zum Sterben", "9783785574058"));


        for(Book a : lieblingsbuecher){
            System.out.println(a.getTitle()+ " hat "+ a.getPages()+ " Seiten und folgende ISBN: "+a.getIsbn());
        }
    }
}
