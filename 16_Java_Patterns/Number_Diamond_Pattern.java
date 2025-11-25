class Number_Diamond_Pattern{
    public static void main(String[] args){
        
        int n = 4;
        
        // upper part
        for(int i=1;i<=n;i++){
            
            int sum = n-i;
            int num = 2*i-1;
            
            for(int a =1;a<=sum;a++){
                System.out.print(" ");
            }
           
            
            for(int b =1;b<=num;b++){
                System.out.print(b);
            }
            
            System.out.println();
            
        }
        
        for(int i=n-1;i>=1;i--){
            
            int spaces = n-i;
            int numbers = 2*i-1;
            
            for(int a =1;a<=spaces;a++){
                System.out.print(" ");
            }
           
            
            for(int b =1;b<=numbers;b++){
                System.out.print(b);
            }
            
            System.out.println();
            
        }
        
    }
}
