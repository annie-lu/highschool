package pipes;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Pipes extends JFrame {

	public Pipes() {

		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().setBackground(Color.BLACK);

		setLocationRelativeTo(null);

	}

	public void drawLines(Graphics g, Color c, Queue<Line2D> q) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(c);
		g2d.setStroke(new BasicStroke(6));

		int x1 = (int) (Math.random() * (300)) - 6;
		int y1 = (int) (Math.random() * (300)) + 6;
		int x2;
		int y2;
		int random = (int) (Math.random() * 10) + 5;
		
		for (int x = 0; x < random; x++) {
			x2 = (int) (Math.random() * (501));
			y2 = (int) (Math.random() * (501));
			Line2D line = new Line2D.Double(x1, y1, x2, y2);
			g2d.draw(line);
			q.add(line);
			x1 = x2;
			y1 = y2;
			
			try {
				Thread.sleep(500); // 500 milliseconds is one second.
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}

	}

	public void removeLines(Graphics g, Color c, Queue<Line2D> q) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(c);
		g2d.setStroke(new BasicStroke(6));

		for (int x = 0; x < q.size(); x++) {

			Line2D line = q.remove();
			g2d.draw(line);
			q.add(line);
			
			try {
				Thread.sleep(500); // 1000 milliseconds is one second.
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}

	}

	public void paint(Graphics g) {
		super.paint(g);
		Queue lines = new LinkedList<Line2D.Double>();
		drawLines(g, Color.WHITE, lines);
		removeLines(g, Color.BLACK, lines);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Pipes().setVisible(true);
			}
		});
	}
	
}
