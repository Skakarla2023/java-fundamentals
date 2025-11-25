class Right_Aligned_Inverted_Triangle_Pattern {
    public static void main(String[] args) {
        
        int n = 5;
        
        for(int i=n;i>=1;i--){
            
            for(int a=0;a<n-i;a++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            
            System.out.println();
            
        }
    }
}
