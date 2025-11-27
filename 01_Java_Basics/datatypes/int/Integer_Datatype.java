// Integer : It is used to store whole numbers without decimal points.
// We can also declare negative numbers.


public class Main {
    public static void main(String[] args) {
        int stock = 120;
        int orderedquantity = 15;
        
        if(stock>orderedquantity) {
            System.out.println("Order Placed");
        }
        else{
            System.out.println("No enough stock available");
        }
        
    }
}
