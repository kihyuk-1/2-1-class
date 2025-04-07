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
		this.add(new JLabel("사용자(ID)"));
		this.add(new JTextField(""));
		
		this.add(new JLabel("비밀번호"));
		this.add(new JPasswordField(""));
		

		this.add(new JButton("확인"));
		this.add(new JButton("취소"));
		
		setSize(300 ,200);
		setVisible(true);
	}
	
	
	public static void main (String [] args) {
		new LoginMain();
	}
	
	
}
