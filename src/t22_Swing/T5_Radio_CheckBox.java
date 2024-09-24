package t22_Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class T5_Radio_CheckBox extends JFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JPanel pn1,pn2,pn3;
	JLabel lblTitle, lblGender,lblHobby,lblMessage;
	JButton btnGender, btnHobby,btnExit ; 
	JCheckBox ckHobby1,ckHobby2,ckHobby3,ckHobby4;
	JRadioButton rdMale, rdFemale;
	
	public T5_Radio_CheckBox() {
		setTitle("텍스트박스 연습");
		setSize(600,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		 pn1 = new JPanel();
		pn1.setBounds(0, 0, 584, 90);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		 lblTitle = new JLabel("라디오버튼 체크박스 연습");
		lblTitle.setBounds(0, 10, 584, 70);
		lblTitle.setFont(new Font("굴림", Font.PLAIN, 14));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		pn1.add(lblTitle);
		
		 pn2 = new JPanel();
		pn2.setBounds(0, 99, 584, 242);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		 lblGender = new JLabel("성  별");
		lblGender.setBounds(36, 40, 103, 33);
		lblGender.setFont(new Font("굴림", Font.PLAIN, 14));
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblGender);
		
		 lblHobby = new JLabel("취  미");
		lblHobby.setBounds(36, 121, 103, 33);
		lblHobby.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobby.setFont(new Font("굴림", Font.PLAIN, 14));
		pn2.add(lblHobby);
		
		 rdMale = new JRadioButton("남 자");
		buttonGroup.add(rdMale);
		rdMale.setBounds(160, 45, 103, 33);
		rdMale.setFont(new Font("굴림", Font.PLAIN, 14));
		pn2.add(rdMale);
		
		 rdFemale = new JRadioButton("여 자");
		buttonGroup.add(rdFemale);
		rdFemale.setBounds(315, 45, 103, 33);
		rdFemale.setFont(new Font("굴림", Font.PLAIN, 14));
		pn2.add(rdFemale);
		
		 ckHobby1 = new JCheckBox("등산");
		ckHobby1.setFont(new Font("굴림", Font.PLAIN, 14));
		ckHobby1.setBounds(160, 121, 68, 33);
		pn2.add(ckHobby1);
		
		 ckHobby2 = new JCheckBox("낚시");
		ckHobby2.setFont(new Font("굴림", Font.PLAIN, 14));
		ckHobby2.setBounds(260, 121, 68, 33);
		pn2.add(ckHobby2);
		
		 ckHobby3 = new JCheckBox("수영");
		ckHobby3.setFont(new Font("굴림", Font.PLAIN, 14));
		ckHobby3.setBounds(360, 121, 68, 33);
		pn2.add(ckHobby3);
		
		 ckHobby4 = new JCheckBox("바둑");
		ckHobby4.setFont(new Font("굴림", Font.PLAIN, 14));
		ckHobby4.setBounds(460, 121, 68, 33);
		pn2.add(ckHobby4);
		
		 lblMessage = new JLabel("메세지 출력");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("굴림", Font.PLAIN, 14));
		lblMessage.setBounds(46, 164, 497, 56);
		pn2.add(lblMessage);
		
		 pn3 = new JPanel();
		pn3.setBounds(0, 351, 584, 90);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		 btnGender = new JButton("성별출력");
		btnGender.setBounds(12, 10, 178, 53);
		pn3.add(btnGender);
		
		 btnHobby = new JButton("취미출력");
		btnHobby.setBounds(203, 10, 178, 53);
		pn3.add(btnHobby);
		
		 btnExit = new JButton("작업종료");
		btnExit.setBounds(394, 10, 178, 53);
		pn3.add(btnExit);
		
		setVisible(true);
		//=============================================//
		
		//성별 버튼
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "선택하신 성별은? ";
				if(rdMale.isSelected()) gender += rdMale.getText();
				else gender += rdFemale.getText();
				
				lblMessage.setText(gender);
			}
		});
		
		//취미 버튼
		btnHobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hobby = "";
				if(ckHobby1.isSelected()) hobby += ckHobby1.getText() + "/";
				if(ckHobby2.isSelected()) hobby += ckHobby2.getText() + "/";
				if(ckHobby3.isSelected()) hobby += ckHobby3.getText() + "/";
				if(ckHobby4.isSelected()) hobby += ckHobby4.getText() + "/";
				
				hobby = hobby.substring(0, hobby.length()-1);
				
				lblMessage.setText("선택하신 취미는? "+hobby);
			}
		});
		
		//작업 종료 버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		
	}
	
	public static void main(String[] args) {
		new T5_Radio_CheckBox();
	}
}
