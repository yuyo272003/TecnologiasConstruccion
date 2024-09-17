public class FilePermissionManager {
    
    void transferOwnership(SupportsChangeOfOwenership file, String ownerUsername, String ownerGroupName){
        file.changeOwner(ownerUsername, ownerGroupName);
    }
}
