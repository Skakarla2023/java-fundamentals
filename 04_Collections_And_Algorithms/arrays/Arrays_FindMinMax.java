public class Arrays_FindMinMax{
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 5, 7, 8, 9};
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      		
      for(int i:arr) {
      	
      	if(i>max) {
      		max = i;
      	}
      		
      	if(i<min) {
      		min = i;
      	}
      }
      		
      System.out.println("Maximum element in the array:"+max);
      System.out.println("Minimum element in the array:"+min);
  }
}
