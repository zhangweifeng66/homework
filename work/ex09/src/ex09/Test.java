package ex09;

public class Test {
    public static void main(String[] args) {
    	//
        Student student = new Student();
        //student�е�������Ĭ��ֵ,
        //���ֲ���������
        System.out.println("name? " + student.name);
        System.out.println("age? " + student.age);
        System.out.println("isScienceMajor " + student.isScienceMajor);
        System.out.println("gender? " + student.gender);
        System.out.println("char? " + 'A');
        char numChar = 'A';
        System.out.println("method 2: " + numChar + ":" + Character.getNumericValue(numChar));
        /*��unicod��Ascall�� һЩ�ַ�ת��Ϊ����
         * �ַ�1~9�������1~9
         * A~Zת��Ϊ10~36*/
    }
    
}
