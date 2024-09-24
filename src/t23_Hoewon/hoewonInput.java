package t23_Hoewon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings({ "rawtypes", "serial" })
public class hoewonInput extends JFrame{
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtaddress;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JPanel pn1,pn2,pn3;
	JLabel lblImage, lblTitle, lblName, lblAge, lblGender, lblJoinday, lblAddress,lblYY, lblMM ,lblDD ;
	JButton btnInput, btnReset, btnClose;
	JRadioButton rdMale,rdFemale;
	JComboBox cbYY,cbMM,cbDD;
	
	hoewonVO vo = new hoewonVO();
	hoewonDAO dao = new hoewonDAO(); 
	int res =0;
	

	@SuppressWarnings("unchecked")
	public hoewonInput() {
		setTitle("회원등록");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		 pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 78);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		 lblTitle = new JLabel("회 원 가 입 폼");
		lblTitle.setFont(new Font("굴림", Font.PLAIN, 16));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 10, 784, 41);
		pn1.add(lblTitle);
		
		 pn3 = new JPanel();
		pn3.setBounds(0, 500, 784, 78);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		 btnInput = new JButton("가입하기");
		btnInput.setBounds(12, 0, 200, 51);
		pn3.add(btnInput);
		
		 btnReset = new JButton("다시입력");
		btnReset.setBounds(292, 0, 200, 51);
		pn3.add(btnReset);
		
		 btnClose = new JButton("창 닫기");
		btnClose.setBounds(572, 0, 200, 51);
		pn3.add(btnClose);
		
		 pn2 = new JPanel();
		pn2.setBounds(0, 77, 784, 424);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		 lblName = new JLabel("성  명");
		lblName.setFont(new Font("굴림", Font.PLAIN, 16));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(82, 45, 97, 32);
		pn2.add(lblName);
		
		 lblAge = new JLabel("나  이");
		lblAge.setFont(new Font("굴림", Font.PLAIN, 16));
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setBounds(82, 122, 97, 32);
		pn2.add(lblAge);
		
		 lblGender = new JLabel("성  별");
		lblGender.setFont(new Font("굴림", Font.PLAIN, 16));
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setBounds(82, 199, 97, 32);
		pn2.add(lblGender);
		
		 lblJoinday = new JLabel("가입일");
		lblJoinday.setFont(new Font("굴림", Font.PLAIN, 16));
		lblJoinday.setHorizontalAlignment(SwingConstants.CENTER);
		lblJoinday.setBounds(82, 276, 97, 32);
		pn2.add(lblJoinday);
		
		 lblAddress = new JLabel("주  소");
		lblAddress.setFont(new Font("굴림", Font.PLAIN, 16));
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setBounds(82, 353, 97, 32);
		pn2.add(lblAddress);
		
		txtName = new JTextField();
		txtName.setBounds(244, 49, 413, 32);
		pn2.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(244, 128, 413, 32);
		pn2.add(txtAge);
		
		txtaddress = new JTextField();
		txtaddress.setColumns(10);
		txtaddress.setBounds(244, 359, 413, 26);
		pn2.add(txtaddress);
		
		 rdMale = new JRadioButton("남자");
		rdMale.setFont(new Font("굴림", Font.PLAIN, 16));
		buttonGroup.add(rdMale);
		rdMale.setBounds(244, 204, 121, 32);
		pn2.add(rdMale);
		
		 rdFemale = new JRadioButton("여자");
		 rdFemale.setSelected(true);
		rdFemale.setFont(new Font("굴림", Font.PLAIN, 16));
		buttonGroup.add(rdFemale);
		rdFemale.setBounds(435, 204, 121, 32);
		pn2.add(rdFemale);
		
		// 년도/월/일/ 초기값 생성하시
		String[] yy = new String[20];
		String[] mm = new String[12];
		String[] dd = new String[31];
		
		int imsi =0;
		for(int i=0; i<yy.length;i++) {
			imsi =2024-i;
			yy[i] = imsi + ""; //숫자를 문자로 배열에 넣음
		}
		for(int i=0; i<mm.length;i++) {
			mm[i] = (i+1) + ""; 
		}
		for(int i=0; i<dd.length;i++) {
			dd[i] = (i+1) + "";
		}
		
		 cbYY = new JComboBox(yy);
		cbYY.setFont(new Font("굴림", Font.PLAIN, 16));
		cbYY.setBounds(244, 281, 121, 23);
		pn2.add(cbYY);
		
		 lblYY = new JLabel("년");
		lblYY.setFont(new Font("굴림", Font.PLAIN, 16));
		lblYY.setBounds(377, 279, 24, 26);
		pn2.add(lblYY);
		
		 cbMM = new JComboBox(mm);
		cbMM.setFont(new Font("굴림", Font.PLAIN, 16));
		cbMM.setBounds(413, 281, 80, 23);
		pn2.add(cbMM);
		
		 lblMM = new JLabel("월");
		lblMM.setFont(new Font("굴림", Font.PLAIN, 16));
		lblMM.setBounds(504, 279, 24, 26);
		pn2.add(lblMM);
		
		 cbDD = new JComboBox(dd);
		cbDD.setFont(new Font("굴림", Font.PLAIN, 16));
		cbDD.setBounds(540, 281, 80, 23);
		pn2.add(cbDD);
		
		 lblDD = new JLabel("일");
		lblDD.setFont(new Font("굴림", Font.PLAIN, 16));
		lblDD.setBounds(633, 279, 24, 26);
		pn2.add(lblDD);
		
		setVisible(true);
		//=========================================//
		
		//회원가입버튼을 키보드 엔터키로 쳤을 떄 수행
		btnInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				sethoewonInput();
			}
		});
		
		
		
		//가입하기 버튼 클릭 (마우스 클릭시 수행)
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sethoewonInput();
			}
		});
		
		//다시입력 버튼 클릭
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		//창닫기 버튼 클릭
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();  //내 창을 닫고
				new hoewonMain(); //메인 창을 부름
			}
		});
	}


//회원 가입 처리 메소드
	protected void sethoewonInput() {
		String name = txtName.getText().trim();
		String age = txtAge.getText().trim();
		String gender =  "";//라디오버튼이라서
		String joinday = cbYY.getSelectedItem() +"-"+cbMM.getSelectedItem() +"-"+cbDD.getSelectedItem();
		String address = txtaddress.getText().trim();
		
		//유효성 검사
		if(name.equals("")) {
			JOptionPane.showMessageDialog(null, "성명 입력");
			txtName.requestFocus();
		}
		else if(!Pattern.matches("^[0-9]+$",age)) {
			JOptionPane.showMessageDialog(null, "나이 숫자로 입력");
			txtName.requestFocus();
		}
		else {
			if(rdMale.isSelected()) gender = "남자";
			else gender = "여자";
			
			// 모든 체크가 정상적으로 끝나면 DB에 새로운 회원을 저장한다.
			//회원 중복처리 할것.....
				
			//회원 중복처리가 끝난 정상적인 자료는 DB에 저장처리한다.
			vo.setName(name);
			vo.setAge(Integer.parseInt(age));
			vo.setGender(gender);
			vo.setJoinday(joinday);
			vo.setAddress(address);
			
			res = dao.sethoewonInput(vo);
			
			if(res !=0) {
				JOptionPane.showMessageDialog(null, "가입 완료");
				dispose(); 
				new hoewonMain(); 
			}
			else {
				JOptionPane.showMessageDialog(null, "가입 실패");
				txtName.requestFocus();
			}
		}
	}
	
//	public static void main(String[] args) {
//		new hoewonInput();
//	}
}
