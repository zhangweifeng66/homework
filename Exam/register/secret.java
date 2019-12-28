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
		System.out.println("欢迎来到登录界面!");
		System.out.println("1 -> 登录超级管理员:  ");
		System.out.println("2 -> 登录用户界面:  ");
		System.out.println("3 -> 退出登录!!");
		
		
		
		i = input.nextInt();
//		input.close();
		switch(i) {
			case 1:
				System.out.println("超级管理员密码 ：123456789");
				
		  		SuperSecond(Num);
		  		break;
		  	case 2:
		  		System.out.println("只有"+ (Num +1)+"用户");
		  		System.out.println("初始用户名： " + mm[0]);
		  		System.out.println("初始密码： " + mm[1]);
		  		System.out.println("如已改用户名和密码\n请输入新用户名和密码!!");
//		  		input.close();
		  		RegisterSecond();
		  		break;
		  	case 3:
		  		System.out.println("谢谢使用!!");
		  		break;
		  	default :
		  		System.out.println("无效的命令!!");
		  		System.out.println("请重新选择!!");
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
		System.out.println("5 -> 修改现用户");
		System.out.println("6 -> 新增用户");
		System.out.println("7 -> 修改老用户");
		System.out.println("8 -> 返回上一界面");
		switch(input.nextInt()) {
			case 5:
				SuperThird(Num);
				break;
			case 6:
				if(Num == Max) {
					System.out.println("对不起,管理员人数已满!!\n请选择其他选项");
					SuperThird(Num);
					break;
				}
				System.out.print("由于创建新用户,不能使用初始用户名和密码\n请输入新的用户名 :  ");
				System.out.println("初始用户名 " + mm[0] +" 初始密码 "+ mm[1]);
				username = input.next();
				System.out.print("请输入新的密码 :   ");
				passedword = input.next();
	 			while(username.equals( mm[0]) && passedword.equals( mm[1])) {
	 				System.out.println("和初始用户名密码相同.请重新输入!!");
	 				username   = input.next();
	 				passedword = input.next();
	 			}
	 			for(int i = 0;i<Num;i++) {
	 				if(secret[i].getUserName().equals(username)) {
	 					System.out.println("已有用户注册此用户名");
	 					SuperSecond();
	 					break;
	 				}
	 			}
	 			secret[++Num] = new Register(username,passedword);

	 			SuperThird(Num);
	 			break;
			case 7:
				
				System.out.println("现有用户:  ");
				for(int i=0;i<=Num;i++) {
					System.out.print(secret[i].getUsername()+" ");
				}
				System.out.println("\n输入想要修改的用户:   ");
				System.out.print("输入用户名:   ");
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
				System.out.println("无效的命令!!");
				System.out.println("请重新选择!!");
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
		System.out.println("选择想要修改的：");
		System.out.println("1 -> 修改用户名              **如果不是初始用户名无法修改");
		System.out.println("2 -> 修改用户登录密码");
		System.out.println("3 -> 修改用户学院");
		System.out.println("4 -> 修改用户名字");
		System.out.println("5 -> 修改用户联系方式");
		System.out.println("8 -> 返回上一界面");

		switch(input.nextInt()) {
		 	case 1:
		 		if(secret[tmp].getUsername().equals("user") == false){
		 			System.out.println("你的用户名不是初始用户名");
		 			System.out.println("所以不能修改");
		 			SuperThird(Num);
		 			break;
		 		}
				System.out.println("提醒:  输入中文时请将光标点到要输入的地方");
		 		System.out.println("或者先打个空格再输入要输入的中文");
		 		System.out.println("previous: "+secret[tmp].getUsername());
		 		if(secret[tmp].setUserName(input.next()) == false) {
		 			System.out.println("用户名不能修改为user");
		 			System.out.println("修改失败");
		 		}
		 		
		 		System.out.println("now: "+secret[tmp].getUsername());
		 		SuperThird(Num);
		 		break;
		 	case 2:
		 		System.out.println("previous: "+secret[tmp].getPassedword());
		 		System.out.print("请输入新密码:  ");
		 		passedword1 = input.next();
		 		System.out.print("请再次确定新密码 :   ");
		 		passedword2 = input.next();
		 		if(secret[tmp].setPassedword(passedword1, passedword2) == true) {
		 			if(secret[tmp].setPassedword(passedword1) == false) {
		 				System.out.println("密码不能修改为987654321");
			 			System.out.println("修改失败");
		 			}
		 		}
		 		else {
		 			System.out.println("密码错误!!");
		 			SuperThird(Num);
		 		}
		 		System.out.println("now: "+secret[tmp].getPassedword());
		 		SuperThird(Num);
		 		break;
		 	case 3:
				System.out.println("提醒:  输入中文时请将光标点到要输入的地方");
		 		System.out.println("或者先打个空格再输入要输入的中文");
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
		 		System.out.println("无效的命令!!");
		 		System.out.println("请重新选择!!");
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
			System.out.println("用户名和密码不正确!!");
			System.out.println("请重新输入!!");
//			input.close();
			RegisterSecond();
		}
		
	}
	
	public void Third(int i) {
//		Scanner input = new Scanner(System.in);
		
		System.out.println("欢迎用户: "+secret[i].getUsername());
		System.out.println("1 -> 进入功能区!!");
		System.out.println("2 -> 修改自己信息!!");
		System.out.println("3 -> 返回上一级");
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
		   		System.out.println("无效的命令!!");
		 		System.out.println("请重新选择!!");
		   		System.out.println("-------------------------------------------------------------------------");
//		   		input.close();
		  		First();
		   		break;
		}
		
	}
		
}
