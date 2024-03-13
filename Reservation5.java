import java.util.Scanner;

public class Reservation5 {
    private String Cname;
    private String address;
    private long mobileNumber;
    private int price;
    private int quantity;
    private int discount;
    private double tax;
    private double totalPrice;
    private String choice;  

    // Constructor
    public Reservation5(String cname, String address, long mobileNumber, int price, int quantity, int discount, double tax, String choice) {
        this.Cname = cname;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        this.tax = tax;
        this.choice = choice;
    }

    public void printData() {
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

    public void calculateData() {
        totalPrice = quantity * price;

        switch (choice.toLowerCase()) {
            case "jammu":
                jammu();
                break;
            case "delhi":
                Delhi();
                break;
            case "pathankot":
                pathankot();
                break;
            case "prayagraj":
                prayagraj();
                break;
            case "varanasi":
                Varanasi();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid city.");
                return;
        }
    }

    // Update method signatures to accept necessary parameters
    public void jammu() {
        System.out.println("You chose Jammu.");
    }

    public void Delhi() {
        System.out.println("You chose Delhi.");
    }

    public void pathankot() {
        System.out.println("You chose Pathankot.");
    }

    public void prayagraj() {
        System.out.println("You chose Prayagraj.");
    }

    public void Varanasi() {
        System.out.println("You chose Varanasi.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your customer name:");
        String cname = scanner.nextLine();

        System.out.println("Enter your customer Address:");
        String address = scanner.nextLine();

        System.out.println("Enter your Mobile number:");
        long mobileNumber = scanner.nextLong();

        System.out.println("Choose a city: \n 1. Jammu,\n 2. Delhi,\n 3. Pathankot,\n 4. Prayagraj, \n 5. Varanasi");
        String choice = scanner.next();

        System.out.println("Enter price:");
        int price = scanner.nextInt();

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        System.out.println("Enter discount:");
        int discount = scanner.nextInt();

        System.out.println("Enter tax:");
        double tax = scanner.nextDouble();

        // Creating object of Reservation5
        Reservation5 reservation = new Reservation5(cname, address, mobileNumber, price, quantity, discount, tax, choice);
        reservation.calculateData();
        reservation.printData();
    }
}
