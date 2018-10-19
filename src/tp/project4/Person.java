package tp.project4;


import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

public class Person implements Observer, Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 5561678309117989347L;
	
	private int id;
	private String name;
	private String phoneNo;
	private static int count = 0;
	
	public Person(String name, String phoneNo) {
		this.name = name;
		this.setPhoneNo(phoneNo);
		this.id = this.hashCode();
		count++;
	}
	
	

	public Person(String phoneNo) {
		this.setPhoneNo(phoneNo);
		this.id = count;
		count++;
	}



	@Override
	public int hashCode() {
		int result = 0;
		byte[] bytes = this.getPhoneNo().getBytes();
		for(int i = 0; i < bytes.length; i++)
		result = result + bytes[i];
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
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		return true;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void update(Observable o, Object arg) {
		if(!arg.toString().equals(this.getPhoneNo()))
		System.out.println(arg.toString() + " added money to " + this.getName() + "'s " + o.toString());
		else
			System.out.println(arg.toString() + " added money to his " + o.toString());
	}



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
