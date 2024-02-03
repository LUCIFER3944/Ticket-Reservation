import java.util.Scanner;

public class Reservation2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Reservation Application!");

        
        System.out.println("Enter your name:");
        String Cname = scanner.nextLine();
        
        System.out.println("Enter your customer Address:");
        String address = scanner.nextLine();
        
        System.out.println("Enter your Mobile number:");
        long mobileNumber = scanner.nextLong();


        System.out.println("Choose a Destination \n 1. Jammu,\n 2. Delhi,\n 3. pathankot,\n 4.Prayagraj, \n 5. Vanarasi");
        int DestinationChoice = scanner.nextInt();

        System.out.println("Price");
        int price = scanner.nextInt();
 

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();


     
      

        double totalPrice = 0;

        switch (DestinationChoice) {
            case 1:
                System.out.println("You chose jammu.");
                totalPrice = quantity * price;
                break;
            case 2:
                System.out.println("You chose Delhi.");
                totalPrice = quantity * price;
                break;
            case 3:
                System.out.println("You chose pathankot.");
                totalPrice = quantity * price;
                break;
            case 4:
                System.out.println("You chose prayagraj.");
                totalPrice = quantity * price;
                break;
            case 5:
                System.out.println("You chose Vanarasi.");
                totalPrice = quantity * price;
                break;
            default:
                System.out.println("Invalid choice. Please select a valid pizza.");
                return;
        }

        System.out.println("Costumer name="+Cname);
        System.out.println("Address="+address);
        System.out.println("Costumer mobile number="+mobileNumber);
        System.out.println("Quantity: " + quantity);
        System.out.println("price " + price);
        System.out.println("Total Price: $" + totalPrice);
     


       
        
    }
}
