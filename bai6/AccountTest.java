package bai6;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account acc1 = new Account("Ted Murphy", 72354, 102.56);
		Account acc2 = new Account("Jane Smith", 69713, 40.00);
		Account acc3 = new Account("Edward Demsey", 93757, 759.32);
		
		
		System.out.println(String.format("%d %s %f", "name","accountNumber", "balance"));
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		sc.close();
	}

}
