import java.util.Arrays;
import java.util.Scanner;

public class work7_34 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("请输入字符串（由字母组成）：");
	    String str = scanner.next();
	    System.out.print("排序后的字符串为：" + sort(str));
	}
	 
	private static String sort(String str) {
	    char[] chArray = new char[str.length()];
	    String newStr = "";
	    for (int i = 0; i < chArray.length; i++) {
	        if (i != chArray.length - 1) {
	            chArray[i] = str.substring(i, i + 1).charAt(0);//截取指定的子字符串
	        } else {
	            chArray[i] = str.substring(i).charAt(0);
	        }
	    }
	    Arrays.sort(chArray);
	    for (char ch : chArray) {
	        newStr += String.valueOf(ch);  //返回前面的类型
	    }
	    return newStr;
	}
}
