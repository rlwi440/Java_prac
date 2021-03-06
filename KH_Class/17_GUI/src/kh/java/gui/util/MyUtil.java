package kh.java.gui.util;

import javax.swing.JFrame;
import javax.swing.JPanel;

import kh.java.gui.swing.change.panel.custompanel;

public class MyUtil {

	public static void init(JFrame f, int w, int h, String title) {
		f.setTitle(title);
		f.setSize(w,h);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void changePanel(JFrame parent, custompanel current, JPanel next) {
		parent.remove(current);
		parent.add(next);
		parent.revalidate();//container 하위 계층구조 를 새로고침
		parent.repaint();		//화면 다시그리기 
	}

}
