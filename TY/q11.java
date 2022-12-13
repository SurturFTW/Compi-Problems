public class q11 {
  public static void main(String[] args) {
    // create an unsorted array of integers
    int[] arr = { 5, 3, 7, 2, 4, 1, 6 };

    // print the array before sorting
    System.out.println("Before sorting:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    // sort the array using selection sort
    selectionSort(arr);

    // print the array after sorting
    System.out.println("After sorting:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[] + " "); // semicolon
    } 
    System.out.println();
  }

  public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length() - 1; i--) { // decrement in i--, length() should be lenght
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minindex]) minIndex = j; //typo index
      }
      int temp = arr[i];
      arr[i] = arr[minIndex] //missing semicolon
      arr[minIndex] = temp;  //semicolon
    }
  }
}
