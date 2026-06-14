package number_practise;

public class exponential {
	static int power(int n, int ex) {
		if(ex==0) {
			return 1;
		}
		return n*power(n,ex-1);
	}

	public static void main(String[] args) {
		System.out.println(power(2,8));

	}

}
