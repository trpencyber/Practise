package String;

public class pallindrome_String {

	public static void main(String[] args) {
		String s="madam";
		String og=s;
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		if(og.equals(rev)) {
			System.out.println("it is a pallindrome String");
		}else
		{
			System.out.println("it is not a pallindrome String");
		}

	}

}
