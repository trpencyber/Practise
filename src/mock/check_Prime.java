package mock;

import java.util.Scanner;

public class check_Prime {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num= scanner.nextInt();
		scanner.close();
		int flag=0;// 0 means prime , 1 means not prime
		
		if(num<=1) {
			flag=1;
		}else {
			for(int i=2 ;i<=num/2;i++) {
				if(num%i==0) {
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println("it is a prime number");
			
		}else
		{
			System.out.println("it is not prime");
		}
	}

}
