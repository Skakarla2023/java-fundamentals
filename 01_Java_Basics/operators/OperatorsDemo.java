public class OperatorsDemo {

    public static void main(String[] args) {

        int quantity = 2;
        double price = 150;
        boolean isMember = true;
        int restaurantFlags = 1 | 4; // 1 = Veg, 4 = FastFood

        // Arithmetic
        double subtotal = quantity * price;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;

        // Relational + Logical
        boolean applyDiscount = isMember && total > 200;

        // Ternary
        double discount = applyDiscount ? 30 : 0;

        // Compound Assignment
        total -= discount;

        // Unary
        int rewardPoints = 0;
        rewardPoints++;

        // Bitwise AND
        boolean isVegRestaurant = (restaurantFlags & 1) != 0;

        // Modulus — free drink for every 2 items
        int freeDrinks = quantity % 2 == 0 ? 1 : 0;

        // Output
        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Final Total: " + total);
        System.out.println("Reward Points: " + rewardPoints);
        System.out.println("Free Drinks: " + freeDrinks);
        System.out.println("Is Veg Restaurant: " + isVegRestaurant);
    }
}
