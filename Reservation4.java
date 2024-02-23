import java.util.Scanner;

public class Reservation4 {
    private static String Cname;
    private static String address;
    private static long mobileNumber;
    private static int price;
    private static int quantity;
    private static int discount;
    private static double tax;
    private static double totalPrice;
    private static int pizzaChoice;  

    public static void main(String[] args) {
        getdata();
        Calculatedata();
        printdata();
    }

    public static void getdata() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your customer name:");
        Cname = scanner.nextLine();

        System.out.println("Enter your customer Address:");
        address = scanner.nextLine();

        System.out.println("Enter your Mobile number:");
        mobileNumber = scanner.nextLong();

        System.out.println("Choose a pizza: \n 1. Margherita,\n 2. Pepperoni,\n 3. Veggie,\n 4. BBQ Chicken, \n 5. Hawaiian");
        pizzaChoice = scanner.nextInt();

        System.out.println("Enter price:");
        price = scanner.nextInt();

        System.out.println("Enter quantity:");
        quantity = scanner.nextInt();

        System.out.println("Enter discount:");
        discount = scanner.nextInt();

        System.out.println("Enter tax:");
        tax = scanner.nextDouble();
    }

    public static void Calculatedata() {
        totalPrice = quantity * price;

        switch (pizzaChoice) {
            case 1:
                jammu();
                break;
            case 2:
                Delhi();
                break;
            case 3:
                pathankot();
                break;
            case 4:
                prayagraj();
                break;
            case 5:
                Vanarasi();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid pizza.");
                return;
        }
    }

    public static void printdata() {
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

    // Update method signatures to accept necessary parameters
    public static void jammu() {
        System.out.println("You chose jammu.");
    }

    public static void Delhi() {
        System.out.println("You chose Delhi.");
    }

    public static void pathankot() {
        System.out.println("You chose pathankot.");
    }

    public static void prayagraj() {
        System.out.println("You chose prayagraj.");
    }

    public static void Vanarasi() {
        System.out.println("You chose Vanarasi.");
    }
}
