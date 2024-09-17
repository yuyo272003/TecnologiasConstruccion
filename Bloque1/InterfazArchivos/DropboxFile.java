public class DropboxFile implements SupportsRenaming{

    private String name;
    private String ownerUsername; 
    private String ownerGroupName;

    public DropboxFile(){

    }

    public DropboxFile(String name, String ownerUsername, String ownerGroupName) {
        this.name = name;
        this.ownerUsername = ownerUsername;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void rename(String name){
        this.name = name; 
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOwnerUsername() {
        return ownerUsername;
    }
    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }
    public String getOwnerGroupName() {
        return ownerGroupName;
    }
    public void setOwnerGroupName(String ownerGroupName) {
        this.ownerGroupName = ownerGroupName;
    }




    
}