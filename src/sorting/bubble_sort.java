package sorting;

public class bubble_sort {

	public static void main(String[] args) {
		int[] arr= {2,5,1,10,8,4};
		
		int n=arr.length;
		
		
		for(int i=0;i<n-1;i++) 
		{
			for(int j=0;j<n-1-i;j++)
			{
					if(arr[j] > arr[j+1]) 
					{
					    int temp = arr[j];      //  initialize temp
					    arr[j] = arr[j+1];
					    arr[j+1] = temp;
					}
				}
			}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		}

	}


