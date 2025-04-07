package proj0427;


import java.awt.FlowLayout;
import javax.swing.*;


public class MyFrameEX3 extends JFrame {
	
	public MyFrameEX3 () {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT , 30 , 40));
		this.add(new JButton("add"));
		this.add(new JButton("sub"));
		this.add(new JButton("mul"));
		this.add(new JButton("div"));
		this.add(new JButton("Calculate"));
		
		
		setSize(300 ,200);
		setVisible(true);
	}
	public static void main (String [] args) {
		new MyFrameEX3();
	}
	
}
