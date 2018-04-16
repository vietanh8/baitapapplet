package Aplletdemo;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class bai1 extends JApplet {

	/**
	 * Create the applet.
	 */
	int n;
	public void init() {
		String input;
		input = JOptionPane.showInputDialog("Nhap N: ");
		n = Integer.parseInt(input);
	}
	public void paint(Graphics g) {
		for(int i=1;i<=n;i++){
            String d = Integer.toString(i);
            g.drawString(d, i*30, 30);
        }
	}
	

}
