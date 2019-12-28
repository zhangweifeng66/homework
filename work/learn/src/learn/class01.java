package learn;
public class class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aaa=Integer.parseInt("111"); 
		int bbb=Integer.valueOf("222");// 为什么你的程序返回值都可以用int来接收呢？  因为Integer和int可以自动转换
		Integer c = 5;
		int d  = c;//像是这样表示是没有编译错误的
        System.out.println("aaa "+ aaa);
        System.out.println("bbb "+ bbb);
        System.out.println("d "+ d);
	}

}
