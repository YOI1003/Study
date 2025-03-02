package day09;

class Student //학생 클래스
{
	int sid; //학생의 번호
	String name; //학생의 이름
	Scores scores; //학생이 가지고 있을 점수에 대한 정보
	//has a 상속: 특정 클래스가 특정 클래스 객체를 필드 값으로 가지고 있는 경우
	
	
	//생성자(Constructor)
	//클래스명 인스턴스명 = new 생성자(); <- 에 해당합니다.
	//생성자는 객체를 생성할 때 호출되는 메소드입니다.
	//따로 void, int 같은 타입을 가지지 않는 메소드이며
	//클래스의 이름과 동일한 메소드입니다.
	
	//따로 만들지 않을 경우 클래스는 자기 이름을 가진 생성자를 자동으로 가지고 있습니다.
	//ex) Action 클래스를 만들경우 생성자는 Action();
	
	//오버로딩(이름은 같은데 매개 변수의 종류, 개수가 다르게 설계하는 경우)을 통해
	//생성자를 수정할 수 있습니다.
	
	public Student(int sid, String name, Scores scores) {
		super(); //기존의 방식대로 만들겠다는 뜻
		this.sid = sid;
		this.name = name;
		this.scores = scores;
		
	}
	//학생의 정보를 출력합니다.
	public void info()
	{
		System.out.println("---학생 정보---");
		System.out.println("번호 : " + sid);
		System.out.println("이름 : " + name);
		System.out.println("국어 점수 : " + scores.kor);
		System.out.println("영어 점수 : " + scores.eng);
		System.out.println("수학 점수 : " + scores.mat);
		System.out.println("총점 : " + scores.total());
		System.out.println("평균 : " + scores.average());
		System.out.println("----------------------------");
	}
	
	
	
}

class Scores //점수 클래스
{
	int kor, eng, mat; //국어 영어 수학 순서

	public Scores(int kor, int eng, int mat) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public double average() {
		// 정수 / 3을 진행하면 계산과정에서 소수점이 저장이 안되기 때문에 (double)을 통해 캐스팅으로 정수 -> 실수로 변경해서 적용
		return (double)total() / 3;
	}

	public double total() {
		// TODO Auto-generated method stub
		return kor + eng + mat;
	}
	
}


public class Sample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scores scores = new Scores(100, 90, 95);
		Student student01 = new Student(1,"유동현",scores); //생성자에 설계한 순서대로 값을 작성
		Student student02 = new Student(2,"김동현",new Scores(80,70,67)); 
		//마지막 값은 클래스였기 때문에 직접 값을 생성하는 방식도 고려할 수 있습니다.
		
		student01.info();
		student02.info();
		
		
		
		
		
		
		
		
	}

}
