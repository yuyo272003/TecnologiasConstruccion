public class LibraryMember {
    private String name; 
    private String memberID;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public LibraryMember(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
    } 

    public void borrowBook(Book book){
        System.out.println(name + " ha solicitado el prestamo del libro " + book.getTitle());

    }

    public void returnBook(Book book){
            book.setAvailable(true); 
            System.out.println("El libro " + book.getTitle() + " ha sido devuelto");
    }

}
