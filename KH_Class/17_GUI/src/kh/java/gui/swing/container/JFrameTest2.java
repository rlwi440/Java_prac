package kh.java.gui.swing.container;

import javax.swing.JFrame;

public class JFrameTest2 extends JFrame {
	public JFrameTest2() {
		setTitle("깔끔한청년");	//이름 제목 
		setBounds(200,300,500,500);		// x축 y축  width,height
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//끄는거 설정
		setVisible(true);//시각화 처리 
	}
	
	public static void main(String[] args) {
	new JFrameTest2();	
		

	}

}
