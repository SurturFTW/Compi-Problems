import java.util.Scanner;
class q6{
    public static void main(String[] args) {
        Scanner in = new Scanner();    //Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int length = str.length();  
        boolean isPalindrome = true;          
        for(int i = 0; i < length; i++)
        {
            if(str.charAt(i) != str.charAt(length - 1 - i))    //if(str.charAt(i) != str.charAt(length - 1 - i)){
                System.out.println("Not a palindrome.");
                isPalindrome = false;
                break;
            }
        }          
        if(isPalindrome) {
            System.out.println("palindrome.");  //System.out.println("palindrome.");
        }
    }
}

//EASY