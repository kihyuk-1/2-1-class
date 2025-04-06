package 사장;

import java.io.*;

public class 예제8_5 {
	
	public static void main (String [] args) {
		byte b[] = {7,51,3,4,-1,24};
		
		
		try {
			FileOutputStream fout = new FileOutputStream("E:\\부웅\\text.out");
			
			for (int i = 0; i<b.length; i++) 
				fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
				fout.close();

		}
		
		catch (IOException e) {
			System.out.println("E:\\\\부웅\\\\text.out에 저장 할 수 없습니다. 경로명 다시 확인");
		
			return;
		}
		
		System.out.println("E:\\\\\\\\부웅\\\\\\\\text.out에 저장 완료");
	
		
	}
	
	
}
