public class Authentificator {
    public boolean authenticate(String username, String password) {
        User user = new User(password, password);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Autenticacion completada :)");
            return true;
        } else {
            System.out.println("Autenticacion incorrecta");
            return false;
        }
    }
}
