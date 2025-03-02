package java_GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//가위 바위 보 GUI 프로그램 개발
import javax.swing.JPanel;

public class RSP extends JFrame{

	//RSP의 필드	
	//이미지 아이콘은 이미지의 경로를 넣고 생성하면 쓸 수 있는 컴포넌트입니다.
	//자료형[] 배열명 = { 요소1, 요소2, 요소3...}; 배열에 값 넣고 초기화
	ImageIcon[] img = 
		{
			new ImageIcon("res/Image01.png"),
			new ImageIcon("res/Image02.png"),
			new ImageIcon("res/Image03.png")
		};
	RSPResult rspResult = new RSPResult();
	RSPPanel rsp_panel = new RSPPanel(); //내부 클래스를 필드로 생성
	//내부 클래스(클래스 내부에서 만들어지는 클래스)
	//가위 바위 보 버튼 만들기
	class RSPPanel extends JPanel
	{
		JButton[] btn = new JButton[3];
		
		//버튼 생성 시 호출
		public RSPPanel()
		{
			//이미지 개수만큼 반복해서 버튼에 이미지 추가
			for(int i = 0 ; i < img.length; i++)
			{
				btn[i] = new JButton(img[i]); //버튼에 이미지 넣기
				this.add(btn[i]); //여기서 this는 자기 자신(RSPButton)
				//RSPButton은 현재 JPanel의 기능을 가지고 있음.
				
				btn[i].addActionListener(new EventHandler());
				//버튼의 액션 리스너에 EventHandler를 등록합니다.
			}
		}
	}	

	//가위 바위 보에 대한 결과
	class RSPResult extends JPanel
	{
		//JLabel은 패널 위에 작성하는 일반적인 텍스트를 의미합니다.
		JLabel user = new JLabel("플레이어");
		JLabel computer = new JLabel("상대방");
		JLabel result = new JLabel("승자");
		public RSPResult()
		{
			setBackground(Color.green); //뒷 배경 색깔 설정
			add(user);
			add(result);
			add(computer);
		}	
		public void Setting(Icon img, Icon img2, String result)
		{
			user.setIcon(img);
			user.setHorizontalTextPosition(JLabel.LEFT); //버튼 글자의 수평 위치를 설정합니다.
			//setVerticalTextPosition(); 버튼 글자의 수직 위치를 설정합니다.
			//수직 표현 TOP, CENTER, BOTTOM
			//수평 표현 LEFT, CENTER, RIGHT
			
			computer.setIcon(img2);
			this.result.setText(result); //결과 텍스트를 설정
			this.result.setForeground(Color.RED); //글씨 색상 변경
			this.result.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			//다이얼로그체, 볼드 처리, 크기 20
			
			//폰트 설정
			//Font.BOLD(진하게) Font.ITALIC(기울임) Font.PLAIN (보통)
			//Font.BOLD + Font.ITALIC (진한 기울임)			
		}	
	}
	
	//버튼을 눌렀을 경우에 대한 이벤트 설계
	//컴포넌트에 대한 특정 동작에 맞춰 기능을 진행하는 것 --> 이벤트
	
	class EventHandler implements ActionListener //import 처리 완료
	{
		//alt + shift + s + v를 통해 actionPerformed 메소드를 구현합니다.
		@Override
		public void actionPerformed(ActionEvent e) {
			// 내부에서 이벤트가 호출되면 실행될 함수입니다.
			JButton btn = (JButton) e.getSource(); //e.getSource()는 액션 이벤트로 전달받은 대상을 return합니다.
												   //형태에 맞게 캐스팅을 진행해줘서 사용합니다.
			
			int com_choice = (int)(Math.random() * 3); // 0 ~ 2 중 랜덤으로 선택
			
			String result = null; //결과에 대한 표현
						
			if(btn.getIcon() == img[RSP_SELECT.SCISSORS]) //버튼의 아이콘이 가위인 경우
			{
				//이기는 경우
				if(com_choice == RSP_SELECT.PAPER)
				{
					result = "승리";
				}	
				//지는 경우
				else if(com_choice == RSP_SELECT.ROCK)
				{
					result = "패배";
				}
				else
				{
					result = "무승부";
				}
			}
			else if(btn.getIcon() == img[RSP_SELECT.ROCK]) //바위인 경우
			{				//이기는 경우
				if(com_choice == RSP_SELECT.SCISSORS)
				{
					result = "승리";
				}	
				//지는 경우
				else if(com_choice == RSP_SELECT.PAPER)
				{
					result = "패배";
				}
				else
				{
					result = "무승부";
				}
				
			}
			else if(btn.getIcon() == img[RSP_SELECT.PAPER]) //보인 경우
			{
				//이기는 경우
				if(com_choice == RSP_SELECT.ROCK)
				{
					result = "승리";
				}	
				//지는 경우
				else if(com_choice == RSP_SELECT.SCISSORS)
				{
					result = "패배";
				}
				else
				{
					result = "무승부";
				}
			}
			
			//rspResult 클래스에 버튼으로부터 얻은 값과, 랜덤으로 설정된 값, 결과를 전달해
			//설정을 진행합니다.
			rspResult.Setting(btn.getIcon(), img[com_choice], result);
			
			
		}
	//액션 리스너(Action Listener)
	//--> 특정 행 동 발생 시 실행(이벤트)되는 인터페이스
	//사용 방법
	//클래스 내부에 액션 리스너를 구현해야하는 클래스를 설계하고 해당 객체를 생성해 사용합니다. 
		
	
		
	}
	
	
	
	//GUI 설계
	public RSP()
	{
		super("가위 바위 보");//RSP의 부모 클래스 JFrame의 형태로 생성을 진행합니다.
		//JFrame("타이틀 이름")의 형태로 생성하면 타이틀 이름이 변경됩니다.
		
		add(rsp_panel, "South"); //남쪽 위치에 패널 추가
		add(rspResult,"Center"); //중앙 위치에 패널 추가
		
		setSize(800,800);
		setLocation(800,150); //사용자 위치에 맞게 배치
		setDefaultCloseOperation(EXIT_ON_CLOSE); //종료 버튼 누르면 게임 종료
		setVisible(true); //화면 보이기
	}
	
	
	public static void main(String[] args) {
		// RSP 클래스를 생성
		new RSP();
	}

}

