package proj0427;


import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class MyFrameEX2 extends JFrame {
	
	
	// ������ 
	MyFrameEX2() {
		setTitle("���� ù GUI ���α׷���");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Ȯ��");
		btn1.setBackground(Color.pink);
		
		this.add(btn1);
		this.add(new JButton("���"));
		this.add(new JButton("����"));
		
	
		
		this.setSize(300, 200);
		this.setVisible(true);
	
	}
	


	
	public static void main (String [] args) {
		//  MyFrameEX2  frame = new   MyFrameEX2();
			new MyFrameEX2();		
		
		
		
		}
		
		
	}

