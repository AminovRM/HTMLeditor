package HTMLeditor.listeners;



import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import HTMLeditor.View;

public class UndoMenuListener implements MenuListener {
   View view;
    private final JMenuItem undoMenuItem;
    private final JMenuItem redoMenuItem;

    public UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem) {
        this.view = view;
        this.undoMenuItem = undoMenuItem;
        this.redoMenuItem = redoMenuItem;
    }

    public void menuSelected(MenuEvent menuEvent) {
        undoMenuItem.setEnabled(view.canUndo());
        redoMenuItem.setEnabled(view.canRedo());
    }

    public void menuDeselected(MenuEvent e) {
    }

    public void menuCanceled(MenuEvent e) {
    }
}






























