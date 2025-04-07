package proj0427;


import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class MyFrameEX2 extends JFrame {
	
	
	// 생성자 
	MyFrameEX2() {
		setTitle("나의 첫 GUI 프로그래밍");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		JButton btn1 = new JButton("확인");
		btn1.setBackground(Color.pink);
		
		this.add(btn1);
		this.add(new JButton("취소"));
		this.add(new JButton("삭제"));
		
	
		
		this.setSize(300, 200);
		this.setVisible(true);
	
	}
	


	
	public static void main (String [] args) {
		//  MyFrameEX2  frame = new   MyFrameEX2();
			new MyFrameEX2();		
		
		
		
		}
		
		
	}

