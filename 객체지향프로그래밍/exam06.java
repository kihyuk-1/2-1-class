
public class exam06 {
	static int var = 100;
	
	public static void main(String args[]) {
		int num1 = 100 ,  num2 = 0;
		
		try {
			System.out.println(num1/num2);
		
		}
		
		catch (java.lang.ArithmeticException e) {
			System.out.println("0으로 나누지 마세요");
			
			
		}
		
	}
}
