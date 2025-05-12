package dd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBoxEx extends JFrame {
	JComboBoxEx() {
		this.setTitle("JComboBox ¿¹Á¦");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		String[] fruits = {"apple" , "banana" , "kiwi" , "mango"
				, "pear" , "peach" , "berry" , "strawberry" , "blackberry"};
		JComboBox<String> strCombo = new JComboBox<String> (fruits);
		
		
		strCombo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(strCombo.getSelectedItem() + " , " +
			strCombo.getSelectedIndex()); 
				
			}
			
			
			
		});
		
		
		this.add(strCombo);
		setSize(300, 300);
		setVisible(true);
	
	}
	
	
	public static void main (String [] args) {
		new JComboBoxEx();
	}
}
