import java.util.*;
class q5{
    public static void main(String [] args){
        int array = { 1, 2, 3, 4, 5, 6, 7 };    //int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array(i);    //array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        System.out.println(array);  //System.out.println(Arrays.toString(array)); 
    }
}

//EASY