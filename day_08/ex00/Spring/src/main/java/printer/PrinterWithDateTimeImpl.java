package printer;

import renderer.Renderer;

import java.time.LocalDateTime;
import java.util.Date;

public class PrinterWithDateTimeImpl implements Printer{
    private LocalDateTime time;
    Renderer renderer;

    public PrinterWithDateTimeImpl(Renderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public void setPrefix(String prefix) {
         if(prefix.equals(""))
            this.time = LocalDateTime.now();
         else
             throw new RuntimeException();
    }

    @Override
    public void print(String text) {
        renderer.outputs(this.time + " " + text);
    }
}
