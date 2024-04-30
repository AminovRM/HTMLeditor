package HTMLeditor.listeners;



import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameListener extends WindowAdapter {
    private String view;

    public FrameListener(String view) {
        this.view = view;
    }

    public void windowClosing(WindowEvent windowEvent) {
        try {
            view.wait(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}






























