package dd;

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

public class JCompEx extends JFrame {
    JCompEx() {
        this.setTitle("JComponent 공통 메소드 예제");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel pan1 = new JPanel(); // 기본 배치 관리자
        JButton btn1 = new JButton("글자색/바탕색 설정 버튼");
        JButton btn2 = new JButton("비활성(Disable) 버튼");
        JButton btn3 = new JButton("x,y좌표 버튼");
        
        pan1.add(btn1); // 판넬에 붙이기
        pan1.add(btn2);
        pan1.add(btn3);
        
        btn1.setBackground(Color.YELLOW);
        btn1.setForeground(Color.MAGENTA);
        btn2.setEnabled(false);
        
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                JCompEx frame = (JCompEx)b.getTopLevelAncestor();
                frame.setTitle(b.getX() + "," + b.getY()); // 타이틀에 버튼 좌표 출력
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
