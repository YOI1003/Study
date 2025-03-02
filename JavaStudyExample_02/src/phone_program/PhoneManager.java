package phone_program;

public class PhoneManager
{
 //--------------------   필 드   -----------------------
	final int MAX = 100;            //저장 최대치
	Info[] storage = new Info[MAX]; //최대치만큼의 Info 배열
	int count = 0;                  //현재 저장된 Info의 수
	
 //-------------------- 싱글톤 패턴 -----------------------
	public static PhoneManager instance = null;
	private PhoneManager() { }
	public static PhoneManager getInstance()
	{
		if(instance == null)
			instance = new PhoneManager();	
		return instance;
	}
 //---------------------  메소드  ------------------------
 // read : 생성 기능  search : 검색 기능 
 //	input : 입력 기능 delete : 제거 기능
	
	public void delete()
	{
		if(count == 0)
		{
			System.out.println("삭제할 데이터가 존재하지 않습니다.");
			return;
		}
		
		System.out.println("데이터의 삭제를 진행합니다.");
		System.out.print("이름 : ");
		String name = Viewer.sc.nextLine();
		int idx = dataIdx(name);
		if(idx < 0)
			System.out.println("해당 데이터는 존재하지 않습니다.");
		else
		{
			//인덱스의 범위는 0부터 데이터의 개수 -1
			for(int i = idx; i < count-1; i++)
			{
				storage[i] = storage[i+1]; //1칸 제거
			}
			count--; //카운트 1 감소
			System.out.println("데이터가 성공적으로 삭제되었습니다.");
			System.out.printf("현재 저장 수치 :  [%d / %d]\n", count, MAX );
		}	
	}
	
	
	public void search()
	{
		System.out.println("데이터 검색을 진행합니다.");
		System.out.print("이름 : ");
		String name = Viewer.sc.nextLine();
		
		int idx = dataIdx(name); //데이터 검색을 진행한 결과에 따라 인덱스 값을 return , search에 의해 dataIdx에 접근(private)
		
		if(idx < 0)
			System.out.println("해당 데이터는 존재하지 않습니다.");
		else
		{
			storage[idx].show();
			System.out.println("데이터 검색이 완료되었습니다.");
		}
		
	}
	
	private int dataIdx(String name)
	{
		//현재의 스토리지에 저장되어있는 데이터 개수만큼 조사
		for(int i = 0; i < count; i++)
		{
			Info currentInfo = storage[i];
			if(name.compareTo(currentInfo.name) == 0) //문자열.compareTo(문자열)은 문자와 문자의 크기를 비교합니다. 0일 경우 같음을 의미
			{
				return i;
			}
		}
		return -1; //인덱스 -1은 잘못된 값임을 표현합니다.(인덱스는 0번부터 주어지기 때문)
	}
	
	public void input()
	{
		//카운트가 꽉차있다면 데이터 추가를 못하도록 설계
		if(count == MAX)
		{
			System.out.println("더이상 데이터를 넣을 수 없습니다 이미 최대치입니다!");
			return;
		}
		// 입력
		System.out.println("데이터 입력을 진행합니다.");
		System.out.println("1. 일반 2. 회사");
		System.out.print("▶");
		int choice = Viewer.sc.nextInt();
		Info newInfo = null; //아직 등록된게 없는 정보
		
		//메뉴 설정
		switch(choice)
		{
		case MENU.INFO :
			newInfo = readInfo(); //input() 함수를 통해 readInfo()나 readCompanyInfo()에 접근이 가능합니다.
								  //따라서 readInfo()나 readCompanyInfo()는 private로 설계해 외부 접근을 막아줍니다.(일종의 캡슐화)
			break;
		case MENU.COMPANY_INFO  :
			newInfo = readCompanyInfo();
			break;
		}
		
		//newInfo가 null이 아니라면 등록
		if(newInfo != null)
		{
			//추가
			storage[count++] = newInfo;
			System.out.println("데이터 입력이 완료되었습니다.");
			System.out.printf("현재 저장 수치 :  [%d / %d]\n", count, MAX );
		}
		else
		{
			System.out.println("데이터의 입력이 잘못되었습니다!");
		}

	}

	private Info readCompanyInfo()
	{
		Viewer.sc.nextLine(); //개행문자 처리
		System.out.print("이름 : ");
		String name = Viewer.sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = Viewer.sc.nextLine();
		System.out.print("회사 : ");
		String company = Viewer.sc.nextLine();	
		return new CompanyInfo(name,phoneNumber,company);
	}
	
	private Info readInfo()
	{
		Viewer.sc.nextLine(); //개행문자 처리
		System.out.print("이름 : ");
		String name = Viewer.sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = Viewer.sc.nextLine();
		
		return new Info(name, phoneNumber);
	}
	
	
	
	
	
}
