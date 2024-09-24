package t23_Hoewon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hoewonMain extends JFrame {
	JPanel pn1,pn2,pn3;
	JLabel lblImage, lblTitle;
	JButton btnInput, btnList, btnSearch, btnExit;
	
	
	public hoewonMain() {
		setTitle("회원관리프로그램(v1.0)");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		 pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 78);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		 lblTitle = new JLabel("회원관리 프로그램 (v1.0)");
		lblTitle.setFont(new Font("굴림", Font.PLAIN, 16));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 10, 784, 58);
		pn1.add(lblTitle);
		
		 pn2 = new JPanel();
		pn2.setBounds(0, 79, 784, 403);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		 lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(hoewonMain.class.getResource("/t22_Swing/images/img10.png")));
		lblImage.setBounds(0, 0, 784, 403);
		pn2.add(lblImage);
		
		 pn3 = new JPanel();
		pn3.setBounds(0, 483, 784, 78);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		 btnInput = new JButton("회원등록");
		btnInput.setFont(new Font("굴림", Font.PLAIN, 16));
		btnInput.setBounds(40, 10, 146, 58);
		pn3.add(btnInput);
		
		 btnSearch = new JButton("개별조회");
		btnSearch.setFont(new Font("굴림", Font.PLAIN, 16));
		btnSearch.setBounds(226, 10, 146, 58);
		pn3.add(btnSearch);
		
		 btnList = new JButton("전체조회");
		btnList.setFont(new Font("굴림", Font.PLAIN, 16));
		btnList.setBounds(412, 10, 146, 58);
		pn3.add(btnList);
		
		 btnExit = new JButton("작업종료");
		btnExit.setFont(new Font("굴림", Font.PLAIN, 16));
		btnExit.setBounds(598, 10, 146, 58);
		pn3.add(btnExit);
		
		
		setVisible(true);
		//=========================================//
		
		//회원 등록 버튼
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();		//현재 창(프레임)만 닫는다. 내창만 닫음	
				new hoewonInput();//내창을 닫고 버튼을 누른 창을 띄움
			}
		});
		
		//회원 조회 버튼
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
			}
		});
		
		//회원 전체 버튼
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new hoewonList();
			}
		});
		
		//종료 버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new hoewonMain();
	}
}
