// Concrete Factories
public class WindowsWidgetFactory : WidgetFactory
{
    public Button CreateButton()
    {
        return new WindowsButton();
    }

    public Label CreateLabel()
    {
        return new WindowsLabel();
    }

    public Dialog CreateDialog()
    {
        return new WindowsDialog();
    }
}

public class LinuxWidgetFactory : WidgetFactory
{
    public Button CreateButton()
    {
        return new LinuxButton();
    }

    public Label CreateLabel()
    {
        return new LinuxLabel();
    }

    public Dialog CreateDialog()
    {
        return new LinuxDialog();
    }
}
