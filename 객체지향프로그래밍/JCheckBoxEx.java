package dd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JCheckBoxEx  extends JFrame {
	private String[]  names = {"���" , "��" , "ü��"};
	private int[] prices =  {100 , 500 , 20000};
	int sum = 0;
	
	JCheckBoxEx() {
		setTitle("üũ�ڽ��� ActionEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(new JLabel("��� 100�� , �� 500�� , ü�� 20000��"));
		JLabel sumLabel = new JLabel("���� 0�� �Դϴ�.");
		JCheckBox cbApple = new JCheckBox("���");
		JCheckBox cbPear = new JCheckBox("��");
		JCheckBox cbCherry = new JCheckBox("ü��");
		
		
		//���
		cbApple.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbApple.isSelected() == true)
					sum += prices[0];
				
				else
					sum -= prices[0];
				sumLabel.setText("���� "  + sum + "�� �Դϴ�.");
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
