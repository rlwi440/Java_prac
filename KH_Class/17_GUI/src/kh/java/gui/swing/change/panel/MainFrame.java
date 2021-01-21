package kh.java.gui.swing.change.panel;

import java.awt.Color;

import javax.swing.JFrame;

import kh.java.gui.util.MyUtil;

public class MainFrame extends JFrame{
	public static custompanel[] panels=new custompanel[5];
	public MainFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		//panls 객체 할당
		panels[0]=new custompanel(this,Color.GREEN ,"panel0");	//부모 
		panels[1]=new custompanel(this,Color.orange ,"panel1");
		panels[2]=new custompanel(this,Color.red,"panel2");
		
		add(panels[0]);
		
		
	}

}
