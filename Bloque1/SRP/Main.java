public class Main {
    public static void main(String[] args) {
           
        Library USBI = new Library("Fundamentos de los Sistemas Operativos", "JVergara",
         true, "Diana", "PINO832190"); 

        USBI.showBookStatus();
        USBI.lendBook();
        USBI.showBookStatus();
        USBI.returnBook();
        USBI.showBookStatus(); 
    }
}
