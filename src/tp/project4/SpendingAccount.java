package tp.project4;

public class SpendingAccount extends Account{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7250551830377944275L;

	public SpendingAccount(Person p, double money) {
		super(p, money, "SpendingAccount");
	}
	
	
	public double receiveMoney(double amount) {
		System.out.println(amount);
		money -= amount;
		System.out.println(money);
		return money;
	}
	
	public double receiveMoney() {
		return 0;
	}

}
