package cap_03_livro;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Account myAccount = new Account();
		
		System.out.printf("initial name is: %s%n%n", myAccount.getName());
		
		System.out.println("Please enter the name: ");
		String name = sc.nextLine();
		myAccount.setName(name);
		System.out.println();
		
		System.out.printf("Name is object myAccount is: %n%s%n", myAccount.getName());
		
		sc.close();
		
	}

}
