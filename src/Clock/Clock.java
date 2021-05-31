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
		g.drawLine(0, 0, 100, 100);
//		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		new Clock();
	}
}
