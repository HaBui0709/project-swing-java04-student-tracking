package compares;

import java.util.HashSet;
import java.util.Set;

public class CompareTwoAccounts {

	public static void main(String[] args) {
		Account a = new Account(1234, "Ha Buiiiii", "111");
		Account b = new Account(123, "Ha Bui", "111");
		
		System.out.println("so sanh a va b: " + a.equals(b));
		Set<Account> accounts = new HashSet<>();
		
		accounts.add(a);
		accounts.add(b);
		
		for (Account account: accounts) {
			System.out.println(account.getFullName());
		} 

	}

}
