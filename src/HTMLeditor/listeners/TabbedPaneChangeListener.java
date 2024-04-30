package HTMLeditor.listeners;



import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import HTMLeditor.View;


public class TabbedPaneChangeListener implements ChangeListener {
    View view;

    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }

    public void stateChanged(ChangeEvent e) {
        view.selectedTabChanged();
    }
}






























