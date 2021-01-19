package Question7;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame {
	JFrame frm = new JFrame();
	JPanel p1 = new JPanel();
	JLabel l1 = new JLabel("점수를입력해주세요");
	// 점수입력
	JLabel j1 = new JLabel("자바 :");
	JTextField javaScore = new JTextField(10);
	// JavaScore 
	JLabel j2 = new JLabel("Sql: ");
	JTextField  sqlScore = new JTextField(10);
	//SqlScore
	JButton calcBtn = new JButton("계산하기");
	//calcbtn 버튼 
	JLabel j3 = new JLabel("총점:");
	JTextField total = new JTextField(10);
	//total
	JLabel j4 = new JLabel("평균: ");
	JTextField average = new JTextField(10);
	//average

	public ScoreFrame() {
		p1.add(l1).setBounds(0, 10, 500, 50);
		l1.setFont(new Font("맑은고딕", Font.BOLD, 50));
		p1.add(j1).setBounds(0, 50,200, 70);
		j1.setFont(new Font("맑은고딕", Font.BOLD, 15));
		p1.add(javaScore).setBounds(50, 75,150, 20);
		p1.add(j2).setBounds(250, 50, 200, 70);
		j2.setFont(new Font("맑은고딕", Font.BOLD, 15));
		p1.add(sqlScore).setBounds(290, 75, 150, 20);
		p1.add(calcBtn).setBounds(150, 180, 145, 30);
		j3.setFont(new Font("맑은고딕", Font.BOLD, 15));
		p1.add(j3).setBounds(0,300,200,70);
		p1.add(total).setBounds(40, 330, 150, 20);
		p1.add(j4).setBounds(205, 330, 200, 20);
		j4.setFont(new Font("맑은고딕", Font.BOLD, 15));
		p1.add(average).setBounds(250, 330, 200, 20);
		p1.setLayout(null);
	
		frm.add(p1);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(500, 430);
		frm.setVisible(true);
		frm.setLayout(null);
		calcBtn.addActionListener(new ActionHandler());
		
	}
	public class  ActionHandler  implements ActionListener{
		//actionHandler 내부클래스 입력구간 
		@Override
		public void actionPerformed(ActionEvent e) {
			calcBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int score1 =Integer.parseInt(javaScore.getText());
					System.out.println(score1);
					int score2 =Integer.parseInt(sqlScore.getText());
					System.out.println(score2);
					total.setText((score1+ score2) +" " );
					average.setText(((score1+score2)/2) +" ");
					
				}
			});
		}
	}
}
