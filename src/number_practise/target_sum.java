package number_practise;

public class target_sum {

	public static void main(String[] args) {
		int[] arr = {2, 7, 10, 15};
		int target = 17;
		boolean found = false;

		for(int i = 0; i < arr.length; i++) {
		    for(int j = i+1; j < arr.length; j++) {
		        if(arr[i] + arr[j] == target) {
		            found = true;
		            System.out.println("Pair found: " 
		            + arr[i] + " + " + arr[j] + "=" + target);
		        }
		    }
		}

		if(!found) {
		    System.out.println("No pair found!");
		}
	}
}
