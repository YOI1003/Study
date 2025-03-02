package phone_program;
//인터페이스는 implements를 통해 해당 클래스에 대한 기능 구현을 진행할 수 있습니다.
//인터페이스에서 만들어진 필드는 상수로써 사용할 수 있습니다.(public static)

//프로그램에 대한 직관적인 확인, 클래스 설계의 중간 다리 역할을 진행함으로써
//전체 프로그램의 팜플렛 역할을 진행합니다.

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneManager phoneManager = PhoneManager.getInstance();
		
		while(true)
		{
			Viewer.view();//화면 뷰
			int choice = Viewer.sc.nextInt();//숫자 입력
			Viewer.sc.nextLine(); //개행 처리
			
			switch(choice)
			{
			case INPUT.INPUT :
				phoneManager.input();
				break;
			case INPUT.SEARCH :
				phoneManager.search();
				break;
			case INPUT.DELETE :
				phoneManager.delete();
				break;
			case INPUT.EXIT :
				System.out.println("시스템을 종료합니다.");
				return;
			}
		}		
	}

}
