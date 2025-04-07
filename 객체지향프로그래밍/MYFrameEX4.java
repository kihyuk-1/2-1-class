package proj0427;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class MYFrameEX4 extends  JFrame {

		public MYFrameEX4 () {
			setTitle("BorderLayout Sample");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			this.setLayout(new BorderLayout(30, 20));
			this.add(new JButton("Calculate") , BorderLayout.CENTER);
			this.add(new JButton("add") , BorderLayout.NORTH);
			this.add(new JButton("sub") , BorderLayout.SOUTH);
			this.add(new JButton("mul") , BorderLayout.EAST);
			this.add(new JButton("div") , BorderLayout.WEST);
			
			setSize(300,200); // ������ ũ�� 300x200 ����
			setVisible(true); // �������� ȭ�鿡 ���	
		}
	
		public static void main (String [] args) {
			new  MYFrameEX4();
		}
	
}
