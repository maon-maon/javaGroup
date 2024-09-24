package t22_Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class T4_TestField extends JFrame {
	JPanel pn1, pn2, pn3;
	JTextField txtMid, txtName, txtAge;
	JLabel lblNewLabel, lblMid, lblPwd, lblName, lblAge, lblImage;
	JButton btnInput, btnReset, btnExit;
	private JPasswordField txtPwd;
	
	//정규화 코드
	String regAge = "^[0-9]+$";
	
	
	public T4_TestField() {
		setTitle("텍스트박스 연습");
		setSize(600,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		 pn1 = new JPanel();
		pn1.setBackground(Color.ORANGE);
		pn1.setBounds(12, 10, 560, 69);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		 lblNewLabel = new JLabel("회 원 가 입");
		lblNewLabel.setBounds(0, 0, 560, 69);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pn1.add(lblNewLabel);
		
		 pn2 = new JPanel();
		pn2.setBounds(12, 90, 560, 262);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		 lblMid = new JLabel("아 이 디");
		lblMid.setFont(new Font("굴림", Font.BOLD, 12));
		lblMid.setHorizontalAlignment(SwingConstants.CENTER);
		lblMid.setBounds(55, 22, 136, 38);
		pn2.add(lblMid);
		
		 lblPwd = new JLabel("비밀번호");
		lblPwd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwd.setFont(new Font("굴림", Font.BOLD, 12));
		lblPwd.setBounds(55, 82, 136, 38);
		pn2.add(lblPwd);
		
		 lblName = new JLabel("성    명");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("굴림", Font.BOLD, 12));
		lblName.setBounds(55, 142, 136, 38);
		pn2.add(lblName);
		
		 lblAge = new JLabel("나    이");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("굴림", Font.BOLD, 12));
		lblAge.setBounds(55, 202, 136, 38);
		pn2.add(lblAge);
		
		txtMid = new JTextField();
		txtMid.setFont(new Font("굴림", Font.BOLD, 12));
		txtMid.setBounds(223, 22, 218, 38);
		pn2.add(txtMid);
		txtMid.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.BOLD, 12));
		txtName.setColumns(10);
		txtName.setBounds(223, 142, 218, 38);
		pn2.add(txtName);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("굴림", Font.BOLD, 12));
		txtAge.setColumns(10);
		txtAge.setBounds(223, 202, 218, 38);
		pn2.add(txtAge);
		 
		 txtPwd = new JPasswordField();
		 txtPwd.setFont(new Font("굴림", Font.BOLD, 12));
		 txtPwd.setBounds(223, 83, 218, 38);
		 pn2.add(txtPwd);
		
		 lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(T4_TestField.class.getResource("/t22_Swing/images/Image21.jpg")));
		lblImage.setBounds(0, 0, 560, 262);
		pn2.add(lblImage);
		
		 pn3 = new JPanel();
		pn3.setBackground(Color.GREEN);
		pn3.setBounds(12, 362, 560, 69);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		 btnInput = new JButton("회원가입");
		btnInput.setBounds(53, 10, 115, 49);
		pn3.add(btnInput);
		
		 btnReset = new JButton("다시입력");
		btnReset.setBounds(221, 10, 115, 49);
		pn3.add(btnReset);
		
		 btnExit = new JButton("작업종료");
		btnExit.setBounds(389, 10, 115, 49);
		pn3.add(btnExit);
		
		
		
		setVisible(true);
		//==================================//
		
		//회원가입 버튼 클릭
		btnInput.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(txtMid.getText().trim().equals("") ) {
		 			JOptionPane.showMessageDialog(null, "아이디를 입력하세요");
		 			txtMid.requestFocus();//커서가 txtMid 로 감
		 		}//.trim() 문자열 앞뒤 공백제거
		 		else if(txtPwd.getText().trim().equals("") ) {
		 			JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요");
		 			txtPwd.requestFocus();
		 		}
		 		else if(txtName.getText().trim().equals("") ) {
		 			JOptionPane.showMessageDialog(null, "성명을 입력하세요");
		 			txtName.requestFocus();
		 		}
//		 		else if(txtAge.getText().trim().equals("") ) {
		 		else if(!Pattern.matches(regAge, txtAge.getText().trim())) {	
		 			JOptionPane.showMessageDialog(null, "나이를 입력하세요(숫자만 가능)");
		 			txtAge.requestFocus();
		 		}
		 		else {
		 			JOptionPane.showMessageDialog(null,  "회원가입이 완료되었습니다.");
		 		}
		 	}
		 });
		
		//다시입력 버튼 = 클리어
		btnReset.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		txtMid.setText("");
		 		txtPwd.setText("");
		 		txtName.setText("");
		 		txtAge.setText("");
		 		txtMid.requestFocus();
		 	}
		 });
		
		// 작업종료 버튼
		btnExit.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		System.exit(0);
		 	}
		 });
		
	}
	public static void main(String[] args) {
		new T4_TestField();
	}
}
