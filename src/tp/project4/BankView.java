package tp.project4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import javax.swing.JTextField;

public class BankView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	private JTable table_1;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private CardLayout cl;
	private JButton btnAddMoney;
	private JButton btnGetMoney;
	private JButton btnListAccounts;
	private JButton btnListPersons;
	private JButton btnRemoveAccount;
	private JButton btnRemovePerson;
	private JButton btnAddAccount;
	private JButton btnAddPerson;
	private JPanel panel_1;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JButton btnAdd;
	private JButton btnAdd_1;
	private JButton btnRemove;
	private JButton btnRemove_1;
	private JButton btnAdd_2;
	private JButton btnGet;
	/**
	 * Create the frame.
	 */
	public BankView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);

		btnAddPerson = new JButton("Add person");

		btnAddAccount = new JButton("Add account");

		btnRemovePerson = new JButton("Remove person");

		btnRemoveAccount = new JButton("Remove account");

		btnListPersons = new JButton("List persons");

		btnListAccounts = new JButton("List accounts");

		btnAddMoney = new JButton("Add money");

		btnGetMoney = new JButton("Get money");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnGetMoney)
						.addComponent(btnAddMoney)
						.addComponent(btnListAccounts)
						.addComponent(btnListPersons)
						.addComponent(btnRemoveAccount)
						.addComponent(btnRemovePerson)
						.addComponent(btnAddAccount)
						.addComponent(btnAddPerson))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnAddPerson)
					.addGap(18)
					.addComponent(btnAddAccount)
					.addGap(18)
					.addComponent(btnRemovePerson)
					.addGap(18)
					.addComponent(btnRemoveAccount)
					.addGap(18)
					.addComponent(btnListPersons)
					.addGap(18)
					.addComponent(btnListAccounts)
					.addGap(18)
					.addComponent(btnAddMoney)
					.addGap(18)
					.addComponent(btnGetMoney)
					.addGap(34))
		);
		panel.setLayout(gl_panel);

		setPanel_1(new JPanel());
		contentPane.add(getPanel_1(), BorderLayout.EAST);
		getPanel_1().setLayout(new CardLayout(0, 0));

		JPanel panel_2 = new JPanel();
		getPanel_1().add(panel_2, "Add person");

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblName = new JLabel("Name");

		JLabel lblPhoneNumber = new JLabel("Phone number");

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		btnAdd = new JButton("Add");
		
		JLabel lblMessage_2 = new JLabel("Message");
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(184)
							.addComponent(lblName))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(164)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPhoneNumber)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAdd)
								.addComponent(lblMessage_2)
								.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(212, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblName)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblPhoneNumber)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(btnAdd)
					.addGap(26)
					.addComponent(lblMessage_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(125, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);

		JPanel panel_3 = new JPanel();
		getPanel_1().add(panel_3, "Add account");

		JLabel lblId = new JLabel("Type");

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		JLabel lblHolderName = new JLabel("Holder id");

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		JLabel lblNewLabel = new JLabel("Money");

		textField_4 = new JTextField();
		textField_4.setColumns(10);

		btnAdd_1 = new JButton("Add");
		
		JLabel lblMessage_3 = new JLabel("Message");
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(171)
							.addComponent(lblId))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(167)
							.addComponent(lblHolderName))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(155)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAdd_1, Alignment.LEADING)
								.addComponent(lblMessage_3, Alignment.LEADING)
								.addComponent(textField_16, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(170)
							.addComponent(lblNewLabel)))
					.addContainerGap(221, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblId)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblHolderName)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(btnAdd_1)
					.addGap(18)
					.addComponent(lblMessage_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);

		JPanel panel_4 = new JPanel();
		getPanel_1().add(panel_4, "Remove person");

		JLabel lblName_1 = new JLabel("ID");

		textField_5 = new JTextField();
		textField_5.setColumns(10);

		btnRemove = new JButton("Remove");
		
		JLabel lblMessage_4 = new JLabel("Message");
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(198)
					.addComponent(lblName_1)
					.addContainerGap(237, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addContainerGap(190, Short.MAX_VALUE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMessage_4)
						.addComponent(btnRemove)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(186))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(16)
					.addComponent(lblName_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(btnRemove)
					.addGap(36)
					.addComponent(lblMessage_4)
					.addGap(18)
					.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(156, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);

		JPanel panel_5 = new JPanel();
		getPanel_1().add(panel_5, "Remove account");

		JLabel lblHolderName_1 = new JLabel("Holder ID");

		textField_6 = new JTextField();
		textField_6.setColumns(10);

		JLabel lblAccountNo = new JLabel("Account no");

		textField_7 = new JTextField();
		textField_7.setColumns(10);

		btnRemove_1 = new JButton("Remove");
		
		JLabel lblMessage_5 = new JLabel("Message");
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(147)
							.addComponent(lblHolderName_1))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(146)
							.addComponent(lblAccountNo))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(137)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnRemove_1, Alignment.LEADING)
								.addComponent(lblMessage_5, Alignment.LEADING)
								.addComponent(textField_18, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(239, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblHolderName_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblAccountNo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addComponent(btnRemove_1)
					.addGap(18)
					.addComponent(lblMessage_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(117, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);

		JPanel panel_6 = new JPanel();
		getPanel_1().add(panel_6, "List persons");

		table = new JTable(25,3);
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(55)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		JPanel panel_7 = new JPanel();
		getPanel_1().add(panel_7, "List accounts");

		table_1 = new JTable(25,4);
		
		JScrollPane scrollPane2 = new JScrollPane(table_1);
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(5)
					.addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(5)
					.addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		panel_7.setLayout(gl_panel_7);

		JPanel panel_8 = new JPanel();
		getPanel_1().add(panel_8, "Add money");

		JLabel lblAccountNo_1 = new JLabel("Account no");

		textField_8 = new JTextField();
		textField_8.setColumns(10);

		JLabel lblAmount = new JLabel("Amount");

		textField_9 = new JTextField();
		textField_9.setColumns(10);

		JLabel lblName_2 = new JLabel("Phone no");

		textField_10 = new JTextField();
		textField_10.setColumns(10);

		btnAdd_2 = new JButton("Add");

		JLabel lblMessage_1 = new JLabel("Message");

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGap(173)
							.addComponent(lblAccountNo_1))
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGap(175)
							.addComponent(lblAmount))
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGap(165)
							.addGroup(gl_panel_8.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_14, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(Alignment.LEADING, gl_panel_8.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblMessage_1)
									.addComponent(btnAdd_2))))
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGap(178)
							.addComponent(lblName_2)))
					.addContainerGap(211, Short.MAX_VALUE))
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAccountNo_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblAmount)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblName_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAdd_2)
					.addGap(18)
					.addComponent(lblMessage_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(86, Short.MAX_VALUE))
		);
		panel_8.setLayout(gl_panel_8);

		JPanel panel_9 = new JPanel();
		getPanel_1().add(panel_9, "Get money");

		textField_11 = new JTextField();
		textField_11.setColumns(10);

		JLabel lblAccountNo_2 = new JLabel("Account no");

		JLabel lblAmount_1 = new JLabel("Amount");

		textField_12 = new JTextField();
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setColumns(10);

		JLabel lblMessage = new JLabel("Message");

		btnGet = new JButton("Get");
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGap(161)
							.addComponent(lblAccountNo_2))
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGap(156)
							.addComponent(lblAmount_1))
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGap(138)
							.addGroup(gl_panel_9.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnGet, Alignment.LEADING)
								.addComponent(lblMessage, Alignment.LEADING)
								.addComponent(textField_13, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(238, Short.MAX_VALUE))
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGap(10)
					.addComponent(lblAccountNo_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblAmount_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(btnGet)
					.addGap(36)
					.addComponent(lblMessage)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(112, Short.MAX_VALUE))
		);
		panel_9.setLayout(gl_panel_9);
		cl = (CardLayout) (getPanel_1().getLayout());
		this.setVisible(true);
	}

	public JTextField getTextField_15() {
		return textField_15;
	}

	public void setTextField_15(JTextField textField_15) {
		this.textField_15 = textField_15;
	}

	public JTextField getTextField_16() {
		return textField_16;
	}

	public void setTextField_16(JTextField textField_16) {
		this.textField_16 = textField_16;
	}

	public JTextField getTextField_17() {
		return textField_17;
	}

	public void setTextField_17(JTextField textField_17) {
		this.textField_17 = textField_17;
	}

	public JTextField getTextField_18() {
		return textField_18;
	}

	public void setTextField_18(JTextField textField_18) {
		this.textField_18 = textField_18;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public JTextField getTextField_7() {
		return textField_7;
	}

	public void setTextField_7(JTextField textField_7) {
		this.textField_7 = textField_7;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTable getTable_1() {
		return table_1;
	}

	public void setTable_1(JTable table_1) {
		this.table_1 = table_1;
	}

	public JTextField getTextField_8() {
		return textField_8;
	}

	public void setTextField_8(JTextField textField_8) {
		this.textField_8 = textField_8;
	}

	public JTextField getTextField_9() {
		return textField_9;
	}

	public void setTextField_9(JTextField textField_9) {
		this.textField_9 = textField_9;
	}

	public JTextField getTextField_10() {
		return textField_10;
	}

	public void setTextField_10(JTextField textField_10) {
		this.textField_10 = textField_10;
	}

	public JTextField getTextField_11() {
		return textField_11;
	}

	public void setTextField_11(JTextField textField_11) {
		this.textField_11 = textField_11;
	}

	public JTextField getTextField_12() {
		return textField_12;
	}

	public void setTextField_12(JTextField textField_12) {
		this.textField_12 = textField_12;
	}

	public JTextField getTextField_13() {
		return textField_13;
	}

	public void setTextField_13(JTextField textField_13) {
		this.textField_13 = textField_13;
	}

	public JTextField getTextField_14() {
		return textField_14;
	}

	public void setTextField_14(JTextField textField_14) {
		this.textField_14 = textField_14;
	}

	public CardLayout getCl() {
		return cl;
	}

	public void setCl(CardLayout cl) {
		this.cl = cl;
	}

	void addPListener(ActionListener a) {
		btnAddPerson.addActionListener(a);
	}

	void addAListener(ActionListener a) {
		btnAddAccount.addActionListener(a);
	}
	
	void addRemovePListener(ActionListener a) {
		btnRemove.addActionListener(a);
	}
	
	void addRemoveAListener(ActionListener a) {
		btnRemove_1.addActionListener(a);
	}

	void removePListener(ActionListener a) {
		btnRemovePerson.addActionListener(a);
	}

	void removeAListener(ActionListener a) {
		btnRemoveAccount.addActionListener(a);
	}

	void listPListener(ActionListener a) {
		btnListPersons.addActionListener(a);
	}

	void listAListener(ActionListener a) {
		btnListAccounts.addActionListener(a);
	}

	void addMListener(ActionListener a) {
		btnAddMoney.addActionListener(a);
	}

	void getMListener(ActionListener a) {
		btnGetMoney.addActionListener(a);
	}
	
	void addAddPListener(ActionListener a) {
		btnAdd.addActionListener(a);
	}
	
	void addAddAListener(ActionListener a) {
		btnAdd_1.addActionListener(a);
	}
	
	void addAddMoneyListener(ActionListener a) {
		btnAdd_2.addActionListener(a);
	}
	
	void addGetMoneyListener(ActionListener a) {
		btnGet.addActionListener(a);
	}
	
	public JPanel getPanel_1() {
		return panel_1;
	}

	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}
}