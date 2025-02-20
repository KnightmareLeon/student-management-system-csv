package main.app.errors;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 * {@link NullPointerException} that implements {@link ErrorWindow}
 */
public class NullPointerExceptionWithWindow extends NullPointerException implements ErrorWindow{
    private String errMsg = "Error. Requireds selections are empty. Please try again";
    private String errMsgTitle = "No Selected Choice";

    @Override
    public void startErrorWindow(JComponent component){
        JOptionPane.showMessageDialog(component, errMsg, errMsgTitle, JOptionPane.ERROR_MESSAGE);
    }
}
