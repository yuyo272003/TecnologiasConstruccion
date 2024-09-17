public class Library {
    private Book book; 
    private LibraryMember member;
    
    public Library(Book book, LibraryMember member) {
        this.book = book;
        this.member = member;
    } 
    

    public void lendBook(){

        if(book.isAvailable()){
            
             book.setAvailable(false);
            System.out.println("El libro "+ book.getTitle() + "no esta dispunible");

        }else{
            System.out.println("El libro " + book.getTitle() + " esta disponible");
        }

    }

    public void returnBook(){

        
        book.setAvailable(true);
        System.out.println("El libro " + book.getTitle() + " ha sido devuelto por " + member.getName() );

    }

    public void showBookStatus(){
        System.out.println(" El estado  del libro  "  + book.getTitle() + " es " + book.isAvailable());
    }

}
