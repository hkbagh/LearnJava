package hkbagh;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class A extends Frame {

    public void paint(Graphics g ){

        Font font = new Font("Arial", Font.BOLD, 30);
        g.setFont(font);

        g.setColor(Color.red);
        g.drawString("Harekrishna Bagh!", 500, 100);
        g.drawString("Vinayak Kumar!", 500, 300);
        g.setColor(Color.blue);
        g.drawRect(200, 200, 100, 100);

        g.setColor(Color.green);
        g.fillOval(300, 300, 100, 100);

        g.setColor(Color.yellow);
        g.drawLine(100, 100, 500, 500);

        g.setColor(Color.pink);
        g.drawArc(400, 400, 100, 100, 45, 90);

        g.setColor(Color.black);
        g.drawPolygon(new int[]{600, 600, 700}, new int[]{100, 300, 100}, 3);

        g.setColor(Color.magenta);
        g.drawRoundRect(500, 500, 100, 100, 20, 20);

        g.setColor(Color.cyan);
        g.fillRoundRect(600, 600, 100, 100, 20, 20);

        g.setColor(Color.orange);
        g.drawOval(700, 700, 100, 100);



}

public static void main(String[] args ){
        A frame = new A();

        frame.setSize(1200, 800);

        frame.setTitle("My First Java Frame");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setBackground(Color.black);
        MyClass myClassListner = new MyClass();
        frame.addWindowListener(myClassListner);
    }
}
class MyClass extends WindowAdapter{

    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}

