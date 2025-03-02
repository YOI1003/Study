package day02;
import java.util.Scanner;
public class Sample03 {
	public static void main(String[] args) {
		// 입력
		// 자바에서 제공해주는 Scanner 클래스를 활용해 입력을 진행할 수 있습니다.
		Scanner sc = new Scanner(System.in);
		//Scanner는 기능을 등록해줘야 오류나지 않고 사용할 수 있습니다.
		//등록 기능(import)
	
		//스캐너로 문장 입력하기
		System.out.print("이름을 입력해주세요 >> ");
		//System.out.print()는 출력 기능으로 ln이 빠져서 enter 작업을 진행하지 않습니다.
		String word = sc.next();
		//sc.next()는 문자열을 입력하는 스캐너의 기능입니다.
		System.out.print("나이를 입력해주세요 >> ");
		int age = sc.nextInt();
		//sc.nextInt()는 숫자에 대한 입력을 진행합니다.
		//sc.next + 자료형 => 그 자료형에 대한 입력을 진행합니다. 이때 자료형 맨 앞글자는 대문자
		//ex) nextInt(), nextDouble() ...
		
		System.out.println(word);
		System.out.println(age);
		
		//입력 시의 유의 사항
		//잘못된 형태의 데이터를 입력했을 경우에 오류 발생(Input Mismatch)
		
		int score;
		//자료형 변수명;의 형태로 값을 적지 않고 형태만 적는 것을 변수 선언이라고 부릅니다.
		//이런 형태로 만들 경우는 추가 코드를 통해 값을 넣어주셔야 사용이 가능합니다.
		String sentence;
		
		System.out.print("점수를 입력해주세요 >> ");
		score = sc.nextInt();
		
		//sc.nextLine(); //위에서 남은 enter에 대한 처리
		sc.skip("\r\n"); //다음 문장을 스킵해주세요.라는 기능으로도 해결 가능
		
		System.out.print("입력하실 문장을 작성해주세요 >> ");
		sentence = sc.nextLine();
		//nextLine()은 한 줄 단위로 입력을 받습니다.(띄어쓰기가 포함됩니다.)
		//※ 개행문자 : 텍스트의 한 줄이 끝남을 표시하는 문자 또는 문자열을 의미합니다.(space, enter, \n)
		
		System.out.println(score);
		System.out.println(sentence);
		
		//유의사항 2
		//next()의 경우는 개행문자를 무시하고 입력받습니다.
		//nextLine()의 경우에는 개행문자를 포함해서 입력을 받습니다.
		//위의 코드처럼 nextInt() 등에 의해 작업을 진행하고 다음 작업을 위해
		//enter를 입력하게 되는데 이 과정에서 다음 명령인 nextLine()이
		//해당 enter를 읽어버려 작업을 완료시키는 현상
		
		//해결 방법
		//1. 필요한 경우가 아니라면 nextLine() 대신 next()를 사용합니다.
		
		//2. nextLine() 전에 nextLine()을 먼저 입력해 enter에 대한 처리
		//를 진행합니다.
		
		
		
		
		
		
		//스캐너의 사용이 끝날 경우 스캐너를 사용하지 않는다는 명령을 추가합니다.
		sc.close();
	}
}
