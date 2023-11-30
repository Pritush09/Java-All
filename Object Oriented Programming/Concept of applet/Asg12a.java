import javax.swing.*;
import java.awt.*;

public class Asg12a extends JApplet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw face
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        // Draw eyes
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 25, 25);
        g.fillOval(175, 100, 25, 25);

        // Draw mouth (smile)
        g.drawArc(100, 125, 100, 50, 0, -180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiling Face Applet");
        JApplet applet = new Asg12a();
        frame.getContentPane().add(BorderLayout.CENTER, applet);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        applet.init();
        applet.start();
    }
}
