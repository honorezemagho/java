import javax.swing.*;

public class HelloJava {
    public static void main(String[] args){
        System.out.println("Hello world from java");
        JFrame frame = new JFrame( "Hello, Java!" );
        JLabel label = new JLabel("Hello Java", JLabel.CENTER);
        frame.add(label);
        frame.add(new HelloComponent());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 300, 300 );
        frame.setVisible( true );
    }
}
