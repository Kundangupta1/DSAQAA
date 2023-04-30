package Array_Questions;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int n,arm=0,rem,c;
		System.out.println("Enter any Number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		c = n;
		
		while(n>0)
		{
			rem = n%10;
			arm = (rem*rem*rem) + arm;
			n = n/10;
		}
		if(c == arm)
			System.out.println( arm+ " Is a ArmStrongNumber");
		else
			System.out.println( arm + " Is  Not a ArmStrongNumber");
	}
}
