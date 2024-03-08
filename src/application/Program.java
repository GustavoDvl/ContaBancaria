package application;

import java.util.Scanner;

import exceptions.BusinessException;
import model.entities.Account;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Enter account number");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Draw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.println("Enter amount of withdraw: ");
		double amount = sc.nextDouble();
		
		
		try {
			acc.withdraw(amount);
			System.out.printf("Updated balance: %.2f" , acc.getBalance() );
			
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
	sc.close();
		
	}

		
}



