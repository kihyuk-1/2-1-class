package dd;

import javax.swing.*;
import java.awt.*;

public class JLabelEx extends JFrame {
    JLabelEx() {
        this.setTitle("���̺� ����");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // �ؽ�Ʈ ���̺� �߰�
        JLabel lbtxt = new JLabel("�����");

        // �̹��� ������ ��� ����: ���� �̹��� ��η� ���� �ʿ�
        ImageIcon img = new ImageIcon("C:\\Users\\313\\Downloads\\dd.png"); // ���� �̹��� ���� ��η� ����

        // �̹��� ���̺� �߰�
        JLabel lbimg = new JLabel(img);  // ImageIcon�� JLabel�� ����

        // ��ȭ�� �̹��� ������ ���� �� ��ư ����
        ImageIcon phoneImg = new ImageIcon("C:\\Users\\313\\Desktop\\dd\\phone.jpg"); // ���� �̹��� ���� ��η� ����
        JButton btn = new JButton("������", phoneImg);

        // �����ӿ� ������Ʈ �߰�
        this.add(lbtxt);
        this.add(lbimg);
        this.add(btn);

        // ������ ũ�� ����
        this.setSize(400, 600);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JLabelEx();
    }
}
