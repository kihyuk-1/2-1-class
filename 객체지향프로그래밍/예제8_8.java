package 사장;

import java.io.File;

public class 예제8_8 {
	public static void listDirectory(File dir) {
		System.out.println("-----"  + dir.getPath() + "의 서브 리스트 입니다. -----");
		File[] subFiles = dir.listFiles();
		
		for (int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.print(f.getName());
			if (f.isFile()) System.out.print("\t파일");
			else if (f.isDirectory()) System.out.print("\t디렉터리");
			
			System.out.print("\t파일 크기 : " + f.length());
			System.out.printf("\t수정한 시간 :  %tb %td %ta %tT\n", t, t, t, t);	
		}
	}

	public static void main(String [] args) {
		File f1 = new File("E:\\부웅\\text2.txt");
		System.out.println(f1.getPath() + " ," + f1.getParent() + " , " + f1.getName());

		String res = "";
		if (f1.isFile()) res = "파일";
		else if (f1.isDirectory()) res = "디렉토리";
		System.out.println(f1.getPath() + "은 " + res + "입니다.");

		File f2 = new File("E:\\부웅\\마마");
		if (!f2.exists()) {
			f2.mkdir(); // 존재하지 않으면 디렉토리 생성
		}

		listDirectory(new File("E:\\부웅\\"));
		f2.renameTo(new File("E:\\부웅\\무웅"));
		listDirectory(new File("E:\\부웅\\")); // 🔥 수정된 경로

	}
}
