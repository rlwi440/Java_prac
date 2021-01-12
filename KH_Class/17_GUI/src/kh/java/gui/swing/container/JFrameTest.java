package kh.java.gui.swing.container;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * JFrame 객체생성
 * new Frame () 직접객체 생성하기 
 * JFrame 객체생성2
 * JFrame을상속한 커스텀 클래스 작성후 객체 생성 
 */
public class JFrameTest {
	public static void main(String[] args) {
		JFrame f =new JFrame();
		 f.setTitle("깔끔한청년");
		f.setSize(500,500);		//x축 y축 의 크기 를 지정 윈도우크기 위치조정 
		f.setLocation(500,300);		
		//x버튼 -> 프로그램종료 처리
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 //종료처리 해주는 구분 
		 f.add(new JLabel("안녕"));
		 //자식 컴포넌트 :컨터이너에 
		f.setLocationRelativeTo(null);
		//시각화 처리 (맨 마지막에 작성)
		f.setVisible(true);	//프로그램 
		
		
	}
}
