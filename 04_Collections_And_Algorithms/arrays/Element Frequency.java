import java.util.*;

class Main {
    public static void main(String[] args) {
        
        int[] arr = {11, 2, 3, 4, 2, 5, 3, 4, 2};
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Element:");
        int x = sc.nextInt();
        
        int count = 0;
        for(int i:arr){
            if(i == x){
                count++;
            }
        }
        
        System.out.println("Count of "+x+" is:"+count);
        
    }
}
