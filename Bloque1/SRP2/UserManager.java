public class UserManager {
    
    private User[] users = new User[10];
    private int userCount = 0;


    public boolean authenticate(String username, String password){
        return false;
        
    }

    public void registerUser(String username, String password) {
        if (userCount < users.length) {
            users[userCount++] = new User(username, password);
            System.out.println("Usuario registrado");
        } else {
            System.out.println("Usuario no registrado");
        }
    }

    public User getUser(String username) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUser().equals(username)) {
                return users[i];
            }
        }
        return null;
    }


}
