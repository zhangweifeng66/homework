/*
 * {@code Register}{@link Register} �г������� �������������û�,�ı������û���Ϣ,�û�����Ϣ :�û���,����,��ʵ����,�ֻ���,����ѧԺ
 * 
 * {@code setPassedword} {@link setPassedword} {return boolean} ������������,ȷ������,�����ͬ�ͷ���false
 * {@code setPassedword} {@link setPassedword} �����ʼΪ987654321,�ı�����,���ܸ�Ϊ��ʼ����,��Ȼ����false
 * {@code setUserName} {@link setUserName} {return boolean} �ı��û���,���ܸ�Ϊ��ʼ�û���,��Ȼ����false
 * {@code  Register} {@link  Register} �ഴ��,Ҫ�����û���������,�û����������������Ϊ��ʼ�û���������,�����ܶ���ͬ,
 * ���������{@link register.secret.SuperSecond}�ж���
 * {@code getInformation} {@link getInformation} {@return boolean} �����û���Ϣ
 * {@code equal} {@link equal} {return boolean} �û����������Ƿ񶼶�Ӧ���û����û���,����,ȷ���ܷ��¼
 * 
 * @author ��ΰ��
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
		String str ="��ʾ��ǰ�û�\n";
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
