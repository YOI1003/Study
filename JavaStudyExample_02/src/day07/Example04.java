package day07;

//추상 클래스 : abstract 키워드가 붙은 메소드를 가지고 있는 abstract 키워드가 붙은 클래스
//			 특징) abstract 키워드가 붙은 메소드는 따로 구현하지 않고 선언만 하는 것이 가능하다.({} -> ;)
//			      해당 클래스를 상속으로 물려받았을 경우 반드시 abstract 메소드를 재구현해야 합니다.

abstract class Calculate 
{
	public abstract int Plus(int x, int y);
	//abstract 키워드가 없는 일반 메소드는 선언(;)할 수 없습니다. 반드시 구현({})을 진행해야 합니다.
	//public int Minus(int x, int y);
	public abstract int Minus(int x, int y);
}

//추상 클래스 사용 방법
//1. 추상 클래스를 상속받은 클래스로 추상 메소드를 구현해서 사용합니다.
//2. 익명 함수를 통해 바로 사용합니다.

//추상 클래스 장점
//1. 부모 클래스 쪽에서 기능을 구현할 필요가 없이 선언만 진행하면 된다.
//2. 자식 클래스 쪽에서 메소드를 따로 설계할 필요 없이 물려받은 메소드를 재구현하기만 하면 된다.(필요에 따라 추가 개발하는 건 상관없음)
//2. 다형성에 대한 보장을 받을 수 있습니다.(부모 클래스를 자식 클래스의 형태로 생성해 하나의 객체로 여러 형태의 표현이 가능)
class C1 extends Calculate
{
	//오버라이드를 통해 Calculate가 가지고 있던 Plus(int,int)를 구현합니다.
	@Override
	public int Plus(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int Minus(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}
	
}
class C2 extends Calculate
{

	@Override
	public int Plus(int x, int y) {
		// TODO Auto-generated method stub
		return (x + y) * 2;
	}

	@Override
	public int Minus(int x, int y) {
		// TODO Auto-generated method stub
		return (x - y) / 2;
	}
	
}


public class Example04 {

	public static void main(String[] args) {
		// 추상 클래스와 익명 함수
		
		//Calculate c = new Calculate(); //불가능
		Calculate c = new C1();
		System.out.println(c.Plus(1, 2));
		c = new C2();
		System.out.println(c.Plus(1, 2));
		//하나의 객체를 이용해 여러 개를 돌려쓸 수 있습니다.(다형성(Metamorphism))
		
		
		//익명 함수 구현
		//따로 자식 클래스를 구현하지 않고, 내부에서 바로 메소드를 정의하는 것으로
		//사용할 수 있습니다.
		//익명함수를 사용하는 경우 --> 일시적으로 한 번만 사용하고 버려도 되는 객체일 경우
		//장점 : 메모리 관리에서 효과적입니다.
		//단점 : 코드가 길어짐.
		
		
		//any_c를 생성하는데 Plus와 Minus는 다음과 같이 설계합니다.
		Calculate any_c = new Calculate() 
		{
			
			@Override
			public int Plus(int x, int y) {
				// TODO Auto-generated method stub
				return (x + y) * 3;
			}
			
			@Override
			public int Minus(int x, int y) {
				// TODO Auto-generated method stub
				return (x - y) / 3;
			}
		};
		
		System.out.println(any_c.Plus(3, 4));
		
	}

}