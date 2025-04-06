package 사장;

import java.io.*;

public class 예제8_10 {
	public static void main (String [] args) {
		File src = new File("E:\\부웅\\시바견.jpg"); // 원본 파일 경로명		
		File dest = new File("E:\\부웅2\\시바견.jpg"); // 복사 파일 경로명 
		int c;
		
		
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			while((c = fi.read()) != -1) { // 문자 하나 읽고
				fo.write((byte)c); // 문자 하나 쓰고
			}
			fi.close();
			fo.close();
			
			System.out.println(src.getPath() + "를" + dest.getPath() + " 로 복사하였습니다.");
						
		}	
			catch (IOException e) {
				System.out.println("파일 복사 오류");
			}
	}
}
