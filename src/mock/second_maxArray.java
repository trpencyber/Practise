package mock;

public class second_maxArray {

	public static void main(String[] args) {
		int[] arr= {23,4,8,22,12};
		int max=arr[0];
		int secondmax=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}
			else if(arr[i] > secondmax && arr[i] != max) {
				
				secondmax=arr[i];
			}
		}
			System.out.println(secondmax);

	}

}


