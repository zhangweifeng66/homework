package ex11;

public class ex01 extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ex01();
	}
	public ex01() {
		System.out.println("(4)");
	}

}

class Employee extends Person{
	//����Ҫ�޲δ���Ĺ��캯��,��Ϊ�������޲δ���
	//Ҫһһ��Ӧ
	public Employee() {
		this("(2)");
		System.out.println("(3)");
	}
	public Employee(String s) {
		System.out.println(s);
	}
}

class Person {
	public Person() {
		System.out.println("(1)");
	}
}

