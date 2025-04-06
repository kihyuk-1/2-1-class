package 사장;

import java.io.*;


public class 예제8_11 {
	public static void main (String [] args) {
		File src = new File("E:\\부웅\\시바견2.jpg"); // 원본 파일 경로명		
		File dest = new File("E:\\부웅2\\시바견2.jpg"); // 복사 파일 경로명 
		int c;
		
		
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			byte[] buf = new byte [1024*10]; // 10KB 버퍼
			
		
			while(true) { // 문자 하나 읽고
				int n = fi.read(buf); // 버퍼 크기만큼 읽기. n은 실제 읽은 바이트 
				fo.write(buf , 0 , n); // buf[0]부터 n 바이트 쓰기
				if (n < buf.length)
					break;
			
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
