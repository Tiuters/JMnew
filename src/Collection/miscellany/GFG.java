package Collection.miscellany;
import java.util.HashSet;
// Java simple program to find elements which are not present in second array
//   https://www.geeksforgeeks.org/find-elements-present-first-array-not-second/
class GFG{
	// Function for finding elements which are there in a[] but not in b[].
	static void findMissing(int a[], int b[], int n, int m){

		for (int i = 0; i < n; i++){
			int j;
			for (j = 0; j < m; j++)
				if (a[i] == b[j]) break;

			if (j == m)
				System.out.print(a[i] + " ");
		}
	}

	// Driver Code
	public static void main(String[] args){
		int a[] = { 1, 2, 6, 3, 4, 5 };
		int b[] = { 2, 4, 3, 1, 0 };
		
		int n = a.length;
		int m = b.length;
		
		findMissing(a, b, n, m);
	}
}

// Java efficient program to find elements which are not present in second array
class GfG{
	// Function for finding elements which are there in a[] but not in b[].
	static void findMissing(int a[], int b[], int n, int m){
		// Store all elements of second array in a hash table
		HashSet<Integer> s = new HashSet<>();
		for (int i = 0; i < m; i++)
			s.add(b[i]);

		// Print all elements of first array that are not present in hash table
		for (int i = 0; i < n; i++)
			if (!s.contains(a[i]))
				System.out.print(a[i] + " ");
	}

	public static void main(String []args){

		int a[] = { 1, 2, 6, 3, 4, 5 };
		int b[] = { 2, 4, 3, 1, 0 };
		int n = a.length;
		int m = b.length;
		findMissing(a, b, n, m);
	}
}
