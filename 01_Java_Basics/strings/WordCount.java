import java.util.*;

public class WordCount{
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Paragraph:");
        String para = sc.nextLine();
        
        para = para.trim();
        
        String[] words = para.split(" ");
        
        int count = 0;
        for(String w:words){
            if(!w.equals("")){
                count++;
            }
        }
        
        System.out.println("Number of words in the paragraph:"+count);
        
    }
}
