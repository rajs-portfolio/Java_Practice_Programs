import java.awt.*;
import java.applet.Applet;

public class trivial_applet extends Applet {
    public void paint(Graphics g) {
        // g.drawString("Hello Ayan", 100, 200);
        // g.drawLine(200, 50, 400, 300);
        g.drawRect(100, 50, 500, 300);
        g.fillRect(100, 50, 500, 300);
    }
}
