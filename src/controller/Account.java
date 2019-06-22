package compares;

import java.util.Objects;

public class Account {
	protected int id;
	private String fullName;
	private String phoneNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public Account(int id, String fullName, String phoneNumber) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Account)) {
			return false;
		}
		Account account = (Account) obj;
		return Objects.equals(this.id, account.id);
	}
	
	@Override
	public int hashCode() {
		//return id;
		return Objects.hash(fullName, id);
	}
}
