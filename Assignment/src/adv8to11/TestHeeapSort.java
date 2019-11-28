package adv8to11;

public class TestHeeapSort {
	// Driver program
	public static void main(String args[]) 
	{ 
		//creeate an array and store some value
		int arr[] = {98, 38, 93, 33, 21, 6, 63, 81, 32};
		// the n will be used in the printArray() method
		int n = arr.length; 

		HeapSort ob = new HeapSort(); 
		ob.sort(arr); 

		System.out.println("Sorted array is"); 
		printArray(arr); 
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		/* A utility function to print array of size n */		 
			int n = arr.length; 
			for (int i=0; i<n; ++i) 
				System.out.print(arr[i]+" "); 
			System.out.println(); 
		
	}
}
