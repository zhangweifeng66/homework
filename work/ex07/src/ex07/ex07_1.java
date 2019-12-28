package ex07;

public class ex07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double[] arrayRefVar;
        arrayRefVar = new double[10];
        char[] arrayRefVar2 = new char[10];
        
        for(int i=0;i<arrayRefVar.length;i++) {
        	arrayRefVar[i] = Math.random() * 100;
        	System.out.println(arrayRefVar[i]);
        	System.out.println((int)arrayRefVar[i]);
        }
        for(double e : arrayRefVar) {
        	System.out.print(e + " ");
        }
        System.out.println(arrayRefVar.length);
        char[] array = {'H','e','l','l','o'};
        String arrayTo = "";
        for(int i=0;i<5;i++) {
        	arrayTo += array[i];
        }
        System.out.println(arrayTo);
	}

}
