import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        
        char[] str1 = str.toCharArray();
        
        int open = 0;
        int closed = 0;
        
        for(int i=0;i<str1.length;i++){
            if(str1[i]=='('){
                open++;
            }
            else{
                closed++;
            }
        }
        
        int valid = 2*(Math.min(open,closed));
        
        System.out.println(valid);
        
    }
}
