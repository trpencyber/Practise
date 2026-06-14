package String;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String s1="listen";
		String s2="silenm";
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String sort1=new String(arr1);
		String sort2 = new String(arr2);
		
		if(sort1.equals(sort2)) {
			System.out.println(" its a anagram: "+s1 +":"+s2);
		}else {
			System.out.println("not a anagram");
		}
		
		String m = "Tejas is learning Java";
		String[] words = m.split(" ");
		System.out.println("Word count: " + words.length);
		

	}

}
