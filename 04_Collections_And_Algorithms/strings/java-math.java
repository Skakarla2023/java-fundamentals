public class JavaMath {
    public static void main(String[] args) {
        
        System.out.println(Math.max(10,9));
        System.out.println(Math.min(5,8));
        System.out.println(Math.sqrt(46));
        System.out.println(Math.pow(2,4));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.round(35.45));
        // ceil: smallest integer that is greater than or equal to the number.
        System.out.println(Math.ceil(4.2));
        // floor: greatest integer that is less then or equal to the number
        System.out.println(Math.floor(4.6));
        // Math.random() returns a number between 0.0 and 1.0.
        System.out.println(Math.random());
        int randomNum = (int)(Math.random()*101);
        System.out.println(randomNum);
        
    }
}
