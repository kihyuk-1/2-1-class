package 사장;

import java.io.*;

public class 예제8_1 {

	public static void main (String [] args) {
		FileReader fin = null;
		
		
		try {
			fin = new FileReader("E:\\부웅\\data.txt");
			
			
			int c;
			
			while ((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			
			fin.close();			
			
		}
		
		catch (IOException e) {
			System.out.println("입출력 오류");
			e.printStackTrace();
		}
		
		
	}
	
}
