package tp.project4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;


public class Bank implements BankProc {

	private HashMap<Person, Set<Account>> bankAccounts;

	public Bank() {
		bankAccounts = new HashMap<Person, Set<Account>>();
	}

	public void addAccount(Person p, Account a) {
		assert(isWellFormed());
		if (a instanceof SpendingAccount)
			bankAccounts.get(p).add((SpendingAccount) a);
		else if (a instanceof SavingAccount)
			bankAccounts.get(p).add((SavingAccount) a);
		assert(isWellFormed());
	}

	public void removeAccount(Person p, int accNo) {
		assert (isWellFormed());
		Predicate<Account> filter;

		filter = new Predicate<Account>() {
			@Override
			public boolean test(Account a) {
				return (accNo == a.getId());
			}
		};

		bankAccounts.get(p).removeIf(filter);
		assert (isWellFormed());
	}

	public void addPerson(Person p) {
		assert (isWellFormed());
		bankAccounts.put(p, new HashSet<Account>());
		assert (isWellFormed());
	}

	public void removePerson(Person p) {
		assert (isWellFormed());
		bankAccounts.remove(p);
		assert (isWellFormed());
	}

	public Person searchPerson(Person p) {
		if (bankAccounts.containsKey(p))
			return p;
		else
			return null;
	}

	public void listAccounts() {
		for (Map.Entry<Person, Set<Account>> bankEntry : bankAccounts.entrySet()) {
			System.out.println(bankEntry.getKey().getName());
			ArrayList<Account> accounts = new ArrayList<Account>();
			accounts.addAll(bankEntry.getValue());
			for (int i = 0; i < accounts.size(); i++) {
				System.out.println("\nAccount id: " + accounts.get(i).getId());
				System.out.println("Type: " + accounts.get(i).getType());
				System.out.println("Money: " + accounts.get(i).getMoney() + "\n");
			}
		}
	}

	public void listPersons() {
		System.out.println(bankAccounts.size());
		for (Map.Entry<Person, Set<Account>> bankEntry : bankAccounts.entrySet()) {
			System.out.println("Person id: " + bankEntry.getKey().getId());
			System.out.println("Person name: " + bankEntry.getKey().getName());
		}
	}

	public double readAccount(int accNo) {
		assert (isWellFormed());
		for (Map.Entry<Person, Set<Account>> bankEntry : bankAccounts.entrySet()) {
			ArrayList<Account> accounts = new ArrayList<Account>();
			accounts.addAll(bankEntry.getValue());
			for (int i = 0; i < accounts.size(); i++)
				if (accounts.get(i).getId() == accNo) {
					assert (isWellFormed());
					return accounts.get(i).getMoney();
				}
		}
		assert (isWellFormed());
		return -1;
	}

	public void writeAccount(int accNo, double amount, Person p) {
		assert (isWellFormed());
		assert amount>0;
		for (Map.Entry<Person, Set<Account>> bankEntry : bankAccounts.entrySet()) {
			ArrayList<Account> accounts = new ArrayList<Account>();
			accounts.addAll(bankEntry.getValue());
			for (int i = 0; i < accounts.size(); i++)
				if (accounts.get(i).getId() == accNo) {
					if(accounts.get(i) instanceof SpendingAccount)
					((SpendingAccount)accounts.get(i)).addMoney(amount, p);
					else if(accounts.get(i) instanceof SavingAccount)
						((SavingAccount)accounts.get(i)).addMoney(amount, p);
					assert (isWellFormed());
				}
		}
		assert (isWellFormed());
	}

	public double getMoneyFromAccount(int accNo, double amount) {
		assert (isWellFormed());
		for (Map.Entry<Person, Set<Account>> bankEntry : bankAccounts.entrySet()) {
			ArrayList<Account> accounts = new ArrayList<Account>();
			accounts.addAll(bankEntry.getValue());
			for (int i = 0; i < accounts.size(); i++) {
				if (accounts.get(i).getId() == accNo) {
					 assert (accounts.get(i).getMoney() >= amount);
					if (accounts.get(i) instanceof SpendingAccount) {
						double money = ((SpendingAccount)accounts.get(i)).receiveMoney(amount);
						return money;
					} else if (accounts.get(i) instanceof SavingAccount) {
						double money;
						money = ((SavingAccount) accounts.get(i)).receiveMoney();
						removeAccount(accounts.get(i).getP(), accounts.get(i).getId());
						return money;
					}
				}
			}
		}
		assert (isWellFormed());
		return -1;
	}

	public HashMap<Person, Set<Account>> getBankAccounts() {
		return bankAccounts;
	}

	private void setBankAccounts(HashMap<Person, Set<Account>> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public boolean isWellFormed() {
		HashSet<Person> persons = new HashSet<Person>();
		for (Map.Entry<Person, Set<Account>> bankEntry : bankAccounts.entrySet()) {
			ArrayList<Account> accounts = new ArrayList<Account>();
			accounts.addAll(bankEntry.getValue());
			for(int i = 0; i < accounts.size(); i++)
				if(accounts.get(i).getMoney() < 0)
					return false;
			if (bankEntry.getKey().getId() < 0)
				return false;
			if (persons.add(bankEntry.getKey()) == false)
				return false;
		}
		return true;
	}

	public void storeBank() {
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream("bank.dat"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			outputStream.writeObject(this.bankAccounts);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void loadBank() {
			FileInputStream fileIn = null;
			try {
				fileIn = new FileInputStream("bank.dat");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ObjectInputStream inputStream = null;
			try {
				inputStream = new ObjectInputStream (fileIn);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Object obj;
			try {
				obj = inputStream.readObject();
				if (obj instanceof HashMap)
				{
					this.setBankAccounts((HashMap<Person, Set<Account>>) obj);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(Map.Entry<Person, Set<Account>> entry : this.getBankAccounts().entrySet()) {
				ArrayList<Account> accounts = new ArrayList<Account>();
				accounts.addAll(entry.getValue());
				for(int i = 0; i < accounts.size(); i++)
					accounts.get(i).addObserver(accounts.get(i).getP());
			}
		}
}
