package ch7;


//���赵
public class Student {
	
	// 1. �Ӽ� -> �̸� , �й� , �а� , ���� (ĸ��ȭ)
    private String name;
    private String hb;
    private String dept;
    private String gwamok;

    // �⺻ ������
    Student() {}

    // ������
    Student(String name, String hb, String dept, String gwamok) {
        this.name = name;
        this.hb = hb;
        this.dept = dept;
        this.gwamok = gwamok;
    }

    // Getter�� Setter �޼���� (�ʿ信 ���� ����)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHb() {
        return hb;
    }

    public void setHb(String hb) {
        this.hb = hb;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGwamok() {
        return gwamok;
    }

    public void setGwamok(String gwamok) {
        this.gwamok = gwamok;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", hb=" + hb + ", dept=" + dept + ", gwamok=" + gwamok + "]";
    }
}
