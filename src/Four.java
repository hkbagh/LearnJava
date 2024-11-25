import java.awt.*;
import java.awt.event.*; // Import event package

public class Four {

    public static void main(String[] args) {
        // Create a Frame (Main Window)
        Frame frame = new Frame("Create Panels");

        // Create Panels
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();

        // Create buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        // Add Buttons to Panels
        panel1.add(button1);
        panel1.add(button2);

        panel2.add(button3);

        // Add Panels to Frame using BorderLayout
        frame.add(panel1, BorderLayout.NORTH); // Add panel1 to the top
        frame.add(panel2, BorderLayout.SOUTH); // Add panel2 to the bottom

        // Set Frame Size and Visibility
        frame.setSize(400, 300);
        frame.setVisible(true);

        // Add the WindowListener to the Frame
        frame.addWindowListener(new myclass());
    }

    // Create a class to implement the WindowListener interface
    static class myclass extends WindowAdapter {

        public void windowClosing(WindowEvent e) {
            System.exit(0); // Close the application
        }
    }
}