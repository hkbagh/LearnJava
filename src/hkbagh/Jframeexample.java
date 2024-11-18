package hkbagh;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Jframeexample {
    public static void main(String[] args ){

        Frame frame = new Frame();
        frame.setSize(1200, 800);
        frame.setTitle("My First Java Frame");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        MC myClassListner = new MC();
        frame.addWindowListener(myClassListner);
    }
}
class MC extends WindowAdapter{


    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}