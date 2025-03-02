package java_GUI;
import javax.swing.JFrame;
//Swing은 AWT 기반으로 GUI를 보다 쉽게 구현할 수 있도록 도와주는 순수 자바 라이브러리
//AWT(Abstract Window ToolKit) : GUI 프로그래밍을 위한 도구
//GUI(Graphical User Interface) : 그래픽을 이용함으로써 사용자에게 더 직관적인 프로그램의
//								  정보를 제공해줍니다.
//JFrame : GUI에서 프레임을 띄울 때 사용하는 자바의 보조 도구
//장점 : 기능만 잘 연결해주면 괜찮은 결과물이 나오게 됨.
//	    학습이 쉬운 편

//단점 : 각 컴포넌트의 사용법을 잘 알고 있어야 위의 장점을 살릴 수 있습니다.(배울 건 많음)
public class SwingEx01 extends JFrame {
//1. JFrame을 상속받은 클래스로서 개발하기 
//장점 : JFrame에 대한 기능들을 바로바로 사용하는 것이 가능합니다.
	
	//자기 자신에 대한 생성(GUI에 대한 배치와 설정을 진행하는 위치)
	public SwingEx01()
	{
		setSize(300,300);
		//setSize(int width, int height) 프레임 창의 가로와 세로 설정
		setTitle("Swing 예제 1번");
		//setTitle(String title); 창 타이틀에 대한 이름을 설정
		setLocationRelativeTo(null); //창 위치에 대한 설정(null을 넣으면 가운데로)
		setDefaultCloseOperation(EXIT_ON_CLOSE); //X 버튼 클릭해 창을 닫으면 프로그램이 종료
		setVisible(true); //창을 띄웁니다. (true : 창을 띄움 / false : 창을 닫음)
	}
	
	
	public static void main(String[] args) {
		// 위의 생성자를 통해 생성을 진행하면 프로그램이 작동합니다.
		new SwingEx01(); 
	}

}
