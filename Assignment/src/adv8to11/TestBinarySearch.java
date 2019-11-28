package adv8to11;

public class TestBinarySearch {
	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		BinarySearch ob = new BinarySearch(); 
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int n = arr.length; 
		int x = 10; 
		// find the element and put the result to "result"
		int result = ob.binarySearch(arr, 0, n - 1, x);
		//check the result is in the array or not
		if (result == -1)
			//If the element is not in the array
			System.out.println("Element not present"); 
		else
			//If the element is in the array
			System.out.println("Element found at index " + result); 
	}
}
