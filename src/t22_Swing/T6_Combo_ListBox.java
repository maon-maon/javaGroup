package t22_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class T6_Combo_ListBox extends JFrame{
	JPanel pn1, pn2, pn3, pn4;
	JLabel lblTitle,lblMessage;
	JComboBox comboJob;
	JScrollPane scrollPane1, scrollPane2;
	JTextArea textArea;
	JList listJob1, listJob2;
	
	public T6_Combo_ListBox() {
		setTitle("콤보상자/리스트박스 연습");
		setSize(600,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		 pn1 = new JPanel();
		pn1.setBounds(0, 0, 285, 300);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		 lblTitle = new JLabel("직업을 선택하세요(콤보)");
		lblTitle.setBounds(0, 0, 285, 41);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		pn1.add(lblTitle);
		
		 comboJob = new JComboBox();
		comboJob.setBounds(10, 51, 260, 30);
		comboJob.setModel(new DefaultComboBoxModel(new String[] {"학\t생", "군\t인", "회사원", "변호사", "프리랜서", "공무원", "기\t타"}));
		pn1.add(comboJob);
		
		 scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(12, 101, 261, 189);
		pn1.add(scrollPane1);
		
		 textArea = new JTextArea();
		scrollPane1.setViewportView(textArea);
		
		 pn2 = new JPanel();
		pn2.setBounds(297, 0, 285, 300);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		 listJob1 = new JList();
		listJob1.setModel(new AbstractListModel() {
			String[] values = new String[] {"학\t생", "군\t인", "회사원", "변호사", "프래랜서", "공무원", "의\t사", "자영업", "기\t타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listJob1.setBounds(12, 10, 261, 110);
		pn2.add(listJob1);
		
		 scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(12, 160, 261, 130);
		pn2.add(scrollPane2);
		
		listJob2 = new JList();
		listJob2.setModel(new AbstractListModel() {
			String[] values = new String[] {"학\t생", "군\t인", "회사원", "변호사", "프래랜서", "공무원", "의\t사", "자영업", "기\t타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane2.setViewportView(listJob2);
		
		 pn3 = new JPanel();
		pn3.setBounds(0, 299, 584, 58);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btnCombo = new JButton("콤보 출력");
		btnCombo.setBounds(16, 10, 125, 48);
		pn3.add(btnCombo);
		
		JButton btnList1 = new JButton("리스트 출력1");
		btnList1.setBounds(157, 10, 125, 48);
		pn3.add(btnList1);
		
		JButton btnList2 = new JButton("리스트 출력2");
		btnList2.setBounds(298, 10, 125, 48);
		pn3.add(btnList2);
		
		JButton btnExit = new JButton("작업종료");
		btnExit.setBounds(439, 10, 125, 48);
		pn3.add(btnExit);
		
		 pn4 = new JPanel();
		pn4.setBounds(0, 356, 584, 85);
		getContentPane().add(pn4);
		pn4.setLayout(null);
		
		 lblMessage = new JLabel("출력 메세지");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(0, 10, 584, 75);
		pn4.add(lblMessage);
		
		
		
		
		
		
		setVisible(true);
		//===============================================//

		//콤보 버튼
		btnCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String msg = (String) comboJob.getSelectedItem();
				String msg = comboJob.getSelectedItem().toString()+ " ("+comboJob.getSelectedIndex()+")";
				lblMessage.setText(msg);
//				JOptionPane.showMessageDialog(null, msg);
				textArea.setText(msg);
			}
		});
		
		//리스트박스1 버튼
		btnList1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Object[] jobs = listJob1.getSelectedValues();
				List<String> jobs = listJob1.getSelectedValuesList();
				String msg ="";
				for(String job : jobs) {
					msg +=job +"/";
				}
				msg = msg.substring(0,msg.length()-1);
				lblMessage.setText(msg);
			}
		});
		
		//리스트박스2 버튼
		btnList2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> jobs = listJob2.getSelectedValuesList();
				String msg ="";
				for(String job : jobs) {
					msg +=job +"/";
			}
				msg = msg.substring(0,msg.length()-1);
				lblMessage.setText(msg);
			}
		});
		
		//종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new T6_Combo_ListBox();
	}
}
