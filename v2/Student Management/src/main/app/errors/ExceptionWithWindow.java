package main.app.errors;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 * Abstract custom {@link Exception} class that implements {@link ErrorWindow}
 */
public abstract class ExceptionWithWindow extends Exception implements ErrorWindow{
    private String errMsg;
    private String errMsgTitle;

    @Override
    public void startErrorWindow(JComponent component){
        JOptionPane.showMessageDialog(component, errMsg, errMsgTitle, JOptionPane.ERROR_MESSAGE);
    }

    protected void setErrMsg (String errMsg){this.errMsg = errMsg;}
    protected void setErrMsgTitle (String errMsgTitle){this.errMsgTitle = errMsgTitle;}
}
