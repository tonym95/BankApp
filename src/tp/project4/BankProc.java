package tp.project4;

public interface BankProc {

	/**@Pre isWellFormed()
	 * @Post isWellFormed()
	 * @param p
	 * @param a
	 */
	
	public void addAccount(Person p, Account a);
	
	/**@Pre isWellFormed()
	 * @Post isWellFormed()
	 * @param p
	 * @param accNo
	 */
	
	public void removeAccount(Person p, int accNo);
	
	/**@Pre isWellFormed()
	 * @Post isWellFormed()
	 * @param p
	 */
	
	public void addPerson(Person p);
	
	/**@Pre isWellFormed()
	 * @Post isWellFormed()
	 * @param p
	 */
	
	public void removePerson(Person p);
	
	/**@Pre isWellFormed()
	 * @Post isWellFormed()
	 * @param accNo
	 */
	
	public double readAccount(int accNo);
	
	/**@Pre isWellFormed()
	 * @Post isWellFormed()
	 * @param accNo
	 * @param amount
	 * @param p
	 */
	
	public void writeAccount(int accNo, double amount, Person p);
	
	/**@Pre isWellFormed()
	 * @Post isWellFormed()
	 * @param accNo
	 * @param amount
	 */
	
	public double getMoneyFromAccount(int accNo, double amount);
	
}
