package dd;

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

public class JCompEx extends JFrame {
    JCompEx() {
        this.setTitle("JComponent ���� �޼ҵ� ����");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel pan1 = new JPanel(); // �⺻ ��ġ ������
        JButton btn1 = new JButton("���ڻ�/������ ���� ��ư");
        JButton btn2 = new JButton("��Ȱ��(Disable) ��ư");
        JButton btn3 = new JButton("x,y��ǥ ��ư");
        
        pan1.add(btn1); // �ǳڿ� ���̱�
        pan1.add(btn2);
        pan1.add(btn3);
        
        btn1.setBackground(Color.YELLOW);
        btn1.setForeground(Color.MAGENTA);
        btn2.setEnabled(false);
        
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                JCompEx frame = (JCompEx)b.getTopLevelAncestor();
                frame.setTitle(b.getX() + "," + b.getY()); // Ÿ��Ʋ�� ��ư ��ǥ ���
            }
        });
        
        this.add(pan1);
        this.setSize(260, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JCompEx();
    }
}
