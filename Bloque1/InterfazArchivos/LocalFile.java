public class LocalFile implements SupportsRenaming,SupportsChangeOfOwenership{
    private String name;
    private String ownerUsername; 
    private String ownerGroupName;
    
   
    
    public LocalFile(String name, String ownerUsername, String ownerGroupName) {
        this.name = name;
        this.ownerUsername = ownerUsername;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void rename(String name){
        this.name = name; 
    }

    @Override
    public void changeOwner(String user, String group){
        this.ownerUsername = user; 
        this.ownerGroupName = group; 
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
