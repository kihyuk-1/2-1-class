package pro0317;

public class Car {

	//1. 속성 , 필드 , 변수
	private String color; // 색상 
	private int speed; // 속도
	
	static int carCount = 0;
	final static int MAXSPEED = 200;
	final static int MINSPEED = 0;
	
	static int currentCarCount() {
		return carCount;
	}
 	
	
	//2. 생성자 
	Car() {} // 2-1 기본생성자	
	Car(String color , int speed) {
		this.color = color;
		this.speed = speed;
		carCount ++;
	}
	
	
	//3. 할일 , 기능 , 메소드 
	// 속도 올리기
	int upSpeed(int value) {
		speed = speed + value;
		if (speed > 200)
			speed = 200;
		return speed;
	}
	
	// 속도 내리기 
	int  downSpeed(int value2) {
		speed = speed - value2;
		if (speed < 0)
			speed = 0;
		return speed;
	}
	
	
	public String getColor() {
		return color;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public int getSpeed() {
		return speed;
	}
	
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
}
