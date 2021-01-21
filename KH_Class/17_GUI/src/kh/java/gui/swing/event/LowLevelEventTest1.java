package kh.java.gui.swing.event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;
/**
 * Event
 * 컴퓨터(프로그램 )와 사용자간의 상호작용
 * 
 * event->os ->jvm -> event 분배쓰레드 
 * ->각 component event handler 메소드 호출 
 * 1.저수준 이벤트
 * - key event
 * - mouse event
 * -focus event
 * - window event ... 
 * 2.고수준 이벤트  Sematic Event (Component 별처리)
 *  action event		//커버가 된다 
 *  -item event
 *  -adjustment event...
 * 
 *
 */

public class LowLevelEventTest1 extends JFrame{
	
	public LowLevelEventTest1(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
	
		JPanel panel = new JPanel();
		JLabel label = new JLabel("패널");
		panel.add(label);

		//컴포넌트에 이벤트핸들러 객체 바인딩
//		MyMouseListener listener = new MyMouseListener();
//		panel.addMouseListener(listener);		//Listener
//		panel.addMouseWheelListener(listener);		//휠부분
//		panel.addMouseMotionListener(listener);	//드래그 부분 
//		
		panel.addMouseListener(new MyMouseListener2());	//클릭 부분 어댑터 는 필요한것만 갖다 쓰기 
		add(panel);
	}
	public class MyMouseListener2 extends MouseAdapter{	//미리 구현 어댑터 역할 

		@Override
		public void mouseClicked(MouseEvent e) {		//오류난 원인 e 추가 안함
			System.out.println("mouseClicked! ");
			
		}
	}
	public class MyMouseListener implements MouseListener,MouseWheelListener,MouseMotionListener {

		@Override
		public void mouseClicked(MouseEvent e) {		//오류난 원인 e 추가 안함
			System.out.println("mouseClicked! " + e);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {//오류난 원인 e 추가 안함
			System.out.println("mousePressed!");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) { //오류난 원인 e 추가 안함
			System.out.println("mouseReleased!");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("mouseEntered!");
			
		}

		@Override
		public void mouseExited(MouseEvent e) {	//나가다 
			System.out.println("mouseExited!");
			
		}

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {		//마우스 휠 이 움직임 
			System.out.println("mouseWheelMoved");
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseDragged!");
		}

		@Override
		public void mouseMoved(MouseEvent e) {	//드래그 드랍
			System.out.println(e.getX()+","+e.getY());
			
		}
		
	}
	

	public static void main(String[] args) {
		new LowLevelEventTest1(300, 200, "저수준 이벤트").setVisible(true);
	}

}