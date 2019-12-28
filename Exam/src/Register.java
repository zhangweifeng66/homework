/*
 * {@code Register}{@link Register} 有超级密码 可以用来新增用户,改变所有用户信息,用户有信息 :用户名,密码,真实姓名,手机号,所属学院
 * 
 * {@code setPassedword} {@link setPassedword} {return boolean} 密码输入两遍,确定密码,如果不同就返回false
 * {@code setPassedword} {@link setPassedword} 密码初始为987654321,改变密码,不能改为初始密码,不然返回false
 * {@code setUserName} {@link setUserName} {return boolean} 改变用户名,不能改为初始用户名,不然返回false
 * {@code  Register} {@link  Register} 类创建,要传入用户名和密码,用户名和密码可以设置为初始用户名和密码,但不能都相同,
 * 这个功能在{@link register.secret.SuperSecond}中定义
 * {@code getInformation} {@link getInformation} {@return boolean} 返回用户信息
 * {@code equal} {@link equal} {return boolean} 用户名和密码是否都对应本用户的用户名,密码,确定能否登录
 * 
 * @author 张伟峰
 */




public class Register {
	private String SuperPassedword = "123456789";
	private String passedword = "987654321";
	private String username = "user";
	private String name;
	private String phone;
	private String instituation;
	
	public Register( String username, String passedword) {
		this.username = username;
		this.passedword = passedword;
	}
	
	public Register() {
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void SuperSet(String Instituation, String Name, String Phone) {
		this.instituation = Instituation;
		this.name = Name;
		this.phone = Phone;
		
	}
	
	public boolean setPassedword(String passedword1,String passedword2) {
		if(passedword1.equals(passedword2) == true) {
			this.passedword = passedword1;
			return true;
		}
		else {
			System.out.println("The scores are different!!!");
			return false;
		}
	}
	
	public String getPassedword() {
		return this.passedword;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean setPassedword(String passedword) {
		if(passedword.equals("987654321")) {
			return false;
		}
		else {
			this.passedword = passedword;
			return true;
		}
	}
	
	public boolean setUserName(String username) {
		if(username.equals("user")) {
			return false;
		}
		else {
			this.username = username;
			return true;
		}
	}
	
	public String getUserName() {
		return this.username;
	}
	
	public String getInstituation() {
		return this.instituation;
	}
	
	public void setInstituation(String Instituation) {
		this.instituation = Instituation;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean SuperPass(String Super) {
		
		if(this.SuperPassedword.equals(Super) == true) {
			
			return true;
		}
		else {
			System.out.print("SuperPassedword is wrong !\n");
			return false;
		}
	}
	
	public void getInformation() {
		String str ="显示当前用户\n";
		str += "usedname: " + this.username + "\n"+
				"passedword: " + this.passedword +"\n"+
				"instituation: " + this.instituation + "\n"+
				"name: " + this.name + "\n" +
				"phone: " + this.phone + "\n";
		System.out.print(str); 
	}
	
	public boolean equal(String username, String passedword) {
		if(this.username.equals(username)==true && 
				this.passedword.equals(passedword)==true) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
