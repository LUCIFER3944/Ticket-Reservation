import java.util.Scanner;

public class Reservation1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your customer name:");
        String Cname = scanner.nextLine();

        System.out.println("Enter your customer Address:");
        String address = scanner.nextLine();

        System.out.println("Enter your Mobile number:");
        long mobileNumber = scanner.nextLong();

        System.out.println("Choose a pizza: \n 1. Margherita,\n 2. Pepperoni,\n 3. Veggie,\n 4. BBQ Chicken, \n 5. Hawaiian");
        int pizzaChoice = scanner.nextInt();

        System.out.println("Enter price:");
        int price = scanner.nextInt();

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        System.out.println("Enter discount:");
        int discount = scanner.nextInt();

        System.out.println("Enter tax:");
        double tax = scanner.nextDouble();

        double totalPrice = 0;

        switch (pizzaChoice) {
            case 1:
              jammu(quantity, price);
                totalPrice = quantity * price;
                break;
            case 2:
               Delhi(quantity, price);
                totalPrice = quantity * price;
                break;
            case 3:
            pathankot(quantity, price);
                totalPrice = quantity * price;
                break;
            case 4:
            prayagraj(quantity, price);
                totalPrice = quantity * price;
                break;
            case 5:
            Vanarasi(quantity, price);
                totalPrice = quantity * price;
                break;
            default:
                System.out.println("Invalid choice. Please select a valid pizza.");
                return;
        }

        System.out.println("Customer name: " + Cname);
        System.out.println("Address: " + address);
        System.out.println("Customer mobile number: " + mobileNumber);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount: $" + discount);
        System.out.println("Net amount: $" + (totalPrice - discount));
        System.out.println("Tax: $" + (totalPrice * tax / 100));
    }

    public static void jammu(int quantity, int price) {
        System.out.println("You chose jammu.");
    }

    public static void Delhi(int quantity, int price) {
        System.out.println("You chose Delhi.");
    }

    public static void pathankot(int quantity, int price) {
        System.out.println("You chose pathankot.");
    }

    public static void  prayagraj(int quantity, int price) {
        System.out.println("You chose  prayagraj.");
    }

    public static void Vanarasi(int quantity, int price) {
        System.out.println("You chose Vanarasi.");
      }
}