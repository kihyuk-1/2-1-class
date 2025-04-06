package 사장;

import java.io.*;

public class 예제8_2 {
	public static void main (String [] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		
		try {
			fin = new FileInputStream("E:\\부웅\\data2.txt");
			in = new InputStreamReader(fin , "UTF-8");
			int c;
			
			System.out.println("인코딩 문자집합은 "  + in.getEncoding());
			while ((c = in.read()) != -1) {
				System.out.println((char)c);
			}
			in.close();
			fin.close();
			
		}
		
		catch (IOException e) {
			System.out.println("입출력 오류");
		} 
		
	}	
}
