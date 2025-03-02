package day03;

public class Sample01 {

	public static void main(String[] args) {
		// 연산자 사용하기
		int a = 10;
		int b = 7;
		boolean c = true;
		boolean d = false;
		
		System.out.println("a = " + a + "  b= " + b);
		System.out.println("c = " + c + "  d= " + d);
		
		//1) 산술 연산
		int a1 = a + b;
		int a2 = a - b;
		int a3 = a * b;
		int a4 = a / b;
		int a5 = a % b; // a(10)는 b(7)로 1번 나누어지며 3이 남게됩니다. 이 3을 결과로 가지게 됩니다.(나머지 연산)
		//int로 나누기 계산을 하면 소수점이 다 짤리게 됩니다.
		
		//System.out.printf("서식 지정자를 포함한 문장", 지정자가 지정하는 값, .....);
		//C언어 스타일로 출력문을 작성할 수 있습니다.
		//문장 안에 서식 지정자를 넣어서 그 위치에 값을 표시할 수 있습니다.
		//서식 지정자는 작성 순서대로 설정한 값을 넣어줍니다.
		
		//서식 지정자 종류
		//%d : 정수를 표현합니다.
		//%x : 16진수 표현(소문자)
		//%X : 16진수 표현(대문자)
		//%o : 8진수 표현
		//%s : 문자열을 표현합니다. %숫자s로 적을 경우 문구 앞에 공백을 채워서 숫자 자리만큼 크기를 고정합니다.
		//%f : 소수를 표현합니다. %.숫자f로 적을 경우 해당 숫자 자리 수까지 표현합니다.(반올림), 설정이 따로 없으면 6자리 출력
		//%b : true or false에 대한 표현
		//%e : 지수 표현식을 표현할 때 사용합니다. ex) 1.234e + 04
		//%% : 문장에서 %를 출력할 때 사용합니다.
		//%c : 문자 1개를 표현할 때 사용합니다.
		
		System.out.printf("계산 결과: a1 = %d  a2 = %d  a3 = %d  a4 = %d  a5 = %d\n", a1,a2,a3,a4,a5);
		
		
		//2. 대입
		int b1 = a; //b1에 a의 값(10)을 대입합니다. 변수에 특정 값을 적용하는 행위를 초기화(initialize)라고 부릅니다.
		System.out.printf("b1 = %d\n", b1);
		b1 += a; //대입(=) 앞에 사칙연산 기호(+,-,*,/)나 나머지(%)가 붙을 경우 두 값에 대한 연산을 진행 후 그 연산 결과를 대입합니다.
		//b1(10)에 b1 + a의 결과(20)을 대입합니다.
		//  >> b1에 a를 더하시오. 와 결과가 같습니다.
		System.out.printf("b1 = %d\n", b1);
		
		//3. 비교
		System.out.printf("a = %d b = %d\n", a,b);
		System.out.printf("a는 b보다 작습니까? %b\n", a < b);
		System.out.printf("a는 b보다 큽니까? %b\n", a > b);
		System.out.printf("a는 b보다 작거나 같습니까? %b\n", a <= b);
		System.out.printf("a는 b보다 크거나 같습니까? %b\n", a >= b);
		System.out.printf("a는 b와 같습니까? %b\n", a == b);
		System.out.printf("a는 b와 다릅니까? %b\n", a != b);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
