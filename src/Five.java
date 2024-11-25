import java.awt.*;
import java.awt.event.*; // Import event package

public class Five {

    public static void main(String[] args) {
        // Create a Frame (Main Window)
        Frame frame = new Frame("canvas");

        // Set Frame Size and Visibility
        frame.setSize(400, 300);
        frame.setVisible(true);

        // Create a Canvas
        Canvas canvas = new Canvas();
        canvas.setSize(100, 200);
        canvas.setBackground(Color.black);

        // Add the Canvas to the Frame
        frame.add(canvas);

        // Add the WindowListener to the Frame
        frame.addWindowListener(new Four.myclass());
    }


}