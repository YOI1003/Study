package practice;
import java.util.Scanner;
public class practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1학년 성적 입력 >> ");
		int grade1 = sc.nextInt();
		System.out.print("2학년 성적 입력 >> ");
		int grade2 = sc.nextInt();
		System.out.print("3학년 성적 입력 >> ");
		int grade3 = sc.nextInt();
		System.out.print("4학년 성적 입력 >> ");
		int grade4 = sc.nextInt();
		
		System.out.println("시험 결과");
		if(grade1 >= 60)
		{
			System.out.println("1학년 - 합격");
		}
		else
		{
			System.out.println("1학년 - 불합격");
		}
		if(grade2 >= 60)
		{
			System.out.println("2학년 - 합격");
		}
		else
		{
			System.out.println("2학년 - 불합격");
		}
		if(grade3 >= 60)
		{
			System.out.println("3학년 - 합격");
		}
		else
		{
			System.out.println("3학년 - 불합격");
		}
		if(grade4 >= 70)
		{
			System.out.println("4학년 - 합격");
		}
		else
		{
			System.out.println("4학년 - 불합격");
		}
		
		
		
		sc.close();
	}

}
