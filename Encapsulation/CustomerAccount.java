package Encapsulation;

public class CustomerAccount {
	private long accountNo;
	private String name;
	private int age;
	private String place;
	private String accountType;
	public CustomerAccount(long accountNo, String name, int age, String place, String accountType) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.age = age;
		this.place = place;
		this.accountType = accountType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "CustomerAccount [accountNo=" + accountNo + ", name=" + name + ", age=" + age + ", place=" + place
				+ ", accountType=" + accountType + "]";
	}
	

}
