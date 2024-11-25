package hkbagh;

import javax.swing.*;
import java.awt.*;

public class IndianFlag extends JFrame {

    public IndianFlag() {
        setTitle("Indian National Flag");
        setSize(800, 600);


        JPanel flagPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                int width = getWidth();
                int height = getHeight();

                // Draw the saffron band
                g.setColor(Color.ORANGE);
                g.fillRect(0, 0, width, height / 3);

                // Draw the white band
                g.setColor(Color.WHITE);
                g.fillRect(0, height / 3, width, height / 3);

                // Draw the green band
                g.setColor(Color.GREEN);
                g.fillRect(0, 2 * height / 3, width, height / 3);

                // Draw the Ashok Chakra
                int chakraRadius = height / 6;
                int chakraCenterX = width / 2;
                int chakraCenterY = height / 2;
                g.setColor(Color.BLUE);
                g.drawOval(chakraCenterX - chakraRadius, chakraCenterY - chakraRadius, 2 * chakraRadius, 2 * chakraRadius);

                // Draw the spokes first
                int spokeCount = 24;
                double angleIncrement = 2 * Math.PI / spokeCount;
                for (int i = 0; i < spokeCount; i++) {
                    double angle = i * angleIncrement;
                    int x1 = chakraCenterX;
                    int y1 = chakraCenterY;
                    int x2 = (int) (chakraCenterX + chakraRadius * Math.cos(angle));
                    int y2 = (int) (chakraCenterY + chakraRadius * Math.sin(angle));
                    g.setColor(Color.BLUE);

                    g.drawLine(x1, y1, x2, y2);
                }

                // Draw the blue circle of the chakra
                }
        };

        add(flagPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new IndianFlag();
    }
}