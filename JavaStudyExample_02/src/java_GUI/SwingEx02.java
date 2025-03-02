package java_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
//컨테이너(Container) : 컴포넌트를 포함할 수 있는 GUI의 요소
//					  ex) JFrame, JDialog (큰 단위), JPanel(작은 단위)

//컴포넌트(Component) : 컨테이너에 연결할 수 있는 GUI의 요소
//					  ex) 버튼, 텍스트 영역 , 라벨 등을 표현

public class SwingEx02 extends JFrame {

	public SwingEx02()
	{
		//=========  [이름 , 크기 , 위치 설정] =============
		setTitle("Swing 예제 2번");
		//setSize(200,300);
		//setLocation(-800,200);
		setBounds(-800,200,500,300); //x,y, 가로, 세로
		
		//=========   컨테이너 연결 ==============
		JPanel container  = new JPanel();
		
		//=========  컴포넌트 연결 ===============
		JButton button01 = new JButton("버튼 1");
		JButton button02 = new JButton("버튼 2");
		JButton button03 = new JButton("버튼 3");
		
		container.add(button01); //컨테이너에 버튼(컴포넌트)을 추가하는 기능(컨테이너에 올린다.)
		container.add(button02);
		container.add(button03);
		
		add(container); //프레임에 올린다.
		
		//========= 활성화 여부 설정 ==============
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new SwingEx02();
	}

}
