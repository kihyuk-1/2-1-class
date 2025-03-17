package pro0317;

public class Student {
	   String name;  // 이름
	    int stuId;    // 학번
	    int age;      // 나이


	    // 생성자
	     public Student(String name, int stuId, int age) {
	        this.name = name;
	        this.stuId = stuId;
	        this.age = age;
	    }

	    // 학생
	     public void info() {
	         System.out.println("이름: " + name + ", 학번: " + stuId + ", 나이: " + age);
	     }


}

