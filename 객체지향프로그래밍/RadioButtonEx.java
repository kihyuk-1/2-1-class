package dd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonEx extends JFrame {
    JRadioButton[] radio = new JRadioButton[3];
    String[] text = {"���", "��", "ü��"};
    ImageIcon[] image = {
            new ImageIcon("C:\\Users\\313\\Downloads\\dd.png"),
            new ImageIcon("C:\\Users\\313\\Downloads\\dd.png"),
            new ImageIcon("C:\\Users\\313\\Downloads\\dd.png")
    };

    private JLabel imageLabel = new JLabel();

    RadioButtonEx() {
        this.setTitle("������ư �׼��̺�Ʈ ����");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel radioPanel = new JPanel(); // �⺻�� FlowLayout
        radioPanel.setBackground(Color.GRAY);
        ButtonGroup btngroup = new ButtonGroup();
        
        // ���� ��ư �� �̺�Ʈ ó��
        for (int i = 0; i < radio.length; i++) {
            radio[i] = new JRadioButton(text[i]);
            btngroup.add(radio[i]);
            radioPanel.add(radio[i]);
            
            // �� ���� ��ư�� ActionListener �߰�
            final int index = i;  // ���� ǥ���Ŀ��� �ε����� ����� �� �ְ� �ϱ� ���� ���
            radio[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageLabel.setIcon(image[index]);
                }
            });
        }

        // �⺻ ���õ� ��ư�� �̹��� ����
        radio[2].setSelected(true);  // "ü��"�� �⺻���� ����
        imageLabel.setIcon(image[2]); // "ü��" �̹��� �⺻���� ǥ��

        // ���̾ƿ��� �߰�
        this.add(radioPanel, BorderLayout.NORTH);
        this.add(imageLabel, BorderLayout.CENTER);  // �̹��� ���̺��� �����ӿ� �߰�

        this.setSize(400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonEx();
    }
}
