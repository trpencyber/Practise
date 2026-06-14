package number_practise;

public class count_digit {
	static int count(int n,int d) {
		if(n==0) {
			return 0;
			
		}
		int last=n%10;
		if(last==d) {
			return 1+ count(n/10,d);
			
		}
		return 0 + count(n/10,d);
		
	}

	public static void main(String[] args) {
		System.out.println(count(12223,2));
		// TODO Auto-generated method stub

	}

}
