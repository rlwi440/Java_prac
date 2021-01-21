package kh.java.gui.swing.component;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import kh.java.gui.util.MyUtil;

public class JTableTest  extends JFrame{

	List<Member> list = new ArrayList<>();
	
	{
		list.add(new Member("홍길동", "서울", 24, false));
		list.add(new Member("신사임당", "부산", 48, true));
		list.add(new Member("세종", "서울", 67, true));
		list.add(new Member("홍길동", "서울", 24, false));
		list.add(new Member("신사임당", "부산", 48, true));
		list.add(new Member("세종", "서울", 67, true));
		list.add(new Member("홍길동", "서울", 24, false));
		list.add(new Member("신사임당", "부산", 48, true));
		list.add(new Member("세종", "서울", 67, true));
		list.add(new Member("홍길동", "서울", 24, false));
		list.add(new Member("신사임당", "부산", 48, true));
		list.add(new Member("세종", "서울", 67, true));
		list.add(new Member("홍길동", "서울", 24, false));
		list.add(new Member("신사임당", "부산", 48, true));
		list.add(new Member("세종", "서울", 67, true));
	}
	
	
	public JTableTest(int w,int h,String title) {
		MyUtil.init(this, w, h, title);
		
		
		//컬럼정보
		Object[] columnNames = {
			"이름", "주소", "나이", "결혼여부"
		};
		//행정보
		Object[][] rowData =new Object[list.size()][columnNames.length];
		for (int i=0; i<list.size(); i++){
			Member m=list.get(i);
			rowData[i][0]=m.getName();
			rowData[i][1]=m.getAddr();
			rowData[i][2]=m.getAge();
			rowData[i][3]=m.isMarried();
		}
		
		//테이블생성
		JTable table =new JTable(rowData,columnNames);
		//헤더클릭시 정렬기능
		table.setAutoCreateRowSorter(true);
		//viewport지정
		table.setPreferredScrollableViewportSize(new Dimension(500, 100));

		//셀 편집시 이벤트처리하기 
		TableModel model =table.getModel();
		model.addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				int row =e.getFirstRow();
				int col =e.getColumn();
				System.out.println(row+ " ,"+col);
				Object data=model.getValueAt(row, col);
				System.out.println(data);
				
			}
		});
		JButton btn =new JButton("저장");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int rowlen =model.getRowCount();
				int collen =model.getColumnCount();
				List <Member>newList =new ArrayList<Member>();
				for (int i=0; i<rowlen; i++) {
					Member newmember =new Member();
					for(int j=0; j<collen; j++) {
						Object data= model.getValueAt(i,j);
//						System.out.println(data);
						switch (j) {
						case 0:newmember.setName((String)data);break;
						case 1:newmember.setAddr((String)data);break;
						case 2:newmember.setAge(Integer.parseInt((String)data.toString()));break;
						case 3:newmember.setMarried((boolean)data);break;
						}
					}
					newList.add(newmember);
				}
				for(Member newmember: newList)
					System.out.println(newmember);
			}
		});
		//스크롤페인에 추가 
		JScrollPane scrollpane =new JScrollPane(table);
		add(scrollpane);
		add(btn,BorderLayout.SOUTH);		//pack 사용하기
		pack();
	}

	public static void main(String[] args) {
		new JTableTest(500, 200, "Jtable").setVisible(true);
		

	}

}
