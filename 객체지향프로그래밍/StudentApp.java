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
        this.setTitle("학생관리 시스템");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(6, 2));
        JTextField inName = new JTextField("");
        JTextField inHb = new JTextField("");
        JTextField inDept = new JTextField("");
        JTextField inGwa = new JTextField("");

        JButton btnIn = new JButton("입력");
        JButton btnCancel = new JButton("취소");
        JButton btnSave = new JButton("조회 및 파일 저장");
        JButton btnSelect = new JButton("이름으로 검색");

        this.add(new Label("이름"));
        this.add(inName);

        this.add(new Label("학번"));
        this.add(inHb);

        this.add(new Label("학과"));
        this.add(inDept);

        this.add(new Label("과목"));
        this.add(inGwa);

        this.add(btnIn);
        this.add(btnCancel);
        this.add(btnSave);
        this.add(btnSelect);

        this.setSize(300, 200);
        this.setVisible(true);

        // 입력 이벤트
        btnIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strName = inName.getText();
                String strHb = inHb.getText();
                String strDept = inDept.getText();
                String strGwa = inGwa.getText();
                studentList.add(new Student(strName, strHb, strDept, strGwa));
                System.out.println(strName + " 입력 완료");
                System.out.println(strHb + " 입력 완료");
                System.out.println(strDept + " 입력 완료");
                System.out.println(strGwa + " 입력 완료");
            }
        });

        // 조회 및 저장 이벤트
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	try {
                FileWriter fout = new FileWriter("c:\\본인학번.txt");
            	for (Student one : studentList) {
                    fout.write(one.getName() + " , "  + one.getHb() + " , "  + one.getDept() + " , "  + " , " + one.getGwamok() + "\n");
            		System.out.println(one);
         
                }
           		System.out.println("파일이 저장 완료 되었습니다.");
           		fout.close();
            	}
            	catch (IOException e1) {
            		e1.printStackTrace();
            		System.out.println("파일 저장 에러");
            	}
            }
        });

        // 이름으로 검색 이벤트 (이 부분은 추가로 구현이 필요합니다)
        btnSelect.addActionListener(new ActionListener() {
        	@Override
        	
        	
        });
        
        
        
        
        // 취소
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
