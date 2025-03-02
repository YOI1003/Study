package day04;
/*
  if문 작성 방법
  
  if(조건식)
  {
    조건식의 결과가 만족할 때, 실행할 명령문을 작성하는 위치
  }
  2. if문의 보조 문법 작성 방법
  보조 문법의 경우 설계 시 필요한 경우에만 추가해서 사용합니다.
  보조 문법의 경우 if문이 없을 경우에 단독으로 사용이 불가능합니다.
  
  if(조건식 1)
  {
    조건식1의 결과가 만족할 때, 실행할 명령문을 작성하는 위치
  }
  else if(조건식 2)
  {
    조건식 2의 결과가 만족할 때, 실행할 명령문을 작성하는 위치
    단, 위에 있는 조건식 1이 만족하고 있다면 실행되지 않습니다.
    else if는 필요한 만큼 추가할 수 있습니다.
  }
  else
  {
    else문은 조건식을 요구하지 않습니다.
    위에서 설계한 모든 if, else if문의 조건이 만족하지 않을 경우 실행할 명령을 작성하는 곳입니다.
  }
 */
import java.util.Scanner;
public class Sample01 {

	public static void main(String[] args) {
		// 논리 연산자와 if문
		
		int age = 20;
		
		if(age >= 19)
		{
			System.out.println("성인입니다.");
		}
		else
		{
			System.out.println("미성년자입니다.");
		}
		
		//논리 연산자를 이용하면 여러 개의 조건을 처리하기가 수월해집니다.
		//ex) a가 1보다 크지만 b는 10보다 작은 경우
		
		int a , b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a와 b를 순서대로 입력하세요. >> ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > 1 && b < 10) //논리 연산자 AND 연산
		{
			System.out.println("범위에 맞는 값");
		}
		else
		{
			System.out.println("범위에 맞지 않습니다.");
		}
		//논리 연산자로 조건을 연결해서 사용했을 경우 조건을 표현하기가 수월해집니다.
		//설계 방식에 따라 각각을 따로 체크해야 하는 경우라면 따로따로 구현하는 것도 좋습니다.
		
		
		
		//연습 문제) 아래의 코드의 실행 결과를 작성하고, 그 이유를 작성하시오.
		
		int c = 60;
		int d = 55;
		
		System.out.println(c == d || c++ < 100);
		System.out.println(c !=d || d > 40);
		System.out.println(c > d && d < c);
		
		//연습 문제) 다음 조건에 맞게 프로그램을 설계하시오.
		//조건 1) 정수형 변수 num에 입력을 진행합니다.
		//조건 2) 입력한 숫자가 1 ~ 100 사이의 숫자일 경우 "입력 완료"를 출력합니다
		//조건 3) 해당 범위가 아닐 경우 "입력 실패"를 출력하고 숫자를 0으로 초기화 합니다.
		//조건 4) 입력한 숫자의 값이 0이 아니라면 화면에 그 값을 출력합니다.
		
		int num;
		
		System.out.print("숫자를 입력해주세요. >> ");
		num = sc.nextInt();
		
		if(num >= 1 && num <= 100)
		{
			System.out.println("입력 완료");
			System.out.println("입력한 숫자 >> " + num);
		}
		else if(num == 0)
		{
			System.out.println("입력 실패");
		}
		else
		{
			System.out.println("입력 실패");
			System.out.println("입력한 숫자 >> " + num);
			num = 0;
		}

//입력 구현
		int num2 = sc.nextInt();
//숫자에 대한 설정 처리
		if(num2 >= 1 && num2 <= 100)
		{
			System.out.println("입력 완료");
		}
		else
		{
			System.out.println("입력 실패");
			num2 = 0;
		}
//숫자 결과에 따른 출력 결과 처리
		if(num2 != 0)
		{
			System.out.println(num2);
		}
		
		
		
		
		
		
		sc.close();
		
		
	}
}
