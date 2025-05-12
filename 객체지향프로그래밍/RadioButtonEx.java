package dd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonEx extends JFrame {
    JRadioButton[] radio = new JRadioButton[3];
    String[] text = {"사과", "배", "체리"};
    ImageIcon[] image = {
            new ImageIcon("C:\\Users\\313\\Downloads\\dd.png"),
            new ImageIcon("C:\\Users\\313\\Downloads\\dd.png"),
            new ImageIcon("C:\\Users\\313\\Downloads\\dd.png")
    };

    private JLabel imageLabel = new JLabel();

    RadioButtonEx() {
        this.setTitle("라디오버튼 액션이벤트 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel radioPanel = new JPanel(); // 기본이 FlowLayout
        radioPanel.setBackground(Color.GRAY);
        ButtonGroup btngroup = new ButtonGroup();
        
        // 라디오 버튼 및 이벤트 처리
        for (int i = 0; i < radio.length; i++) {
            radio[i] = new JRadioButton(text[i]);
            btngroup.add(radio[i]);
            radioPanel.add(radio[i]);
            
            // 각 라디오 버튼에 ActionListener 추가
            final int index = i;  // 람다 표현식에서 인덱스를 사용할 수 있게 하기 위한 방법
            radio[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageLabel.setIcon(image[index]);
                }
            });
        }

        // 기본 선택된 버튼과 이미지 설정
        radio[2].setSelected(true);  // "체리"를 기본으로 선택
        imageLabel.setIcon(image[2]); // "체리" 이미지 기본으로 표시

        // 레이아웃에 추가
        this.add(radioPanel, BorderLayout.NORTH);
        this.add(imageLabel, BorderLayout.CENTER);  // 이미지 레이블을 프레임에 추가

        this.setSize(400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonEx();
    }
}
