package kh.java.gui.swing.container.layout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;
/**
 * 내부 클래스 
 * 외부 클래스에서 자유롭게 가져다 사용할수있다 
 */
public class BorderLayoutTest extends JFrame {
	public BorderLayoutTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		//JFrame 객체의 기본은 layout은 Borderlayout이다 
		JPanel north = new BorderPanel("북",Color.CYAN);		// 한번더 해보기
		JPanel south = new BorderPanel("남",Color.BLUE);
		JPanel east = new BorderPanel("동",Color.pink);
		JPanel west = new BorderPanel("서",Color.gray);
		JPanel center = new BorderPanel("가운데",Color.red);
		//생성한 패널은 JFrame에 add해줘야 보인다
		//두번째 인자로 위치지정을 안해주면 무조건 가운데임
		add(north,BorderLayout.NORTH);
		add(south, BorderLayout.SOUTH);
		add(east,BorderLayout.EAST);
		add(west,BorderLayout.WEST);
		add(center,BorderLayout.CENTER);
		add(center);
	}

	/*
	 * 내부클래스
	 */
	public class BorderPanel extends JPanel {
		
		public BorderPanel(String title,Color c ) {
			setBackground(c);//배경색지정 
			JLabel label = new JLabel(title);
			add(label);//현재 JPanel객체에 추가
		}
		
	}
	
	public static void main(String[] args) {
		new BorderLayoutTest(500, 500, "Border LayoutTest").setVisible(true);
	}

}