package Array_Questions;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		
		int n, sum = 0;
		System.out.println("Enter any Number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 1; i <n; i++) 
		{
			if(n%i == 0) {
				sum+= i;
			}
		}
		if(n == sum) 
			System.out.println( n + " is a Perfect Number");
		else
			System.out.println( n + " is Not a Perfect Number");
	}
}