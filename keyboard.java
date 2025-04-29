import.java.awt.*;
import.java.applet.*;
import.java.awt.event.*;
public class keyboard extends Applet implements KeyListener
{
    int x1=20,y1=100;
    public void init()
    {
        addKeyListener(this);
        requestFocus();
    }
    public void KeyClicked(KeyEvent ke)
    {
        showStatus("Key is pressed");
    }
    public void KeyReleased(KeyEvent ke)
    {
        showStatus ("Key Released");
    }
    public void keytyped(KeyEvent ke)
    {
        repaint();
    }                       
    public void paint(Graphics g)
    {
        g.drawOval(x1,y1,100,100);
        x1+=20;
    }
}