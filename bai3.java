package Aplletdemo;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class bai3 extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a;
	int b;
	int tong;
	int hieu;
	int tich;
	float thuong;
	public void init() {
		String input1;
		input1 = JOptionPane.showInputDialog("Nhập a: ");
		String input2;
		input2 = JOptionPane.showInputDialog("Nhập b: ");
		a = Integer.parseInt(input1);
		b = Integer.parseInt(input2);
	}
	public void paint(Graphics g) {
		tong=a+b;
		hieu=a-b;
		tich=a*b;
		thuong=a/b;
		String s0 = Integer.toString(tong);
		String s1 = Integer.toString(hieu);
		String s2 = Integer.toString(tich);
		String s3 = Float.toString(thuong);
		g.drawString("Tổng:", 10, 25);
		g.drawString(s0, 60, 25);
		g.drawString("Hiệu:", 10, 50);
		g.drawString(s1, 60, 50);
		g.drawString("Tích:", 10, 75);
		g.drawString(s2, 60, 75);
		g.drawString("Thương:", 10, 100);
		g.drawString(s3, 60, 100);
	}
	

}
