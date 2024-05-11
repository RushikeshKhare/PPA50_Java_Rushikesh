import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(600,600);      // 600 pixel , 600 pixel
        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListener());
    }
}

class MarvellousListener implements WindowListener
{
    public void windowDeactivated(WindowEvent obj){}
    public void windowActivated(WindowEvent obj){}
    public void windowDeiconified(WindowEvent obj){} 
    public void windowIconified(WindowEvent obj){} 
    public void windowClosed(WindowEvent obj){}
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);     // to close the window
    }
    public void windowOpened(WindowEvent obj){}

}

class GUI3
{
    public static void main(String A[])
    {
        MarvellousFrame mobj = new MarvellousFrame("Marvellous");
    }
}