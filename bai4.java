package Aplletdemo;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class bai4 extends Applet implements KeyListener{
	
	private JTextField tfnum;
	JPanel p= new JPanel();
	int num;
	int solanthu=3;
	String kq="";

	public void init() {
      p.setLayout(new GridLayout(3,3));
		
		JLabel lblonS = new JLabel("Guess the number");
		p.add(lblonS);
		
		JLabel lblNhpS = new JLabel("Enter 1-9");
		p.add(lblNhpS);
		
		setRandomNum();
		
		tfnum = new JTextField();
		tfnum.addKeyListener(this);
		p.add(tfnum);
		tfnum.setColumns(10);
		this.setSize(500, 300);
		add(p,BorderLayout.PAGE_START);
	}
public void keyTyped(KeyEvent e) {
	      }

public void keyPressed(KeyEvent e) {
	        if(e.getKeyCode()==KeyEvent.VK_ENTER) {
	        	try {
	        	if(Integer.parseInt(tfnum.getText())==num) {
	        	kq="Congraturation!";
	        	setRandomNum();
	        	solanthu=3;
	        }
	        else {
	        	kq="False, You have "+String.valueOf(solanthu)+" try!";
	        	solanthu--;
	        	if (solanthu==0) {
	        		kq="Game Over";
	        		setRandomNum();
	        		solanthu=3;
	        	}
	        }
	        	
	    repaint();
	        }
	   catch(NumberFormatException e1) {
		   JOptionPane.showMessageDialog(null,"Enter again");
	   }
}
}
public void keyReleased(KeyEvent e) {
	      }   
public void paint(Graphics g) {
	super.paint(g);
	g.drawString(kq, 190, 100);
}
public void setRandomNum(){
	Random rd= new Random();
	num= rd.nextInt(10);
}
}