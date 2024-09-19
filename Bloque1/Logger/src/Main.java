class Logger{
    public void log(String... messages){

        for(String message : messages){
            System.out.println(message);
        }


    }

    public <T> void log(T message){

        System.out.println("Mensaje generico: " + message);

    }

    public void log(int level,String... messages){
        System.out.println("Multiples mensajes con niveles " + level);
        for(String message : messages){
            System.out.println(message);
        }
    }

    public class Main {
        public static void main(String[] args) {

            Logger log = new Logger();
            log.log("Hola","Adios","Sebastian");
            log.log("Rafa y los perros");
            log.log(4);
            log.log(true);

        }

    }
}