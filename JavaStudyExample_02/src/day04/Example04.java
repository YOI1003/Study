package day04;

//디자인 패턴 어댑터(Adapter) : 변환기
//서로 다른 두 인터페이스 사이에 통신이 가능하게 하는 것
//서로 호환되지 않는 인터페이스를 가진 두 개체를 함께 동작할 수 있도록 연결해주는 패턴
//다른 클래스를 수정하지 않고 통합하는 용도로 사용합니다.

//인터페이스는 자바에서 클래스와 클래스에 대한 중간 다리 역할을 진행하는 연결 도구입니다.
//직접적으로 구현하는 값이 아닌 이름의 선언으로, 해당 인터페이스를 가지고 있는 클래스는
//반드시 인터페이스 내부에서 선언된 메소드를 구현해야 사용할 수 있습니다.
interface Target
{
	void run(); //인터페이스 내에서는 메소드에 대한 선언이 가능하다.
				//메소드는 일반적으로 선언할 수 없습니다.
}

//클래스의 연결 순서
//1. extends + implements
//clss 클래스명 extends 부모클래스명 implements 인터페이스
//2. extends
//class 클래스명 extends 부모클래스명
//3. implements
//class 클래스명 implements 인터페이스명

class ServiceA
{
	void actionA()
	{
		System.out.println("서비스 A를 작동합니다.");
	}
}
class ServiceB
{
	void actionB()
	{
		System.out.println("서비스 B를 작동합니다.");
	}
}



class AdapterA implements Target
{
	private ServiceA adapted_A;
	
	public AdapterA(ServiceA a)
	{
		adapted_A = a;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		adapted_A.actionA();
	}
}
class AdapterB implements Target
{
	private ServiceB adapted_B;
	
	public AdapterB(ServiceB b)
	{
		adapted_B = b;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		adapted_B.actionB();
	}
	
}



public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceA sA = new ServiceA();
		ServiceB sB = new ServiceB();
		
		//인터페이스 사용방법
		//Target t =new Target(); //인터페이스는 생성할 수 없습니다.
		
		//인터페이스는 인터페이스를 구현한 클래스의 형태로 생성하는 것은 가능합니다.
		//인터페이스명 변수명 = new 클래스명();
		
		Target target = new AdapterA(sA); //타겟으로 서비스A를 넣고 만든 어댑터 A를 생성
		target.run(); //서비스 A에 대한 run 실행
		target = new AdapterB(sB); //서비스 B를 넣은 어댑터 B작동
		target.run(); //서비스 B에 대한 run 실행
		
		//어댑터 패턴의 장점
		//1. 기존 코드를 재사용하면서 새 요구 사항을 충족시킬 수 있습니다.
		//2. 어댑터가 두 객체 간의 상호작용을 조정하기에 두 객체끼리의 결합도는 낮아집니다.
		//3. 변경된 사항에 대해 기존 코드를 수정할 필요가 없음.(유지 보수성이 낮음)
		
		//단점: 새 코드가 추가되는 방식으로 설계가 되기에 코드의 복잡성이 늘어날 우려가 있습니다.
		//	   단순한 상황 설계에는 안쓰는게 좋습니다.
		
	}

}
