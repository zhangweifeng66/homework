import java.util.Scanner;

public class secret {
	private int Max = 10;
	private static int Num = 0;
	private Register[] secret = new Register[Max];
	
	public String[] mm = new String[2];

	Scanner input = new Scanner(System.in);
	data data = new data();
	
	public secret() {
	}
	
	public void Begin() {
		secret[0] = new Register();
		mm[0] = secret[0].getUsername();
		mm[1] = secret[0].getPassedword();
		First();
	}
	
	public void First() {
		int i;
		System.out.println("��ӭ������¼����!");
		System.out.println("1 -> ��¼��������Ա:  ");
		System.out.println("2 -> ��¼�û�����:  ");
		System.out.println("3 -> �˳���¼!!");
		
		
		
		i = input.nextInt();
//		input.close();
		switch(i) {
			case 1:
				System.out.println("��������Ա���� ��123456789");
				
		  		SuperSecond(Num);
		  		break;
		  	case 2:
		  		System.out.println("ֻ��"+ (Num +1)+"�û�");
		  		System.out.println("��ʼ�û����� " + mm[0]);
		  		System.out.println("��ʼ���룺 " + mm[1]);
		  		System.out.println("���Ѹ��û���������\n���������û���������!!");
//		  		input.close();
		  		RegisterSecond();
		  		break;
		  	case 3:
		  		System.out.println("ллʹ��!!");
		  		break;
		  	default :
		  		System.out.println("��Ч������!!");
		  		System.out.println("������ѡ��!!");
		  		System.out.println("-------------------------------------------------------------------------");
		  		First();
		  		break;
		}
		
	}
	
	public void SuperSecond(int tmp) {
		
		String Super = input.next();
		if(secret[tmp].SuperPass(Super) == true) {
			SuperSecond();
		}
	}
	
	public void SuperSecond() {
		String passedword1;
		String passedword2 ;
		String username;
		String passedword;
		System.out.println("5 -> �޸����û�");
		System.out.println("6 -> �����û�");
		System.out.println("7 -> �޸����û�");
		System.out.println("8 -> ������һ����");
		switch(input.nextInt()) {
			case 5:
				SuperThird(Num);
				break;
			case 6:
				if(Num == Max) {
					System.out.println("�Բ���,����Ա��������!!\n��ѡ������ѡ��");
					SuperThird(Num);
					break;
				}
				System.out.print("���ڴ������û�,����ʹ�ó�ʼ�û���������\n�������µ��û��� :  ");
				System.out.println("��ʼ�û��� " + mm[0] +" ��ʼ���� "+ mm[1]);
				username = input.next();
				System.out.print("�������µ����� :   ");
				passedword = input.next();
	 			while(username.equals( mm[0]) && passedword.equals( mm[1])) {
	 				System.out.println("�ͳ�ʼ�û���������ͬ.����������!!");
	 				username   = input.next();
	 				passedword = input.next();
	 			}
	 			for(int i = 0;i<Num;i++) {
	 				if(secret[i].getUserName().equals(username)) {
	 					System.out.println("�����û�ע����û���");
	 					SuperSecond();
	 					break;
	 				}
	 			}
	 			secret[++Num] = new Register(username,passedword);

	 			SuperThird(Num);
	 			break;
			case 7:
				
				System.out.println("�����û�:  ");
				for(int i=0;i<=Num;i++) {
					System.out.print(secret[i].getUsername()+" ");
				}
				System.out.println("\n������Ҫ�޸ĵ��û�:   ");
				System.out.print("�����û���:   ");
				username = input.next();
				for(int i=0;i<=Num;i++) {
					if(secret[i].getUsername().equals(username) == true) {
						SuperThird(i);
						break;
					}
				}
				break;
	 		
			case 8:
//	 			input.close();
				First();
				break;
			default:
				System.out.println("��Ч������!!");
				System.out.println("������ѡ��!!");
				System.out.println("-------------------------------------------------------------------------");
//	 			input.close();
				SuperSecond(Num);
				break;
		}
		
	}

	public void SuperThird(int tmp) {
		String passedword1;
		String passedword2 ;
		String username;
		String passedword;
		secret[tmp].getInformation();
		System.out.println("ѡ����Ҫ�޸ĵģ�");
		System.out.println("1 -> �޸��û���              **������ǳ�ʼ�û����޷��޸�");
		System.out.println("2 -> �޸��û���¼����");
		System.out.println("3 -> �޸��û�ѧԺ");
		System.out.println("4 -> �޸��û�����");
		System.out.println("5 -> �޸��û���ϵ��ʽ");
		System.out.println("8 -> ������һ����");

		switch(input.nextInt()) {
		 	case 1:
		 		if(secret[tmp].getUsername().equals("user") == false){
		 			System.out.println("����û������ǳ�ʼ�û���");
		 			System.out.println("���Բ����޸�");
		 			SuperThird(Num);
		 			break;
		 		}
				System.out.println("����:  ��������ʱ�뽫���㵽Ҫ����ĵط�");
		 		System.out.println("�����ȴ���ո�������Ҫ���������");
		 		System.out.println("previous: "+secret[tmp].getUsername());
		 		if(secret[tmp].setUserName(input.next()) == false) {
		 			System.out.println("�û��������޸�Ϊuser");
		 			System.out.println("�޸�ʧ��");
		 		}
		 		
		 		System.out.println("now: "+secret[tmp].getUsername());
		 		SuperThird(Num);
		 		break;
		 	case 2:
		 		System.out.println("previous: "+secret[tmp].getPassedword());
		 		System.out.print("������������:  ");
		 		passedword1 = input.next();
		 		System.out.print("���ٴ�ȷ�������� :   ");
		 		passedword2 = input.next();
		 		if(secret[tmp].setPassedword(passedword1, passedword2) == true) {
		 			if(secret[tmp].setPassedword(passedword1) == false) {
		 				System.out.println("���벻���޸�Ϊ987654321");
			 			System.out.println("�޸�ʧ��");
		 			}
		 		}
		 		else {
		 			System.out.println("�������!!");
		 			SuperThird(Num);
		 		}
		 		System.out.println("now: "+secret[tmp].getPassedword());
		 		SuperThird(Num);
		 		break;
		 	case 3:
				System.out.println("����:  ��������ʱ�뽫���㵽Ҫ����ĵط�");
		 		System.out.println("�����ȴ���ո�������Ҫ���������");
		 		System.out.println("previous: "+secret[tmp].getInstituation());
		 		secret[tmp].setInstituation(input.next());
		 		System.out.println("now: "+secret[tmp].getInstituation());
		 		SuperThird(Num);
		 		break;
		 	case 4:
		 		System.out.println("previous: "+secret[tmp].getName());
		 		secret[tmp].setName(input.next());
		 		System.out.println("now: "+secret[tmp].getName());
		 		SuperThird(Num);
		 		break;
		 	case 5:
		 		System.out.println("previous: "+secret[tmp].getPhone());
		 		secret[tmp].setPhone(input.next());
		 		System.out.println("now: "+secret[tmp].getPhone());
		 		SuperThird(Num);
		 		break;
		 		
		 	case 8:
//		 		input.close();
		 		First();
		 		break;
		 	default:
		 		System.out.println("��Ч������!!");
		 		System.out.println("������ѡ��!!");
		 		System.out.println("-------------------------------------------------------------------------");
//		 		input.close();
		 		SuperThird(Num);
		}
//		input.close();
	
	}
	
	public void RegisterSecond() {
//		Scanner input = new Scanner(System.in);
		String username;
		String passedword;
		boolean state =false;
		username   = input.next();
		passedword = input.next();
		for(int i = 0;i <=Num;i++) {
			
			if(secret[i].equal(username, passedword) == true) {
				state= true;
//				input.close();
				Third(i);
				break;
			}
		}
		if(state == false) {
			System.out.println("�û��������벻��ȷ!!");
			System.out.println("����������!!");
//			input.close();
			RegisterSecond();
		}
		
	}
	
	public void Third(int i) {
//		Scanner input = new Scanner(System.in);
		
		System.out.println("��ӭ�û�: "+secret[i].getUsername());
		System.out.println("1 -> ���빦����!!");
		System.out.println("2 -> �޸��Լ���Ϣ!!");
		System.out.println("3 -> ������һ��");
		switch(input.nextInt()) {
		   	case 1: 
		   		data.First(secret[i].getUsername());
		   		First();
		   		break;
		   	case 2:
		   		
//		   		input.close();
		   		SuperThird(i);
		   		break;
		   	case 3:
//		   		input.close();
		   		First();
		   		break;
		   	default:
		   		System.out.println("��Ч������!!");
		 		System.out.println("������ѡ��!!");
		   		System.out.println("-------------------------------------------------------------------------");
//		   		input.close();
		  		First();
		   		break;
		}
		
	}
		
}
