package day02;

//자바 변수 관련 표현법 보기
//1. 리터럴(literal) : 데이터 (값) 그 자체를 의미합니다.
//2. 키워드(keyword) : 특별한 기능을 수행하는 문자열
//3. 변수(variable) :  사용자가 하나의 데이터를 이름지어서 저장하는 저장 공간
//4. 상수(const) : 한번 값이 저장되면 다른 값으로 수정 불가능한 값
//				  자바에서는 이 기능을 final을 붙여주는 것으로 설정 가능합니다.
public class Sample02 {

	public static void main(String[] args) {	
		int i = 100;
		long l = 100L;
		final double PI = 3.14;
		System.out.println("리터럴 : 100, 100L, 3.14  ");
		System.out.println("키워드 : int , long , final, double  ");
		System.out.println("변수 : i,l ");
		System.out.println("상수 :  PI ");						
		System.out.println("다음 중 primitive type이 아닌 것을 고르세요.");
		System.out.println("1. int 2. boolean 3. String 4. char ");
		System.out.println("답 :  3 ");
		System.out.println("String은 자바에서 문자열을 표현하는 데이터(참조형)입니다.");
		//객관식에 대한 풀이는 단순합니다.
		//1. 완벽한 정답을 찾아내 오답 걸러내기
		//2. 완벽한 오답을 찾아내 정답 찾아내기				
		System.out.println("다음 중 잘못된 부분을 모두 수정하시오.");
		System.out.println("1. byte b = 256;");
		System.out.println("2. char c = '';");
		System.out.println("3. float f = 3.14;");
		System.out.println("4. double d = 3.14f;");
		System.out.println("5. String s = \"Hello\";");
		//\"Hello\"는 화면에 "Hello"라고 출력됩니다.	
		System.out.println("답 : 1, 2, 3 ");
		System.out.println("byte는 -128부터 127까지의 범위만 표현이 가능합니다.");
		System.out.println("char은 반드시 한 개의 문자를 지정해야 합니다. char c = ' ';");
		System.out.println("문자를 하나 넣어주시거나 빈칸을 쓸 경우는 space 키의 경우도 한 개의 문자이므로 가능합니다.");
		System.out.println("float형 데이터의 값을 적을 경우 뒤에 f를 붙여줘야 합니다.");		
		System.out.println();
		System.out.println("잘못된 부분이 없는 경우 : 4, 5");
		System.out.println("double은 float처럼 실수를 표현하는 데이터입니다. 그러면서 float보다 큰 데이터(8 byte)");
		System.out.println("따라서 float의 표현법을 double은 사용할 수 있습니다.");
		System.out.println("데이터의 유형이 같으면서 크기만 차이나는 경우라면 큰 데이터로 작은 데이터를 표현하는 것은 가능하다.");
		System.out.println("String은 문자열을 표현하는 데이터입니다.");
		System.out.println("String 변수명 = \"문자열\" ");	
	}

}
