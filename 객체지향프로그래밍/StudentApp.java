package ch7;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class StudentApp extends JFrame {
    ArrayList<Student> studentList = new ArrayList<Student>();

    public StudentApp() {
        this.setTitle("�л����� �ý���");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(6, 2));
        JTextField inName = new JTextField("");
        JTextField inHb = new JTextField("");
        JTextField inDept = new JTextField("");
        JTextField inGwa = new JTextField("");

        JButton btnIn = new JButton("�Է�");
        JButton btnCancel = new JButton("���");
        JButton btnSave = new JButton("��ȸ �� ���� ����");
        JButton btnSelect = new JButton("�̸����� �˻�");

        this.add(new Label("�̸�"));
        this.add(inName);

        this.add(new Label("�й�"));
        this.add(inHb);

        this.add(new Label("�а�"));
        this.add(inDept);

        this.add(new Label("����"));
        this.add(inGwa);

        this.add(btnIn);
        this.add(btnCancel);
        this.add(btnSave);
        this.add(btnSelect);

        this.setSize(300, 200);
        this.setVisible(true);

        // �Է� �̺�Ʈ
        btnIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strName = inName.getText();
                String strHb = inHb.getText();
                String strDept = inDept.getText();
                String strGwa = inGwa.getText();
                studentList.add(new Student(strName, strHb, strDept, strGwa));
                System.out.println(strName + " �Է� �Ϸ�");
                System.out.println(strHb + " �Է� �Ϸ�");
                System.out.println(strDept + " �Է� �Ϸ�");
                System.out.println(strGwa + " �Է� �Ϸ�");
            }
        });

        // ��ȸ �� ���� �̺�Ʈ
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	try {
                FileWriter fout = new FileWriter("c:\\�����й�.txt");
            	for (Student one : studentList) {
                    fout.write(one.getName() + " , "  + one.getHb() + " , "  + one.getDept() + " , "  + " , " + one.getGwamok() + "\n");
            		System.out.println(one);
         
                }
           		System.out.println("������ ���� �Ϸ� �Ǿ����ϴ�.");
           		fout.close();
            	}
            	catch (IOException e1) {
            		e1.printStackTrace();
            		System.out.println("���� ���� ����");
            	}
            }
        });

        // �̸����� �˻� �̺�Ʈ (�� �κ��� �߰��� ������ �ʿ��մϴ�)
        btnSelect.addActionListener(new ActionListener() {
        	@Override
        	
        	
        });
        
        
        
        
        // ���
        btnCancel.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		inName.setText("");
         		inHb.setText("");
         		inDept.setText("");
         		inGwa.setText("");
                
                 
        
                  
        	}

		
        	
        });
        
    }

    public static void main(String[] args) {
        new StudentApp();
    }
}
