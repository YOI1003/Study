package phone_program;

public class Info {

	String name, phoneNumber;

	public Info(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	//alt + shift + s + o
	
	public void show()
	{
		System.out.println("name : " + name);
		System.out.println("☎ : " + phoneNumber);
		//특수문자 ㅁ + 한자키
	}
}
