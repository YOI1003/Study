package day09;

import java.util.ArrayList;
import java.util.Scanner;

//다음 설명을 기반으로 자동차 관리 프로그램을 구현합니다.

class Car
{
	//자동차 클래스는 회사명 , 모델명, 색상, 최대 속도를 필드 값으로 생성합니다.
	//이때 최대속도는 220으로 고정
	//필드 값을 이용해서 생성자를 만들어주세요.(회사명, 모델명, 색상)을 순서대로 전달받도록 짭니다.
	String c_name, model, color;
	int speed = 220;
	
	public Car(String c_name, String model, String color) {
		super();
		this.c_name = c_name;
		this.model = model;
		this.color = color;
		this.speed = speed;
	}


	public Car() { } //기본 생성자
	
	
	public void Info()
	{
		//회사명
		//모델명
		//색상
		//최대 속도를 출력합니다.
		System.out.println("-----------------------");
		System.out.println("회사명 : " + c_name);
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("최대 속도 : " + speed);
		System.out.println("-----------------------");
	}
	
}


public class Sample03 {

	public static void main(String[] args) {
		// 자동차 관리 프로그램
		Scanner sc = new Scanner(System.in);
		ArrayList<Car> products = new ArrayList<>(); //자동차 명단 리스트 추가
		//products.add(new Car(회사, 모델, 색상));
		
		while(true)
		{
			System.out.println("--------------------------------");
			System.out.println("1. 등록 2. 목록 3. 조회 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("> ");
			int select = sc.nextInt();
		
		switch(select)
		{
		case 1:
			System.out.print("회사명 >>  ");
			String input01 = sc.next();
			System.out.print("모델명 >> ");
			String input02 = sc.next();
			System.out.print("색상 >> ");
			String input03 = sc.next();
			products.add(new Car(input01,input02,input03));
			System.out.println("자동차가 등록되었습니다.");
			//등록을 진행할 경우 회사명, 모델명, 색상 순으로 사용자가 입력을 진행합니다.
			//해당 차를 자동차 명단 리스트에 추가합니다.
			break;
		case 2:
			//목록을 누를 경우 자동차 명단 리스트의 자동차의 정보를 전체 출력합니다.
			if(products.isEmpty())
			{
				System.out.println("현재 등록된 자동차가 없습니다.");
			}
			else
			{
				System.out.println("현재 등록된 자동차 정보");
				for(int i = 0; i < products.size(); i++)
				{
					Car car = products.get(i);
					car.Info();
				}
			}
			break;
		case 3:
			//이름을 검색하고 목록에서 해당 이름이 존재할 경우 해당 모델에 대한 정보를 출력합니다.
			//없을 경우에는 해당 모델이 없음을 안내합니다.
			//힌트 (문자열.equals(문자열2)) : 문자열 1과 문자열2가 서로 같은지를 판단하는 기능 
			System.out.print("조회하고싶은 자동차 모델명을 입력해주세요 >> ");
			String car_name = sc.next();
			for(int i = 0; i < products.size(); i++)
			{
				Car car = products.get(i);
				String name = car.model;
				if(name.equals(car_name))
				{
					car.Info();
				}
				
			}
			break;
		case 4:
			System.out.println("프로그램을 종료합니다.");
			sc.close();
			System.exit(0);
		default:
			System.out.println("잘못된 입력입니다.");
		}
		}
		
		
		
		
		//sc.close();
	}

}
