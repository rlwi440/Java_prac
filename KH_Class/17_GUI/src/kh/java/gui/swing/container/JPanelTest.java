package kh.java.gui.swing.container;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelTest extends JFrame{
	public JPanelTest() {
		setTitle("깔끔한청년");	//제목입력
		setSize(800,500);	// int x ,int y, width,height
		setLocationRelativeTo(null);	//화면 중앙에 띄우기 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//끄는 옵션설정 
		setVisible(true);	//설정값?!
		//JFrame의 기본 LayoutManager객체는 BorderLayout 이다 .
	//	setLayout(new BorderLayout());
		//null layout: :layout manager객체를 사용하지않고 직접좌표를 저장함
		
		//자식 컴포넌트 추가 
		JPanel Panel1 =new JPanel();
		Panel1.setBackground(new Color(0,255,0));//자바 스크립트 color 비슷하다 . 
		JLabel label1 =new JLabel("panel1");//라벨 설정
		Panel1.setBounds(100,50,300,400);
		Panel1.add(label1);
		add(Panel1);
		JPanel panel2 =new JPanel();
		panel2.setBackground(Color.pink);
		JLabel label2 =new JLabel("panel2");
		panel2.setBounds(400,50,300,400);
		panel2.add(label2);
		add(panel2);
	}
	
 public static void main(String[] args) {
	new JPanelTest();
}
}
