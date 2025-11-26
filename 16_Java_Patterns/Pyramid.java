public class Pyramid {
    public static void main(String[] args){
        
        int n = 4;
        
        for(int i=1;i<=n;i++){
            
            // for spaces
            for(int a=1;a<=n-i;a++){
                System.out.print(" ");
            }
            
            // for stars
            for(int b=1;b<=2*i-1;b++){
                System.out.print("*");
            }
            
            System.out.println();
            
        }
        
    }
}
