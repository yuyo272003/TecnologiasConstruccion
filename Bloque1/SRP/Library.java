/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map; */

public class Library {

        public String title;
        public String author; 
        public boolean isAvailable; 
        public String memberName; 
        public String memberID; 

        public Library(String title, String author, boolean isAvailable, String memberName, String memberID) {
            this.title = title;
            this.author = author;
            this.isAvailable = isAvailable;
            this.memberName = memberName;
            this.memberID = memberID;
           
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

        public String getMemberName() {
            return memberName;
        }

        public void setMemberName(String memberName) {
            this.memberName = memberName;
        }

        public String getMemberID() {
            return memberID;
        }

        public void setMemberID(String memberID) {
            this.memberID = memberID;
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
      

        public void borrowBook(){
            System.out.println(memberName + " ha solicitado el prestamo del libro " + title);
        }

        
        public void showBookStatus(){
            System.out.println(" El estado actual del libro es " + isAvailable);
        }


        
}