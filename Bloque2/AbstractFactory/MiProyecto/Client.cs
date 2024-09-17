// Client
public class UIRenderer
{
    private Button button;
    private Label label;
    private Dialog dialog;

    public UIRenderer(WidgetFactory factory)
    {
        button = factory.CreateButton();
        label = factory.CreateLabel();
        dialog = factory.CreateDialog();
    }

    public void RenderUI()
    {
        button.Press();
        label.Display();
        dialog.Open();
    }
}
