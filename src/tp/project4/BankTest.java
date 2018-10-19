package tp.project4;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {
	
	Bank b;
	@Test
	public void testAddingPerson() {
		b = new Bank();
		Person p = new Person("Nume", "0432423");
		b.addPerson(p);
		assertEquals(b.searchPerson(p).getName(), "Nume");
	}
	
	@Test
	public void testAddingAccount() {
		b = new Bank();
		Person p = new Person("Nume", "0432423");
		Account a = new SpendingAccount(p, 20);
		b.addPerson(p);
		b.addAccount(p, a);
		assertEquals(b.getBankAccounts().get(p).contains(a), true);
	}
	
	@Test
	public void testRemovingPerson() {
		b = new Bank();
		Person p = new Person("Nume", "0432423");
		b.addPerson(p);
		b.removePerson(p);
		assertEquals(b.searchPerson(p), null);
	}
	
	@Test
	public void testRemovingAccount() {
		b = new Bank();
		Person p = new Person("Nume", "0432423");
		Account a = new SpendingAccount(p, 20);
		b.addPerson(p);
		b.addAccount(p, a);
		b.removeAccount(p, a.getId());
		assertEquals(b.getBankAccounts().get(p).contains(a), false);
	}
	
	@Test
	public void testAddingMoney() {
		b = new Bank();
		Person p = new Person("Nume", "0432423");
		Account a = new SpendingAccount(p, 20);
		b.addPerson(p);
		b.addAccount(p, a);
		b.writeAccount(a.getId(), 10, p);
		assertEquals(b.readAccount(a.getId()), 30, 0.001);
	}
	
	@Test
	public void testSubtractingMoney() {
		b = new Bank();
		Person p = new Person("Nume", "0432423");
		Account a = new SpendingAccount(p, 20);
		b.addPerson(p);
		b.addAccount(p, a);
		b.getMoneyFromAccount(a.getId(), 10);
		assertEquals(b.readAccount(a.getId()), 10, 0.001);
	}
	
	

}
