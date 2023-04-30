package Array_Questions;

import java.util.Scanner;

//By Scanner class
public class PrimeNumber{
	public static void main(String[] args) {
		
		int n, count = 0;
		
		System.out.println("Enter here any number:");
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 
		 for(int i =1; i<=n; i++) {
			 if(n%i == 0) {
				 count++;
			 } 
		 }
		 if(count == 2) {
			 System.out.println(n + " Is a Prime Number");
		 }
		 
		 else{
			 System.out.println(n + " Is not a Prime Number");
		 }
	}
}




//public class PrimeNumber {  
//
// public static void main(String[] args) {  
// 
//	   int num = 7;
//	   int count = 0;
//	   
//	   if(num>1) {
//		   for(int i = 1; i<=num; i++) {
//			   if(num%i == 0) {
//				   count++;
//			   }
//			   if(count == 2) {
//				   System.out.println( num + " is a Prime Number");
//			   }
//		   }
//	   }
//	   else
//	   {
//		   System.out.println( num + " is not a Prime Number");
//	   }
// }
//}









