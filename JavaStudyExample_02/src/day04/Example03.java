package day04;
import java.util.Scanner;

class ScoreManager
{
	private static ScoreManager instance;
	public int score = 0;
	public void getScore()
	{
		score += (int)(Math.random() * 100)+1; //0부터 100사이의 점수 획득
	}
	public void dropScore()
	{
		score /= 2; 
	}
	public void check()
	{
		System.out.println("현재의 점수: " + score);
	}
	private ScoreManager()
	{
		
	}
	
	public static ScoreManager getInstance()
	{
		if(instance == null)
			instance = new ScoreManager	();
		return instance;
	}
}
class Unit
{
	protected int hp; 
	protected int o_hp;
	protected int atk;
	protected int o_atk;
	protected int dead = 0; //죽은 횟수
	
	public void Battle(Unit other)
	{
		other.hp -= atk;
	}
}
class Player extends Unit
{
	String playername;
	
	public void player(String name, int h, int a)
	{
		playername = name;
		hp = h; //전투로 인해 변경될 hp
		o_hp = h; //원래의 hp
		atk = a; 
	}
	
	
	//메소드 오버라이딩: 상속 관계에서 부모의 메소드에 대한 재정의를 진행하는 것을 의미합니다.
	//super는 부모 클래스를 표현하는 뜻입니다.
	@Override
	public void Battle(Unit other) {
		// TODO Auto-generated method stub
		super.Battle(other);
		if(other.hp <= 0)
		{
			//getInstance는 정적 메소드이기 때문에 클래스 생성 없이 진행할 수 있습니다.
			//그리고 getInstance()는 null이면 new ScoreManager()로 생성이 되고 아니면 기존의 값 그대로 사용
			ScoreManager.getInstance().getScore();
			other.o_hp *= 2; //원래의 hp를 2곱해준 후
			other.hp = other.o_hp; // 그 값을 현재 hp에 대입해줌
			other.o_atk *= 2;
			other.atk = other.o_atk;
			other.dead++; //죽은 횟수 +1
		}
	}
	
}
class Monster extends Unit
{
	String monstername;
	
	public void monster(String name, int a, int b)
	{
		hp = a; //전투로 인해 변경될 hp
		o_hp = a; //원래 입력한 값의 hp
		atk = b; //변경될 atk
		o_atk = b;  //원래의 atk
		monstername = name;
	}

	@Override
	public void Battle(Unit other) {
		// TODO Auto-generated method stub
		super.Battle(other);
		if(other.hp <= 0)
		{
			System.out.println("*****************");
			System.out.println("    죽었습니다!");
			System.out.println("*****************");
			ScoreManager.getInstance().dropScore();
			other.hp = other.o_hp;
			other.dead++;
		}
	}
}

class Store extends Unit
{
	public void store(Unit other, int s)
	{
		switch(s)
		{
		case 1:
			if(ScoreManager.getInstance().score < 30) //점수가 30점보다 적을 경우 구매 불가
				System.out.println("점수가 부족합니다."); 
			else
			{
				other.hp += 20; //현재 hp 20증가
				other.o_hp += 20; //원래 hp 20증가
				ScoreManager.getInstance().score -= 30; //30점 차감
				System.out.println("최대체력이 20 늘어났습니다.");
			}
			break;
		case 2:
			if(ScoreManager.getInstance().score < 70)
				System.out.println("점수가 부족합니다.");
			else
			{
				other.hp += 50;
				other.o_hp += 50;
				ScoreManager.getInstance().score -= 70;
				System.out.println("최대체력이 50 늘어났습니다.");
			}
			break;
		case 3:
			if(ScoreManager.getInstance().score < 50)
				System.out.println("점수가 부족합니다.");
			else
			{
				other.hp += 50;
				ScoreManager.getInstance().score -= 50;
				System.out.println("체력이 50 회복되었습니다.");
			}
			break;
		case 4:
			if(ScoreManager.getInstance().score < 75)
				System.out.println("점수가 부족합니다.");
			else
			{
				other.hp += 80;
				ScoreManager.getInstance().score -= 75;
				System.out.println("체력이 80 회복되었습니다.");
			}
			break;
		case 5:
			if(ScoreManager.getInstance().score < 40)
				System.out.println("점수가 부족합니다.");
			else
			{
				other.atk += 10;
				ScoreManager.getInstance().score -= 40;
				System.out.println("공격력 10 상승!");
			}
			break;
		case 6:
			if(ScoreManager.getInstance().score < 100)
				System.out.println("점수가 부족합니다.");
			else
			{
				other.atk += 30;
				ScoreManager.getInstance().score -= 100;
				System.out.println("공격력 30 상승!");
			}
			break;
		case 7:
			break;
		default :
			System.out.println("잘못된 입력입니다.");
		}
	}
}


public class Example03 {

	public static void main(String[] args) {
		// 싱글톤 예제
		Scanner sc = new Scanner(System.in);
		System.out.print("플레이어 이름: ");
		String p_name = sc.next();
		System.out.print("플레이어 체력: ");
		int p_hp = sc.nextInt();
		System.out.print("플레이어 공격력: ");
		int p_atk = sc.nextInt();
		Player player1 = new Player();
		player1.player(p_name, p_hp,p_atk);
		
		System.out.print("몬스터 이름: ");
		String m_name = sc.next();
		System.out.print("몬스터 체력: ");
		int m_hp = sc.nextInt();
		System.out.print("몬스터 공격력: ");
		int m_atk = sc.nextInt();
		Monster monster1 = new Monster();
		monster1.monster(m_name,m_hp,m_atk);  //플레이어와 몬스터의 이름 및 체력, 공격력 입력
		
		while(true)
		{
			System.out.println("================================================================");
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 전투  2. 상점  3. 전투 종료");
			ScoreManager check = ScoreManager.getInstance();
			check.check();
			System.out.println("================================================================");
			System.out.print(">> ");
			int select = sc.nextInt();
			int off = 0;
		
		
		switch(select)
			{
			case 1 :
				player1.Battle(monster1);
				monster1.Battle(player1);
				System.out.println(player1.playername + "님의 체력: " + player1.hp);
				System.out.println(player1.playername + "님의 공격력: " + player1.atk);
				System.out.println("--------------------VS-------------------------");
				System.out.println(monster1.monstername + "의 체력: " + monster1.hp);
				System.out.println(monster1.monstername + "의 공격력: " + monster1.atk);
				break;
			case 2 :
				System.out.println("================================================================");
				System.out.println("상점에 입장하셨습니다. 무엇을 구매 하시겠습니까?");
				System.out.println("    1. 최대체력 +20 | 2. 최대체력 + 50 | 3. 체력회복 +50");
				System.out.println("가격 -    30원             70원               50원");
				System.out.println("    4. 체력회복 +80 | 5. 공격력 +10 업 | 6. 공격력 +30 업");
				System.out.println("가격 -    80원             40원              100원");
				System.out.println();
				check.check();
				System.out.println("7. 상점 나가기");
				System.out.println("================================================================");
				Store shopping = new Store();
				while(true)
				{
					System.out.print(">> ");
					int select2 = sc.nextInt();
					shopping.store(player1, select2);
					check.check();
					if(select2 == 7)
					{
						break;
					}
				}
				break;
			case 3 :
				sc.close();
				off++;
				break;
			default :
				System.out.println("잘못된 입력입니다.");
			}
			if(off == 1)
			{
				break;
			}
		}
		System.out.println("전투가 종료되었습니다.");
		System.out.println("     최종 결과     ");
		System.out.println();
		System.out.println("     죽은 횟수     ");
		System.out.println("      " + player1.dead);
		System.out.println("     처치 횟수     ");
		System.out.println("      " + monster1.dead);
		System.out.println("    최종 스코어     ");
		System.out.println("      " + ScoreManager.getInstance().score);
	}
}
