package printer;

import renderer.Renderer;

public class PrinterWithPrefixImpl implements Printer{
    private String prefix;
    Renderer renderer;

    public PrinterWithPrefixImpl(Renderer renderer) {
        this.renderer = renderer;
        this.prefix = "Prefix";
    }
    @Override
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public void print(String text) {
        renderer.outputs(this.prefix + " " + text);
    }
}
