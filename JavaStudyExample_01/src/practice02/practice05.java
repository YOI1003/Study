package practice02;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 >> ");
		int number = sc.nextInt();
		int sum = 0; 
		
		while(number > 0) // number가 계속해서 10으로 나누어져서 결국 마지막엔 0이 됨
		{
			sum += number % 10; //number에서 10을 나눈 나머지 즉, 일의자리 숫자를 sum에 더해줌
			number /= 10; // number에서 10을 나눈 몫을 구해 일의자리 숫자를 없애줌
		}
		System.out.println("답: " + sum);
		
		sc.close();
		
	}

}
