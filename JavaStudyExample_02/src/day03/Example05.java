package day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example05 {

	public static void main(String[] args) throws IOException {
		// BufferedReader와 StringTokenizer 사용
		
		//1. BufferedReader ==> 속도가 빠른 입력 클래스 
		//					==> 사용자가 Enter키 입력 전까지 사용자의 입력을 전부 받아들이는 클래스
		//2. InputStreamReader ==> 입력한 문자값을 그대로 출력해주는 클래스
		//3. IOExeption ==> 입력과 출력(Input & Output) 과정에서 발생할 수 있는 예외 상황에 대한 클래스 - 예외상황? 어떤 종류
		//4. throws ==> 해당 키워드는 예외상황이 발생하면 해당 예외쪽 클래스 쪽에 예외 상황을 전달해 처리하게 한다.(던진다)
		
		//사용 방법 1 클래스 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//사용 방법 2 readLine을 이용해 데이터를 입력받습니다.
		String s = br.readLine(); //기능 사용을 위해 IOExeption을 throws 해줄 것
		
		//* 사용 방법 3: 파싱을 통해 데이터의 유형에 맞는 형태로 변경합니다.
		//			   유의사항 : 입력한 값이 해당 데이터와 맞아야 합니다.
		
		int i = Integer.parseInt(br.readLine());
		//입력한 결과물(문자열ㅇ)이 Integer(정수형 객체)를 통해 int 형태로 변형됩니다.
		//파싱(parsing) : 구문 분석
		//문장이 이루고 있는 구성 성분을 분해하고 분해한 성분의 관계를 분석해서 구조를 결정합니다.(데이터의 분해 분석)
		//웹 상에서도 사용되는 개념으로 주어진 정보를 원하는 형태로 가공하고 불러들이는 작업
		//ex) xml parsing, json parsing
		
		double d = Double.parseDouble(br.readLine()); //실수형(double)에 대한 파싱
		
		//래퍼 클래스(Wrapper Class)
		//기본 형태의 데이터(primitive)를 객체 형태로 다루는 클래스
		
		//이름이 다른 경우
		//int -> Integer
		//char -> Character
		
		//그 이외의 데이터는 이름의 앞 글자만 대문자로 변경
		//float -> Float boolean -> Boolean double -> Double
		
		
		//2. 공백으로 구분되어있는 데이터를 가공하기
		System.out.println("캐릭터의 이름, 공격력, 방어력을 순서대로 입력하세요.(문자 정수 정수)");
		StringTokenizer st = new StringTokenizer(br.readLine());
		//버퍼드 리더를 통한 입력된 결과 값을 기준으로 스트링 토크나이저 클래스를 생성합니다.
		
		//토크나이저 만들기
		//StringTokenizer 이름 = new StringTokenizer("문자열"); 띄어쓰기 기준으로 문자열 분리
		StringTokenizer token = new StringTokenizer("양 토끼 말");
		while(token.hasMoreTokens())
		{
			System.out.println(token.nextToken());
		}
		//2. 기준을 바꾸고 싶을 경우
		//StringTokenizer 이름 = new StringTokenizer("문자열", "문자");
		StringTokenizer token2 = new StringTokenizer("010-1234-5678", "-");
		while(token2.hasMoreTokens())
		{
			System.out.println(token2.nextToken());
		}
		//팁) 구분자를 여러개 사용할 경우에는 붙여서 사용합니다.
		StringTokenizer token3 = new StringTokenizer("이것은?정말로!굉장해.", "?!.");
		while(token3.hasMoreTokens())
		{
			System.out.println(token3.nextToken());
		}
		//3. 구분자도 토큰에 포함하는 경우
		StringTokenizer token4 = new StringTokenizer("이것은?정말로!굉장해.", "?!.", true);
		while(token4.hasMoreTokens())
		{
			System.out.println(token4.nextToken());
		}
		
		//토크나이저의 기능
		//1. countTokens: 토크나이저에 있는 토큰의 개수를 반환합니다.(토큰: 가지고 있는 각각의 값 정도로 해석)
		//2. nextTokens: 현재의 토큰을 표현하고 다음 토큰을 반환합니다.
		//3. hasTokens: 토큰이 남아있는지를 확인하는 메소드
		
		System.out.println("토큰 개수: " + st.countTokens());
		String name = st.nextToken(); //일반적으로는 문자열
		System.out.println("토큰 개수: " + st.countTokens());
		int atk = Integer.parseInt(st.nextToken()); //파싱을 통해 데이터 변경
		System.out.println("토큰 개수: " + st.countTokens());
		int def = Integer.parseInt(st.nextToken());
		if(st.hasMoreTokens())
		{
			System.out.println("작업 끝!");
		}
		
		
		
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + atk);
		System.out.println("방어력 : " + def);
	
		
		
	}

}
