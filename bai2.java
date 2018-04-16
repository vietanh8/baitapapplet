package Aplletdemo;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class bai2 extends JApplet {

	int n;
	public void init() {
		String input;
		input = JOptionPane.showInputDialog("Nhap N: ");
		n = Integer.parseInt(input);
	}
	public void paint(Graphics g) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				g.drawString(" * ",j*10, i*10);
		}
	}

}
