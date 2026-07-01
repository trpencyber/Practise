package mock;

public class vowel_count {

	public static void main(String[] args) {
		String s="tejas repale";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				count++;
			}
			
		}
		System.out.println("vowel:"+count);

	}

}
