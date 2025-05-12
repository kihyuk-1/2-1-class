package dd;

import javax.swing.*;
import java.awt.*;

public class JLabelEx extends JFrame {
    JLabelEx() {
        this.setTitle("레이블 예제");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // 텍스트 레이블 추가
        JLabel lbtxt = new JLabel("사랑해");

        // 이미지 아이콘 경로 수정: 실제 이미지 경로로 수정 필요
        ImageIcon img = new ImageIcon("C:\\Users\\313\\Downloads\\dd.png"); // 실제 이미지 파일 경로로 수정

        // 이미지 레이블 추가
        JLabel lbimg = new JLabel(img);  // ImageIcon을 JLabel에 설정

        // 전화기 이미지 아이콘 생성 및 버튼 설정
        ImageIcon phoneImg = new ImageIcon("C:\\Users\\313\\Desktop\\dd\\phone.jpg"); // 실제 이미지 파일 경로로 수정
        JButton btn = new JButton("따르릉", phoneImg);

        // 프레임에 컴포넌트 추가
        this.add(lbtxt);
        this.add(lbimg);
        this.add(btn);

        // 프레임 크기 설정
        this.setSize(400, 600);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JLabelEx();
    }
}
