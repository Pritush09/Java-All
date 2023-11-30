import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Asg12b extends JApplet {

    private double doorAngle = 0; // Initial angle of the door
    private Timer timer;

    @Override
    public void init() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Toggle the door angle between open and closed
                doorAngle = (doorAngle == 0) ? Math.PI / 2 : 0;
                repaint();
            }
        });
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw the house
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 200, 150);

        // Draw the door frame
        g.setColor(Color.GRAY);
        g.fillRect(120, 50, 60, 150);

        // Draw the door
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.ORANGE);

        // Rotate the graphics context to simulate the door opening and closing
        g2d.rotate(doorAngle, 150, 125);
        g2d.fillRect(120, 50, 60, 150);

        // Reset the rotation for future drawings
        g2d.rotate(-doorAngle, 150, 125);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swinging Door Applet");
        JApplet applet = new Asg12b();
        frame.getContentPane().add(BorderLayout.CENTER, applet);
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        applet.init();
    }
}

