package phone_program;

public class CompanyInfo extends Info {

	String company;

	public CompanyInfo(String name, String phoneNumber, String company)
	{
		super(name, phoneNumber); //Info의 생성자 호출
		this.company = company; //새 기능 추가
	}
	//alt + shift + s + o	
	
	@Override
	public void show()
	{
		super.show();
		System.out.println("㈜ " + company);
	}
}
