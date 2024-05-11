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

class MarvellousListener extends WindowAdapter
{
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);     // to close the window
    }
}

class GUI4
{
    public static void main(String A[])
    {
        MarvellousFrame mobj = new MarvellousFrame("Marvellous");
    }
}