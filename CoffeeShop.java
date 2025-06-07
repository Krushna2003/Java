import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coffee Shop Bill Calculator");
        System.out.print("Enter number of coffees: ");
        int coffees = scanner.nextInt();
        System.out.print("Enter price per coffee: ");
        double coffeePrice = scanner.nextDouble();

        System.out.print("Enter number of pastries: ");
        int pastries = scanner.nextInt();
        System.out.print("Enter price per pastry: ");
        double pastryPrice = scanner.nextDouble();

        double subtotal = (coffees * coffeePrice) + (pastries * pastryPrice);
        double tax = subtotal * 0.07; // 7% tax
        double total = subtotal + tax;

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax (7%%): $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);

        scanner.close();
    }
}
