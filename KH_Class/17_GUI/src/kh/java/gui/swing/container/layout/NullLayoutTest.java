package kh.java.gui.swing.container.layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import kh.java.gui.util.MyUtil;
public class NullLayoutTest extends JFrame {
	private JTextField id;		//지역변수도 가능하다 .
	private JPasswordField pwd;
	public NullLayoutTest(int w, int h, String title) {		//단축키 활용
		//파라미터 생성자 바꿔주자 기원아.. 제발..
	MyUtil.init(this, w, h, title);
	//layout무효화
	setLayout(null);
	
	JLabel labelId=new JLabel("아이디: ");
	labelId.setBounds(50,100,60,50); //int x,int y ,width,height
	id =new JTextField();
	id.setBounds(110,100,200,50);//int x,int y ,width,height
	JLabel labelPW=new JLabel("비번: ");
	labelPW.setBounds(50,160,60,50);
	pwd =new JPasswordField();
	pwd.setBounds(110,160,200,50);
	JButton bt =new JButton("로그인 : ");	
	bt.setBounds(330,100,100,110);		//int x 가로 축 int y세로축  
	
	//사용자 로그인버튼을 클릭했을때 ,입력한 id,pwd값를 가져오기
	//사용자 Event +EventHandling
	//1.이벤트 처리 객체생성 (클래스작성)
	//2.btn 컴포넌트와 연결(binding)
	bt.addActionListener(new LoginListener());	//alert 알람설정 과 똑같다.
		//bt.addActionListener(new LoginListener());					
	
	add(labelId);
	add(id);
	add(labelPW);
	add(pwd);
	add(bt);
	}
/**
 * JButton용 action event handler클래스작성
 * event handler
 * event listener
 * 
 */
	public class LoginListener implements ActionListener {	//implements ActionListener
		/**
		 *JButton 의 ActionEvent가 발생시 자동호출되는 메소드  	
		 */
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼을 클릭했습니다.");
		System.out.println("id: "+id.getText());		//자바프로그램 내부에서 사용가능
		System.out.println("pwd :"+new String(pwd.getPassword()));
		}
	}
	public static void main(String[] args) {
		new NullLayoutTest(500,500,"로그인").setVisible (true);

	}

}
