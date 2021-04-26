import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class HelloComponent2 extends JComponent implements MouseMotionListener{
    String theMessage;
    // Coordinates of the message
    int messageX = 125, messageY=95;

    public HelloComponent2(String message){
        theMessage = message;
        addMouseMotionListener(this);
    }
    public void paintComponent(Graphics g){
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e){
        messageX = e.getX();
        messageY = e.getY();
        System.out.println(messageX + " is X and  Y " + messageY);
        repaint();
    }

    public void mouseMoved(MouseEvent e){
        
    }

}
