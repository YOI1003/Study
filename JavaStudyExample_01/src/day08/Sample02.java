package day08;
import java.util.ArrayList;
import java.util.Scanner;
public class Sample02 {
	
	//함수 설계의 팁
	//함수를 실행할 때, 특정 값을 요구하는 경우(ex. 두개의 정수
	//그 값들은 매개변수가 됩니다.
	//매개변수는 함수의 도입부() 부분에 만들어주는 변수를 의미합니다.
	//함수를 호출할 때, 전달받을 값의 형태로 변수를 설계합니다.
	//ex) 정수 1,2를 전달받는다면 매개변수의 타입은 int, int
	//**매개변수의 이름은 크게 고려할 필요가 없습니다. 핵심은 자료형입니다.**
	
	public static int Bigger(int a , int b)
	{
		return a > b ? a : b;
		//삼항 연산자
		//조건에 따른 값이 둘 중 하나로 결정되는 경우 사용하는 문법
		//(조건식) ? (조건식이 맞을 때 나올 값) : (조건식이 틀릴 때 나올 값);
	}
	//문제 풀이 1) 최대공약수의 규칙을 이용해 풀이합니다.
	public static int GCD(int a, int b)
	{
		int max = 0;
		for(int i = 1; i <= a && i <= b; i++)
		{
			if(a % i == 0 && b % i == 0) //i로 나눴을 때 둘다 나머지가 0이어야 공약수
			{
				max = i;
			}
		}
		
		return max;
	}
	//문제 풀이 2) 약수를 계산하는 로직을 설계하고 약수의 묶음에서 최대 공약수를 뽑아내는 방식
	// >> 함수를 2개 사용합니다. (약수에 대한 함수 1개, 공약수 계산을 위한 함수 1개)
	
	//1. 약수에 대한 함수를 설계합니다. 특정 수의 약수는 수의 집합으로 표현됩니다. (ex) 4의 약수 = 1,2,4
	
	public static ArrayList<Integer> Divisor(int value)
	{
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i = 0; i < value; i++)
			//여기서 효율을 더 높이려면 약수의 규칙을 활용합니다.
			//약수의 규칙: N의 약수는 N을 제외한 가장 큰 수가 N의 절반 보다 클 수 없습니다.
			//이 법칙을 알고있다면 i < value는 i < value/2로 범위를 축소해서 돌릴 수 있음
		{
			if(value % i == 0) //value가 i로 나눈 값이 0이라면 --> i는 value의 약수라는 뜻
			{
				result.add(i);
			}
		}
		//약수에는 자기 자신은 무조건 포함되기 때문에 마지막에 자기 자신을 추가합니다.
		result.add(value);
		return result;
	}
	
	//2. 위에 설계한 약수를 이용해 최대공약수를 설계합니다.
	public static int GCD2(int a, int b)
	{
		int gcd = -1; //최대 공약수의 초기 값 설정
		
		//약수에 대한 리스트 2개를 등록합니다.
		ArrayList<Integer> d1 = Divisor(a);
		ArrayList<Integer> d2 = Divisor(b);
		
		for(Integer value1 : d1) //묶음에서 값 분할
		{
			for(Integer value2 : d2) //묶음에서 값 분할
			{
				//묶음의 값이 서로 일치하고(공) gcd가 value1보다 작다면 변경
				if(value1 == value2 && gcd < value1)
				{
					gcd = value1;
				}
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		// 함수 문제 풀어보기
		//1. 수학적인 값을 계산하는 경우 --> return 함수로 계산합니다.
		//2. 그 이외라면 void 함수로 설계합니다.
		
		//문제 1. 두 정수를 입력합니다.
		//       둘 중에 더 큰 정수를 결과로 출력하는 함수를 작성해 결과를 확인하시오.
		
		//출력 예시) 37 59
		//         59
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(Bigger(a,b));
		
		//문제 2) 정수 number1과 number2가 있을 때, number1과 number2의 최대공약수를 결과로 가지는
		// 함수 GCD를 설계하시오
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		System.out.println(GCD(number1,number2));
		
		
		
		
		
		
		
		sc.close();
	}

}
