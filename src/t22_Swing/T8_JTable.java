package t22_Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import t23_Hoewon.hoewonDAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings({"serial","unchecked"})
public class T8_JTable extends JFrame {
	private JTable table;
	JPanel pn1, pn2, pn3;
	JLabel lblTitle ;
	JButton btnSelect, btnExit;
	Vector title, vDate;
	DefaultTableModel dtm;
	JScrollPane scrollPane ;
	
	hoewonDAO dao = new hoewonDAO();
	
	public T8_JTable() {
		setTitle("콤보상자/리스트박스 연습");
		setSize(600,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		 pn1 = new JPanel();
		pn1.setBounds(0, 0, 584, 62);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		 lblTitle = new JLabel("회 원 리 스 트");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(12, 10, 560, 42);
		pn1.add(lblTitle);
		
		 pn2 = new JPanel();
		pn2.setBounds(0, 64, 584, 314);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		
		 pn3 = new JPanel();
		pn3.setBounds(0, 379, 584, 62);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		 btnSelect = new JButton("선택한 셀 값 출력");
		btnSelect.setBounds(12, 10, 166, 42);
		pn3.add(btnSelect);
		
		 btnExit = new JButton("작업종료");
		btnExit.setBounds(406, 10, 166, 42);
		pn3.add(btnExit);

		//여기에 데이터베이스를 넣음
		
		
		
		//JTable 설계
		//1.'부제목'을 Vector로 만들어 준다.(저장)
		 title = new Vector<>();
		 title.add("번호");
		 title.add("이름");
		 title.add("나이");
		 title.add("성별");
		 title.add("가입일");
		 title.add("주소");
		
		 //2.'데이터'를 Vector타입으로 만들어준다. 데이터는 데이터베이스에서 가져온다.
		  vDate = dao.getHoewonList();
//		 System.out.println("vDate : "+vDate);
		 
		 //3. DB에서 가져온 자료(vData)와 타이틀(Title)을 DefaultTableMode(데이터,타이틀);객체에 생성하면서 담아준다.
		  dtm = new DefaultTableModel(vDate, title);
		 
		 //4.DefaultTableModel에 담긴 벡터타입의 '데이터/타이틀'을 JTable객체 생성시에 담아준다.
		  table = new JTable(dtm);
		  
		 //5.자료가 담긴 JTable객체를 JScrollPane객체 생성시에 담아준다.
//		  scrollPane.setViewportView(table); //생성후담으면 못 씀
		  scrollPane = new JScrollPane(table);
			scrollPane.setBounds(12, 10, 560, 294);
			pn2.add(scrollPane);
		  
		 //6.실행시킨후, 출력된 화면에서 결과를 확인한다. 
		 
			
		//JTable속성 제어연습
		//table의 컬럼크기/크기고정/셀의 위치고정
		table.getColumnModel().getColumn(0).setMaxWidth(30);  //컬럼의 최대크기 지정
		table.getColumnModel().getColumn(2).setMaxWidth(50);
		table.getColumnModel().getColumn(0).setResizable(false);  //컬럼 크기 변경 불가
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getTableHeader().setReorderingAllowed(false);  //컬럼 고정
			
		//테이블 안의 셀의 내용을 수평 정렬하기
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();
//		tcm.getColumn(3).setCellRenderer(dtcr); // 3번인덱스를 가운데로 랜더링해라
		 
		//전체셀 가운데정렬
		for(int i=0; i<tcm.getColumnCount();i++) { //getColumnCount:컬럼의 갯수 (aka lenght)
			tcm.getColumn(i).setCellRenderer(dtcr);
		}
		
		//SQL데이터는 UI에 있어야 함
		setVisible(true);
		//================================//
		
		//선택한 내용 출력
		btnSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				if(row != -1) { //-1=값없음
//					System.out.println("선택된 내용 : "+table.getValueAt(row, 0)); //콘솔에 출력 확인
				String temp = "성명:"+table.getValueAt(row, 1)+", 나이:"+table.getValueAt(row, 2)+", 성별:"+table.getValueAt(row, 3)+
						", 가입일:"+table.getValueAt(row, 4).toString().substring(0,10)+", 주소:"+table.getValueAt(row, 5);
				JOptionPane.showMessageDialog(null, temp);//showMessageDialog()앞은 무조건 null
				}
			}
		});
		
		//작업 종료
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T8_JTable();
	}
}
