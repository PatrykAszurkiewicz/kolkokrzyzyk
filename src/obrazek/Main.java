package obrazek;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Main {

	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI(); 
	            }
	        });
	}
	 private static void createAndShowGUI() { //ustawienie gui
	        JFrame f = new JFrame("KÓ£KO KRZY¯YK"); //tytu³ okna
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //zakoñcz program na wyjœciu z okna
	        f.add(new MyPanel());
	        f.pack();
	        f.setVisible(true);
	    }
	}
class MyPanel extends JPanel {

    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize() {
        return new Dimension(1920,1080); //ustala rozdzielczoœæ okna
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
       Graphics2D g2d = (Graphics2D) g;
       g2d.setColor(new Color(64,196,78)); //zmiana koloru
       g2d.fillRect(0,800,1920,280);//trawa
       g2d.setColor(new Color(64,100,196));
       g2d.fillRect(0,0,1920,800);//niebo
       g2d.setColor(new Color(183,64,196));
       g2d.fillRect(550, 200, 10, 600); //kreska pionowa 1
       g2d.fillRect(750, 200, 10, 600); //kreska pionowa 2
       g2d.fillRect(350, 400, 600, 10); //kreska pozioma 1
       g2d.fillRect(350, 600, 600, 10); //kreska pozioma 2
       
       g2d.setColor(new Color(220,220,220));
       g2d.fillOval(375, 225, 150, 150); //kó³ko
       g2d.fillOval(785, 225, 150, 150); //kó³ko
       g2d.setColor(new Color(111,111,111));
       g2d.setStroke(new BasicStroke(10));
       g2d.draw(new Line2D.Float(800, 650, 900, 750));//krzy¿yk
       g2d.setStroke(new BasicStroke(10));
       g2d.draw(new Line2D.Float(800, 750, 900, 650));//krzy¿yk
    
    }

}
