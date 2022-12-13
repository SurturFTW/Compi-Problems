import java.utils.ArrayList; //util

public class q16 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
      numbers.add(i);
    }

    for (Integer numbers : numbers) { //var type and numbers
      System.out.println(numbers);
    }

    if (numbers.contains(5)) {
      System.out.println(''The list contains the number 5''); // " " is ''' ''
     } else {
      System.out.println(''The list does not contain the number 5''); // " " is '' ''
    }
  }
}
