package proj0427;

import javax.swing.*;
import java.awt.*;

public class LoginMain extends JFrame  {
	public LoginMain () {
		setTitle("LOGIN FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout grid = new GridLayout(3,3);
		grid.setVgap(5);
	
		this.setLayout(grid);
		this.add(new JLabel("�����(ID)"));
		this.add(new JTextField(""));
		
		this.add(new JLabel("��й�ȣ"));
		this.add(new JPasswordField(""));
		

		this.add(new JButton("Ȯ��"));
		this.add(new JButton("���"));
		
		setSize(300 ,200);
		setVisible(true);
	}
	
	
	public static void main (String [] args) {
		new LoginMain();
	}
	
	
}
