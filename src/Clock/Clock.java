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
		g.drawOval(100, 100, 300, 300);
		g.drawOval(101, 101, 298, 298);
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		new Clock();
	}
}
