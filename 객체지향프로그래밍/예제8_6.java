package 사장;

import java.io.*;
import java.io.IOException;

public class 예제8_6 {

	public static void main (String [] args) {
		byte b[] = new byte [6];
		
		
		try {
			FileInputStream fin = new FileInputStream("E:\\부웅\\text.out");
			int n =0 , c;
			
			while((c= fin.read()) != -1) {
				b[n] = (byte)c;
				n++;
			}
			
			System.out.println("E:\\\\부웅\\\\text.out에서 읽은 배열을 출력합니다.");
			for (int i = 0; i < b.length; i++) System.out.print(b[i] + " ");
			System.out.println();
			fin.close();
			

		}
		
		catch (IOException e) {
			System.out.println("E:\\\\부웅\\\\text.out 경로명 다시 확인");

		}
	
		
	}
	
}
