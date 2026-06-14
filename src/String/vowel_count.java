package String;

public class vowel_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "tejas repale";
		int count =0;
		 for(int i=0;i<s.length();i++) {
			 char c=s.charAt(i);
			 if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u' ) {
				 count++;
			 }
		 }
		 System.out.println("vowels: "+ count);

	}

}
