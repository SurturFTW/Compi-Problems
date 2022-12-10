class q2 {
	static int[] findMinMax(int[] arr, int n)
	{
		int mini = arr[0];
		int maxi = arr[0];

		for (int i = 0; i < n; i++) {
			if (arr[i] < mini) {
				mini = arr[i];	// }
			else if (arr[i] > maxi) {
				maxi = arr[i]; //}
		}
		int[] ans = new int[2];
		ans[0] = mini;
		ans[1] = maxi;
		// return ans;
	}	return ans;
	

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5 };
		int N = arr.length;

		// Function call
		int[] ans = findMinMax(arr); //nt[] ans = findMinMax(arr, N);
		system.out.print("Maximum is: " + ans[1]);
		System.out.print("\n" + "Minimum is: " + ans[0]);
	}
}

/* Medium
1) } missing in if-else
2) Line 27 -> (arr, N))
3) Line 28,29 -> S should be capital in System.
4) Line 17 -> return should be inside the function
*/
