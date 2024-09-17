public class Main {
    public static void main(String[] args) {
        Book book = new Book("Vientos de Invierno", "George RR Martin", false);
        LibraryMember member = new LibraryMember("Julio Gutiérrez", "270903");
        
        Library usbi = new Library(book,member ); 

        usbi.showBookStatus();
        usbi.returnBook();
    }
}