public class DocumentGenerator {
    private InputReader reader = new InputReader();
    private TxtFileCreator txt = new TxtFileCreator();

    public void makeTxtFile(){
        String content = reader.getContent();
        String name = reader.getFilename();

        this.txt.createFile(content,name);

        System.out.println("Archvo creado");


    }
}
