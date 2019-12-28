package ex09;

public class Test {
    public static void main(String[] args) {
    	//
        Student student = new Student();
        //student中的数据域赋默认值,
        //但局部变量不会
        System.out.println("name? " + student.name);
        System.out.println("age? " + student.age);
        System.out.println("isScienceMajor " + student.isScienceMajor);
        System.out.println("gender? " + student.gender);
        System.out.println("char? " + 'A');
        char numChar = 'A';
        System.out.println("method 2: " + numChar + ":" + Character.getNumericValue(numChar));
        /*将unicod和Ascall码 一些字符转换为数字
         * 字符1~9变成数字1~9
         * A~Z转换为10~36*/
    }
    
}
