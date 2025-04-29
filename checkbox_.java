import java.awt.*;
import javax.swing.*;
public class checkbox_ extends Japplet
{
    Jcheckbox c1, c2, c3;
    public void init()
    {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cb= new Jcheckbox("C");
        cb2= new Jcheckbox("C++");
        cb3= new Jcheckbox("Java");

        c1.add(cb);
        c1.add(cb2);
        c1.add(cb3);
    }
}