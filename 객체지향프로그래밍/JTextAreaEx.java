package dd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JTextAreaEx extends JFrame {
	JTextAreaEx() {
		setTitle("JTextArea 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		JTextField tf = new JTextField(20);
		JTextArea ta = new JTextArea(7 , 20);
		
		this.add(tf);
		this.add(ta);
		
		tf.addActionListener(new ActionListener()  {
			@Override
			public void actionPerformed(ActionEvent e ) {
				ta.append(tf.getText() + "\n");
				tf.setText("");
			}		
		});
		
		setSize(300 , 300);
		setVisible(true);

		
	}
	
	public static void main (String [] args) {
		new JTextAreaEx();
	}
}
