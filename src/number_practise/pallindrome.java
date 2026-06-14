package number_practise;

import java.util.Scanner;

public class pallindrome {

	/*public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to check pallindrome or not:");
		int n=sc.nextInt();
		int og=n;
		int rev=0;
		
		while(n!=0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(og==rev) {
		System.out.println("yes it is pallindrome");

	}else {
		System.out.println("it is not pallindrome");
	}

}
	public static void main(String[] args) {
		
		int n=1234;
		int rev=0;
		while(n!=0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		
		System.out.println(rev + "  reversed number");
		
		int m=123;
		int sum=0;
		while(m!=0) {
			int s=m%10;
			sum=sum+ s;
			m=m/10;
			
		}
		System.out.println(sum);
		
		
		
	}
	
	public static void main(String[] args) {
		
		int n=123;
		int og=n;
		int sum=0;
		while(n!=0) {
			int ex=n%10;
			sum=sum+ex*ex*ex;
			n=n/10;
		}
		if(og==sum) {
			System.out.println("its a armstrong");
		}
		else {
			System.out.println("its not a armstrong");
		}
	
	}
public static void main(String[] args) {
		
		int n=1235;
		int max=0;
		while(n!=0) {
			int ex=n%10;
			if(ex>max) {
				max=ex;
			}
			n=n/10;
		}
		System.out.println(max);
}
	public static void main(String[] args) {

	int n=27;
	int og=n;
	int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			sum=sum+i;			
		}
		
	}
	if(og==sum) {
		System.out.println("it is perfect number");
	}
	else {
		System.out.println("it is not a perfect number");
	}	
	
}*/
	public static void main(String[] args) {
		int n=7;
		boolean isPrime = true;  // assume prime

		for(int i = 2; i < n; i++) {
		    if(n % i == 0) {
		        isPrime = false;  // found divisor → not prime
		        break;            // no need to check further!
		    }
		}

		if(isPrime) {
		    System.out.println("Prime ✅");
		} else {
		    System.out.println("Not Prime ❌");
		}
	}
}
	
	

