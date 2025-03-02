package day08;
//클래스(class) : 프로그램에서 사용될 객체의 틀을 의미하고 객체 생성의 설계도 역할을 진행합니다.
// --> 변수와 메소드를 내부에 두고 사용할 수 있는 특정 데이터를 표현할 수 있는 사용자 정의 데이터
//ex) 게임의 플레이어는 플레이어의 정보(hp, atk,...)를 변수로 가지고 플레이어의 동작(공격,이동)등을 메소드로 가짐.

//객체(Object): 클래스에서 정의한 것을 토대로 실제 저장 공간에 할당된 참조 공간을 의미합니다.
// --> 클래스로 생성한 어떤 것

//인스턴스(Instance): 일반적으로는 실행 중인 임의의 프로세스(컴퓨터에서 연속적으로 실행되는 프로그램)

//원을 표현할 수 있는 클래스
class Circle
{
	//필드(field): 클래스 내부의 변수를 의미합니다.
	public double radius;
	
	//메소드(method): 클래스 내부의 함수를 의미합니다.
	public double getArea()
	{
		return radius * radius * Math.PI; //PI값 정도는 컴퓨터에서 제공해준다. 여러가지 자바에서 제공해주는 많은 기능이 있어서 
										  //있을만한 도구들을 찾아보는게 중요하다.
	}
}


public class Sample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(); //써클 생성
		c1.radius = 10;
		System.out.println("c1의 반지름 = " + c1.radius);
		System.out.println("c1의 원의 넓이 = " + c1.getArea());
		
		Circle c2 = new Circle(); //써클 생성
		c2.radius = 5;
		System.out.println("c1의 반지름 = " + c2.radius);
		System.out.println("c1의 원의 넓이 = " + c2.getArea());

	}

}
