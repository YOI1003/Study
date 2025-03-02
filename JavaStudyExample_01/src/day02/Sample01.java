package day02;

//reference type 사용해보기
//주의사항: public class는 자바 파일의 이름과 동일하니 public class는 코드 상에 1개만 존재할 수 있다.
class Student
{
	//Student가 가지고 있을 데이터(변수)를 작성합니다.
	int age = 20;
	double height = 173.8;
	double weight = 77.4;
}

public class Sample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 만드는 방법
		//타입 변수명 = 타입에 맞는 값;
		
		int value1 = Integer.MAX_VALUE; //int 타입이 가질 수 있는 최대 값
		boolean value2 = true;		   //true(참) 그 자체를 저장
		char value3 = 'A';			   //문자 하나를 저장 '' 안에 작성
		double value4 = 31.45658790;   //실수에 대한 저장
		boolean value5 = 10 - 5 == 7; //10에서 5를 뺀 값이 7과 같은지에 대한 결과 저장
		
		System.out.println("value1 : " + value1);
		//문장 다음에 +를 쓰고 다음 값을 적으면 결합됩니다.
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		System.out.println("value4 : " + value4);
		System.out.println("value5 : " + value5);
				
		//참조형 사용하기
		//1. 참조형 타입 변수명 = new 생성자(); (참조형 변수를 생성합니다.)
		//								   생성자는 참조형 타입의 이름과 동일합니다.
		Student jake = new Student();
		//2. 변수명.내부데이터명을 통해 해당 참조형 변수가 가지고 있는 데이터를 사용할 수 있습니다.
		System.out.println("jake's age : " + jake.age);
		System.out.println("jake's height : " + jake.height);
		System.out.println("jake's weight : " + jake.weight);
		
		//참조형을 사용하면 변수명.age의 형태로 작성할 수 있어 구분이 쉽고 특정 변수의 이름을 계속 사용하는 것이 가능합니다.
		Student jane = new Student();		
		System.out.println("jane's age : " + jane.age);
		System.out.println("jane's height : " + jane.height);
		System.out.println("jane's weight : " + jane.weight);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
