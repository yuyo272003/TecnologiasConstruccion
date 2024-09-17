// Concrete Products for Linux
public class LinuxButton : Button
{
    public void Press()
    {
        Console.WriteLine("Botón de Linux presionado.");
    }
}

public class LinuxLabel : Label
{
    public void Display()
    {
        Console.WriteLine("Etiqueta de Linux desplegada.");
    }
}

public class LinuxDialog : Dialog
{
    public void Open()
    {
        Console.WriteLine("Cuadro de Dialogo de Linux abierto");
    }
}
