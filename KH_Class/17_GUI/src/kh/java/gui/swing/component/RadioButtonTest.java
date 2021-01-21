package kh.java.gui.swing.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

import kh.java.gui.util.MyUtil;

public class RadioButtonTest extends JFrame {
protected static final String Size = null;
JLabel resultLabel;	//필드 선언 

	public RadioButtonTest(int w, int h, String title) {
		MyUtil.init(this ,w ,h, title);
		
		topOPanel();
		sizePanel();
		resultPanel();
		}
		private void resultPanel() {
		JPanel panel =new JPanel();
		this.resultLabel =new JLabel("사이즈 를 선택하세요  ");		//사이즈 를 선택하는구간 
		panel.add(resultLabel);
		add(panel,BorderLayout.SOUTH);
	}
		private void sizePanel() {		//버튼 선택구간 
		JPanel panel =new JPanel();
		JRadioButton small =new JRadioButton("small");
		JRadioButton medium =new JRadioButton("medium");
		JRadioButton large =new JRadioButton("large");
		//단일 선택을위해서 그루핑 필수 ! 
		ButtonGroup  group=new ButtonGroup();
		group.add(small);
		group.add(medium);
		group.add(large);		//하나씩 선택 
		//이벤트 핸들러 설치 
		ActionListener listener=new ActionListener() {		//익명객체 공용으로 사용 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JRadioButton btn = (JRadioButton)e.getSource();
				resultLabel.setText("[" + btn.getText() + "]를 선택하셨습니다.");
			}
		};
		small.addActionListener(listener);
		medium.addActionListener(listener);
		large.addActionListener(listener);
	
		panel.add(small);
		panel.add(medium);
		panel.add(large);
		add(panel);
		
	}
		private void topOPanel() {
		JPanel panel =new JPanel();
		JLabel label =new JLabel("커피 사이즈를 선택하세요 .");
		panel.add(label);
		add(panel,BorderLayout.NORTH);
		
	}
		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) {
		new RadioButtonTest(300,200,"라디오 버튼").setVisible(true);

	}

}
