package String;

import java.util.HashMap;

public class first_non_repeat_ch {


		    public static void main(String[] args) {
		        String s = "swiss";
		        HashMap<Character, Integer> map = new HashMap<>();

		        // Step 1: count frequency of each character
		        for(int i = 0; i < s.length(); i++) {
		            char c = s.charAt(i);
		            map.put(c, map.getOrDefault(c, 0) + 1);
		        }

		        // Step 2: find first character with count == 1
		        for(int i = 0; i < s.length(); i++) {
		            char c = s.charAt(i);
		            if(map.get(c) == 1) {
		                System.out.println("First non-repeating: " + c);
		                break;
		            }
		        }
		    }
	

	}


