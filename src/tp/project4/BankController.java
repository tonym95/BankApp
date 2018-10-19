package tp.project4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class BankController {
	BankView bv;
	Bank b;

	public BankController() {
		bv = new BankView();
		b = new Bank();

		b.loadBank();
		
		bv.addPListener(new PListener());
		bv.addAListener(new AListener());
		bv.removePListener(new removePersonListener());
		bv.removeAListener(new removeAccountListener());
		bv.listPListener(new listPersonsListener());
		bv.listAListener(new listAccountsListener());
		bv.addMListener(new addMoneyListener());
		bv.getMListener(new getMoneyListener());
		bv.addAddPListener(new addPListener());
		bv.addAddAListener(new addAListener());
		bv.addRemovePListener(new removePListener());
		bv.addRemoveAListener(new removeAListener());
		bv.addAddMoneyListener(new addMListener());
		bv.addGetMoneyListener(new getMListener());
	}

	class addPListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Person p = new Person(bv.getTextField().getText(), bv.getTextField_1().getText());
			b.addPerson(p);
			bv.getTextField_15().setText("Success !");
			b.storeBank();
		}

	}

	class addAListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Person p = null;
			boolean personFound = false;
			for (Map.Entry<Person, Set<Account>> bankEntry : b.getBankAccounts().entrySet()) {
				if (bankEntry.getKey().getId() == Integer.parseInt(bv.getTextField_3().getText())) {
					p = bankEntry.getKey();
					personFound = true;
					break;
				}
			}
			if (personFound) {
				Account a;
				if (bv.getTextField_2().getText().equals("Spending Account")) {
					a = new SpendingAccount(p, Double.parseDouble(bv.getTextField_4().getText()));
					b.addAccount(p, a);
				} else if (bv.getTextField_2().getText().equals("Saving Account")) {
					a = new SavingAccount(p, Double.parseDouble(bv.getTextField_4().getText()));
					b.addAccount(p, a);
				}
				bv.getTextField_16().setText("Success !");
			} else
				bv.getTextField_16().setText("Person not found !");
			b.storeBank();
		}

	}

	class removePListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Person p = null;
			boolean personFound = false;
			for (Map.Entry<Person, Set<Account>> bankEntry : b.getBankAccounts().entrySet()) {
				if (bankEntry.getKey().getId() == Integer.parseInt(bv.getTextField_5().getText())) {
					p = bankEntry.getKey();
					personFound = true;
					break;
				}
			}
			if (personFound) {
				b.removePerson(p);
				bv.getTextField_17().setText("Success !");
			} else {
				bv.getTextField_17().setText("Person not found !");
			}
			b.storeBank();
		}
	}

	class removeAListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Person p = null;
			boolean personFound = false;
			for (Map.Entry<Person, Set<Account>> bankEntry : b.getBankAccounts().entrySet()) {
				if (bankEntry.getKey().getId() == Integer.parseInt(bv.getTextField_6().getText())) {
					p = bankEntry.getKey();
					personFound = true;
					break;
				}
			}
			if (personFound) {
				b.removeAccount(p, Integer.parseInt(bv.getTextField_7().getText()));
				bv.getTextField_18().setText("Success !");
			} else
				bv.getTextField_18().setText("Person not found !");
			b.storeBank();
		}

	}

	class addMListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Person p = null;
			boolean personFound = false;
			for (Map.Entry<Person, Set<Account>> bankEntry : b.getBankAccounts().entrySet()) {
				if (bankEntry.getKey().getPhoneNo().equals(bv.getTextField_10().getText())) {
					p = bankEntry.getKey();
					personFound = true;
					break;
				}
			}
				if (personFound) {
					b.writeAccount(Integer.parseInt(bv.getTextField_8().getText()),
							Double.parseDouble(bv.getTextField_9().getText()), p);
					bv.getTextField_14().setText("Success !");
				} else {
					p = new Person(bv.getTextField_10().getText());
					b.addPerson(p);
					b.writeAccount(Integer.parseInt(bv.getTextField_8().getText()),
							Double.parseDouble(bv.getTextField_9().getText()), p);
					b.removePerson(p);
				}
			b.storeBank();
		}
	}

	class getMListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (b.getMoneyFromAccount(Integer.parseInt(bv.getTextField_11().getText()),
					Double.parseDouble(bv.getTextField_12().getText())) != -1)
			bv.getTextField_13().setText("Success!");
			else
				bv.getTextField_13().setText("Money couldn't be added!");
			b.storeBank();
		}

	}

	class PListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			bv.getCl().show(bv.getPanel_1(), "Add person");
		}

	}

	class AListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			bv.getCl().show(bv.getPanel_1(), "Add account");
		}

	}

	class removePersonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			bv.getCl().show(bv.getPanel_1(), "Remove person");

		}

	}

	class removeAccountListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			bv.getCl().show(bv.getPanel_1(), "Remove account");

		}

	}

	class listPersonsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String[] columnNames = { "NAME", "PHONE NO", "ID" };
			TableModel tableModel = new DefaultTableModel(columnNames, 25);
			bv.getTable().setModel(tableModel);
			int i = 0;
			for (Map.Entry<Person, Set<Account>> bankEntry : b.getBankAccounts().entrySet()) {
				bv.getTable().setValueAt(bankEntry.getKey().getName(), i, 0);
				bv.getTable().setValueAt(bankEntry.getKey().getPhoneNo(), i, 1);
				bv.getTable().setValueAt(bankEntry.getKey().getId(), i, 2);
				i++;
			}
			bv.getCl().show(bv.getPanel_1(), "List persons");

		}

	}

	class listAccountsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String[] columnNames = { "ID", "TYPE", "HOLDER ID", "MONEY" };
			TableModel tableModel = new DefaultTableModel(columnNames, 25);
			bv.getTable_1().setModel(tableModel);
			for (Map.Entry<Person, Set<Account>> bankEntry : b.getBankAccounts().entrySet()) {
				int i = 0;
				ArrayList<Account> accounts = new ArrayList<Account>();
				accounts.addAll(bankEntry.getValue());
				for (int j = 0; j < accounts.size(); j++) {
					bv.getTable_1().setValueAt(accounts.get(j).getId(), i, 0);
					bv.getTable_1().setValueAt(accounts.get(j).getType(), i, 1);
					bv.getTable_1().setValueAt(bankEntry.getKey().getId(), i, 2);
					bv.getTable_1().setValueAt(accounts.get(j).getMoney(), i, 3);
					i++;
				}
			}
			bv.getCl().show(bv.getPanel_1(), "List accounts");

		}

	}

	class addMoneyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			bv.getCl().show(bv.getPanel_1(), "Add money");

		}

	}

	class getMoneyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			bv.getCl().show(bv.getPanel_1(), "Get money");

		}

	}

	public static void main(String args[]) {
		new BankController();
	}
}
