public class Book{

    private String title; 
    private String author; 
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    } 

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void lendBook(){
        if(isAvailable){
            isAvailable = false; 
            System.out.println("El libro "+ title + "no esta dispunible");

        }else{
            System.out.println("El libro " + title + " esta disponible");
        }
    }

    public void returnBook(){

        isAvailable = true; 
        System.out.println("El libro " + title + " ha sido devuelto");
    }


}
 
