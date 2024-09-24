package t23_Hoewon;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

@SuppressWarnings({"serial","unchecked","rawtypes"})
public class hoewonList extends JFrame {
	private JTable table;
	JPanel pn1, pn2, pn3;
	JButton btnJoindayAsc, btnExit;
	Vector title, vDate;
	DefaultTableModel dtm;
	JScrollPane scrollPane ;
	
	hoewonDAO dao = new hoewonDAO();
	private JTextField txtCondition;
	
	
	public hoewonList() {
		setTitle("회원목록");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		 pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 62);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JComboBox cbCondition = new JComboBox();
		cbCondition.setModel(new DefaultComboBoxModel(new String[] {"성명", "나이", "성별", "가입일", "주소"}));
		cbCondition.setBounds(12, 10, 179, 42);
		pn1.add(cbCondition);
		
		txtCondition = new JTextField();
		txtCondition.setBounds(202, 10, 193, 42);
		pn1.add(txtCondition);
		txtCondition.setColumns(10);
		
		JButton btnCondition = new JButton("조건검색");
		btnCondition.setBounds(407, 10, 140, 42);
		pn1.add(btnCondition);
		
		JButton btnList = new JButton("전체검색");
		btnList.setBounds(632, 10, 140, 42);
		pn1.add(btnList);
		
		 pn2 = new JPanel();
		pn2.setBounds(0, 64, 784, 424);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		
		 pn3 = new JPanel();
		pn3.setBounds(0, 489, 784, 62);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		 btnJoindayAsc = new JButton("가입일 오름차순");
		btnJoindayAsc.setBounds(12, 10, 166, 42);
		pn3.add(btnJoindayAsc);
		
		 btnExit = new JButton("작업종료");
		btnExit.setBounds(592, 10, 166, 42);
		pn3.add(btnExit);
		
		JButton btnJoindayDesc = new JButton("가입일 내림차순");
		btnJoindayDesc.setBounds(200, 10, 166, 42);
		pn3.add(btnJoindayDesc);

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
			scrollPane.setBounds(12, 0, 760, 424);
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
		
		
		
		setVisible(true);
		//====================================//
		
		
		
		//전체검색 버튼 클릭
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vDate = dao.getHoewonList();
				dtm.setDataVector(vDate, title);
			}
		});
		
		//조건검색 버튼 클릭
		btnCondition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cbCondi = cbCondition.getSelectedItem().toString();
				String txtCondi = txtCondition.getText();
				
				if(txtCondi.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "검색할 내용을 입력하세요!");
					txtCondition.requestFocus(); //커서 위치
					return; //여기서 종료
				}
				if(cbCondi.equals("성명")) vDate = dao.getConditionSearch("name", txtCondi);
				else if(cbCondi.equals("나이")) vDate = dao.getConditionSearch("age", txtCondi);
				else if(cbCondi.equals("성별")) vDate = dao.getConditionSearch("gender", txtCondi);
				else if(cbCondi.equals("가입일")) vDate = dao.getConditionSearch("joinday", txtCondi);
				else if(cbCondi.equals("주소")) vDate = dao.getConditionSearch("address", txtCondi);
				
				dtm.setDataVector(vDate, title);
			}
		});
		
		
		//가입일 오름차순 버튼 클릭 // 콤보상자로 만들기
		btnJoindayAsc.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		vDate = dao.gethoewonAlign("joinday","a");
			 		dtm.setDataVector(vDate, title);
			 	}
			 });
		
		//가입일 내림차순 버튼 클릭
		btnJoindayDesc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vDate = dao.gethoewonAlign("joinday","d");
				dtm.setDataVector(vDate, title);
		 	}
		});
		
		//창닫기
		btnExit.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		disable();
		 		new hoewonMain();
		 	}
		 });
		
	}
}
