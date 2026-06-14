package String;

public class remove_Spaces {

	public static void main(String[] args) {
		String s=" t e j a s";
		String result="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				result=result + s.charAt(i);
				
			}
		}
		System.out.println(result);
		

	}

}
