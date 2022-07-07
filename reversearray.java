
public class reversearray {
	
	/*Reversing the elements of an array*/
	static void reverseArray(int arr[], int start, int end) {
		int temp;
			while (start<end){
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start ++;
				end --;
			
		}
	}
	
	/*Logic to print array on a line*/
	static void printArray(int arr[], int size) {
		for (int i = 0; i < size; i++ )
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		printArray(arr,6); /*Printing the original array*/		
		System.out.println(" \n");
		/*Print the reverseArray*/
		reverseArray(arr, 0,5);
		System.out.println("Reversed Array is : \n");
		printArray(arr,6);
	}

}
