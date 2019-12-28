package ex09;

public class error1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//默认无参构造函数,不能传入参数
        C c = new C();
        System.out.println(c.value);
	}

}

class C{
	int value = 2;
}
