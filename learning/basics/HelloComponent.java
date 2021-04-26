import java.awt.*;

import javax.swing.JComponent;

public class HelloComponent extends JComponent{
    public void paintcomponent(Graphics g){
        g.drawString("Hello Java", 125, 95);
    }
}
