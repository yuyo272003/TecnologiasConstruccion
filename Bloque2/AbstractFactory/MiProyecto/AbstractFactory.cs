// Abstract Factory
public interface WidgetFactory
{
    Button CreateButton();
    Label CreateLabel();
    Dialog CreateDialog();
}
