import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class Shapes extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(Color.gray);

		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200);
		g2.fill(circle);
        
        Ellipse2D.Double circle2 = new Ellipse2D.Double(250, 40, 50, 150);
        g2.fill(circle2);
        
        Ellipse2D.Double circle3 = new Ellipse2D.Double(90, 40, 50, 150);
        g2.fill(circle3);
        g2.setColor(Color.white);
        Ellipse2D.Double circle4 = new Ellipse2D.Double(215, 150, 50, 50);
        g2.fill(circle4);
        g2.setColor(Color.black);
        Ellipse2D.Double circle5 = new Ellipse2D.Double(230, 160, 25, 25);
        g2.fill(circle5);
        g2.setColor(Color.white);
        Ellipse2D.Double circle6 = new Ellipse2D.Double(140, 150, 50, 50);
        g2.fill(circle6);
        g2.setColor(Color.black);
        Ellipse2D.Double circle7 = new Ellipse2D.Double(155, 160, 25, 25);
        g2.fill(circle7);
	}
}
