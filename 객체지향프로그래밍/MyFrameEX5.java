package proj0427;



import javax.swing.*;
import java.awt.*;



public class MyFrameEX5 extends JFrame {
	
	public  MyFrameEX5 () {
	setTitle("GridLayoutEx");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	GridLayout grid = new GridLayout(5,2);
	grid.setVgap(5);
	
	
	this.setLayout(grid);
	this.add(new JLabel("�̸�"));
	this.add(new JTextField(""));
	
	this.add(new JLabel("�й�"));
	this.add(new JTextField(""));
	
	this.add(new JLabel("�а�"));
	this.add(new JTextField(""));
	
	this.add(new JLabel("����"));
	this.add(new JTextField(""));
	
	this.add(new JButton("Ȯ��"));
	this.add(new JButton("���"));
	
	setSize(300 ,200);
	setVisible(true);
	
	}
	
	public static void main (String [] args) {
		new MyFrameEX5();
	}
	
}
