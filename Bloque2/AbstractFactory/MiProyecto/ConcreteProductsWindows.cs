// Concrete Products for Windows
public class WindowsButton : Button
{
    public void Press()
    {
        Console.WriteLine("Botón de Windows presionado.");
    }
}

public class WindowsLabel : Label
{
    public void Display()
    {
        Console.WriteLine("Etiqueta de Windows desplegada.");
    }
}

public class WindowsDialog : Dialog
{
    public void Open()
    {
        Console.WriteLine("Cuadro de Dialogo de Windows abierto");
    }
}
