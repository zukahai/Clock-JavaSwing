package Clock;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Clock extends JFrame{
	Container cn;
	public Clock() {
		super("Clock");
		cn = init();
	}
	
	public Container init() {
		Container cn = this.getContentPane(); 
//		this.setVisible(true);
		this.setSize(500, 500);
//		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.show();
		return cn;
	}
	
	public void paint(Graphics g) {
		setBackground(Color.red); 
		for (int i = 0; i <= 10; i++) {
			g.drawOval(100 + i, 100 + i, 300 - 2 * i, 300 - 2 * i);
		}
		for (int i = 0; i <= 11; i++) {
			for (float j = (float) - 0.3; j <= 0.3; j += 0.1) {
				int x1, y1, x2, y2;
				x1 = (int) (140 * Math.sin(Math.toRadians(i * 30 + j)));
				y1 = (int) (140 * Math.cos(Math.toRadians(i * 30 + j)));
				x2 = (int) (120 * Math.sin(Math.toRadians(i * 30 + j)));
				y2 = (int) (120 * Math.cos(Math.toRadians(i * 30 + j)));
				g.drawLine(x1 + 250, y1 + 250, x2 + 250, y2 + 250);
			}
		}
		for (int i = 0; i <= 59; i++) {
			int x1, y1, x2, y2;
			x1 = (int) (140 * Math.sin(Math.toRadians(i * 6)));
			y1 = (int) (140 * Math.cos(Math.toRadians(i * 6)));
			x2 = (int) (130 * Math.sin(Math.toRadians(i * 6)));
			y2 = (int) (130 * Math.cos(Math.toRadians(i * 6)));
			g.drawLine(x1 + 250, y1 + 250, x2 + 250, y2 + 250);
		}
		g.fillOval(245, 245, 10, 10);
//		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		new Clock();
	}
}
