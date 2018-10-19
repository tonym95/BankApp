package tp.project4;

public class SavingAccount extends Account{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1886812737906059179L;

	public SavingAccount(Person p, double money) {
		super(p, money, "SavingAccount");
	}
	
	public double receiveMoney() {
		System.out.println(money);
		money = 0;
		return money;
	}
	

}
