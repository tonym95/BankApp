package tp.project4;

import java.io.Serializable;
import java.util.Observable;

public class Account extends Observable implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2660186213608834910L;
	
	private int id;
	protected double money;
	//private static int idGenerator = 0;
	private String type;
	private Person p;
	public Account(Person p, double money, String type) {
		this.money = money;
		this.type = type;
		this.p = p;
		addObserver(this.p);
		this.id = this.hashCode();
		//idGenerator++;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMoney() {
		return money;
	}
	
	
	
	
	@Override
	public int hashCode() {
		int result = 0;
		byte[] bytes = this.getType().getBytes();
		byte[] bytes2 = this.getP().getPhoneNo().getBytes();
		for(int i = 0; i < bytes.length; i++)
		result = result + bytes[i];
		for(int i = 0; i < bytes2.length; i++)
			result = result + bytes2[i];
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(money) != Double.doubleToLongBits(other.money))
			return false;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public void addMoney(double amount, Person p) {
			money += amount;
			setChanged();
			notifyObservers(p.getPhoneNo());
		}
	
	public void setMoney(double money) {
		this.money = money;
	}

	public double receiveMoney(double amount) {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + "]";
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}
	
	
	
	
}
