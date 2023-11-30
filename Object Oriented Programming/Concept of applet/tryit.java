import java.applet.Applet;
	import java.awt.*;

import javax.swing.JApplet;
import javax.swing.JFrame;
public class tryit extends JApplet
	{
	public void paint(Graphics g)
	{
	g.setColor(Color.red);
	g.drawString("Welcome",50, 50);
	g.drawLine(20,30,20,300);
	g.drawRect(70,100,30,30);
	g.fillRect(170,100,30,30);
	g.drawOval(70,200,30,30);
	g.setColor(Color.pink);
	g.fillOval(170,200,30,30);
	g.drawArc(90,150,30,30,30,270);
	g.fillArc(270,150,30,30,0,180);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Smiling Face Applet");
        JApplet applet = new tryit();
        frame.getContentPane().add(BorderLayout.CENTER, applet);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        applet.init();
        applet.start();
	}

	}

