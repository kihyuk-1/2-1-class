package dd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JCheckBoxEx  extends JFrame {
	private String[]  names = {"사과" , "배" , "체리"};
	private int[] prices =  {100 , 500 , 20000};
	int sum = 0;
	
	JCheckBoxEx() {
		setTitle("체크박스와 ActionEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(new JLabel("사과 100원 , 배 500원 , 체리 20000원"));
		JLabel sumLabel = new JLabel("현재 0원 입니다.");
		JCheckBox cbApple = new JCheckBox("사과");
		JCheckBox cbPear = new JCheckBox("배");
		JCheckBox cbCherry = new JCheckBox("체리");
		
		
		//사과
		cbApple.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbApple.isSelected() == true)
					sum += prices[0];
				
				else
					sum -= prices[0];
				sumLabel.setText("현재 "  + sum + "원 입니다.");
			}
				
		});
		
		
		this.add(cbApple);
		this.add(cbCherry);
		this.add(sumLabel);
		this.setSize(250, 200);
		
		this.setVisible(true);
	}
	
	public static void main (String [] args) {
		new JCheckBox();
	}
	
}
