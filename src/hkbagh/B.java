package hkbagh;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class B extends Frame {

    public void paint(Graphics g ){

        Font font = new Font("Arial", Font.BOLD, 30);
        g.setFont(font);

        g.setColor(Color.blue);
        g.drawString("India", 800, 100);
        g.setColor(Color.black);
        g.drawRect(100, 200, 600, 200);
        g.setColor(Color.orange);
        g.fillRect(100, 200, 600, 200);
        g.setColor(Color.white);
        g.fillRect(100, 400, 600, 200);
        g.setColor(Color.green);
        g.fillRect(100, 600, 600, 200);




    }

    public static void main(String[] args ){
        B frame = new B();

        frame.setSize(1200, 800);

        frame.setTitle("My First Java Frame");
        
        frame.setVisible(true);
        frame.setBackground(Color.white);
        MyClass myClassListner = new MyClass();
        frame.addWindowListener(myClassListner);
    }
}


