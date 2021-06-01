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
	Timer timer;
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
		
		timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaint();
			}
		});
		
		return cn;
	}
	
	public void paint(Graphics g) {
		g.clearRect(0, 0, 600, 600);
		g.setFont(new Font("UTM Nokia", 1, 30));
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
//		g.drawString(getTime(), 50, 500);
//		System.out.println(getTime());
		
		String s[] = getTime().split(":");
		int t = Integer.parseInt(s[0]) * 3600 + Integer.parseInt(s[1]) * 60 + Integer.parseInt(s[2]);
		t %= 43200;
		float ss = t % 60;
		int x1, y1, x2, y2;
		x1 = (int) + (120 * Math.sin(Math.toRadians(ss * 6)));
		y1 = (int) - (120 * Math.cos(Math.toRadians(ss * 6)));
		g.drawLine(250, 250, x1 + 250, y1 + 250);
		
		ss = (float) ((t / 60) % 60 + (t % 60) / 60.0);
		x1 = (int) + (100 * Math.sin(Math.toRadians(ss * 6)));
		y1 = (int) - (100 * Math.cos(Math.toRadians(ss * 6)));
		g.drawLine(250, 250, x1 + 250, y1 + 250);
		
		ss = (float) (t / 3600.0);
		x1 = (int) + (80 * Math.sin(Math.toRadians(ss * 30)));
		y1 = (int) - (80 * Math.cos(Math.toRadians(ss * 30)));
		g.drawLine(250, 250, x1 + 250, y1 + 250);
		
//		System.out.println(ss);
	}
	
	public String getTime() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:SS");
		return sdf.format(cal.getTime());
	}
	
	public static void main(String[] args) {
		new Clock().timer.start();
	}
}
