package HTMLeditor.listeners;



import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import HTMLeditor.View;

import java.awt.*;

public class TextEditMenuListener implements MenuListener {
    private final View view;

    public TextEditMenuListener(View view) {
        this.view = view;
    }

    @Override
    public void menuSelected(MenuEvent menuEvent) {
        JMenu source = (JMenu) menuEvent.getSource();
        Component[] menuComponents = source.getMenuComponents();
        for (Component component : menuComponents) {
            component.setEnabled(view.isHtmlTabSelected());
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}





























