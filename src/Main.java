public class Main {
    public static void main(String[] args) {

        double purchaseAmount = 30.00;
        double salesTax = 0.05;
        double totalPrice;

        totalPrice = (purchaseAmount * salesTax) + purchaseAmount;

        System.out.println("The purchase amount is: $" + purchaseAmount);
        System.out.println("The sales tax is: $" + salesTax);
        System.out.println("The total price is: $" + totalPrice);
    }
}