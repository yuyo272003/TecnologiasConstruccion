using System;

class Program
{
    static void Main(string[] args)
    {
        // Simulación de la plataforma seleccionada
        string platform = "Linux"; // Cambiar a "Linux" para probar la otra plataforma

        WidgetFactory factory;

        if (platform == "Windows")
        {
            factory = new WindowsWidgetFactory();
        }
        else
        {
            factory = new LinuxWidgetFactory();
        }

        UIRenderer ui = new UIRenderer(factory);
        ui.RenderUI();
    }
}
