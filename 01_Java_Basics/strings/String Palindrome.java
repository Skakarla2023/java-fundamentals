import java.util.*;

public class Palindrome{
    public static void main(String[] args){
        String str = "madwam";
        
        int n =str.length();
        Boolean isPalindrome = true;
        
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                isPalindrome = false;
                break;
            }
        }
        
        if(isPalindrome){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
