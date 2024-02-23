import java.util.Scanner;

public class Reservation3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Reservation Application!");

        String[] destinations = {"Jammu", "Delhi", "Pathankot", "Prayagraj", "Varanasi"};
        int prices;

        

        System.out.println("Enter your name:");
        String customerName = scanner.nextLine();
        
        System.out.println("Enter your address:");
        String address = scanner.nextLine();
        
        System.out.println("Enter your mobile number:");
        long mobileNumber = scanner.nextLong();

        System.out.println("Choose a Destination:");
        for (int i = 0; i < destinations.length; i++) {
            System.out.println((i + 1) + ". " + destinations[i]);
        }
        int destinationChoice = scanner.nextInt();

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        // Calculate total price
        System.out.println("Enter Ticket price:");
        prices=sc.nextInt();
        double totalPrice = quantity * prices;

        System.out.println("Customer name: " + customerName);
        System.out.println("Address: " + address);
        System.out.println("Customer mobile number: " + mobileNumber);
        System.out.println("Destination: " + destinations[destinationChoice - 1]);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + prices);
        System.out.println("Total Price: $" + totalPrice);
    }
}
