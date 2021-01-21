package kh.java.gui.swing.change.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class custompanel  extends JPanel{
	private JFrame parent;
	public custompanel(JFrame parent, Color c, String title) {
	this.parent=parent;
	setBackground(c);
	setLayout(new BorderLayout());
	add(new JLabel(title),BorderLayout.NORTH);
	
	JPanel linkpanel =new JPanel();
	JButton btn0= new JButton("0");
	JButton btn1= new JButton("1");
	JButton btn2= new JButton("2");
	linkpanel.add(btn0);
	linkpanel.add(btn1);
	linkpanel.add(btn2);
	add(linkpanel,BorderLayout.SOUTH);
	//각 버튼별 패널 교체하기 
	ActionListener listener =new ActionListener() {
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int index =Integer.parseInt(((JButton)e.getSource()).getText());
			System.out.println(index);
			JPanel nextJPanel =MainFrame.panels[index];
			MyUtil.changePanel(parent,custompanel.this,nextJPanel);
		}
	};
	btn0.addActionListener(listener);
	btn1.addActionListener(listener);
	btn2.addActionListener(listener);
	}

}
