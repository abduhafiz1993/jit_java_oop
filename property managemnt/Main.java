import java.text.BreakIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=0;
        while(x!=1){
        System.out.print("Enter the name of the shop: ");
        String shopName = scanner.nextLine();
        Shop shop = new Shop(shopName);
        System.out.println("...........Wellcome.............");
        System.out.println("Enter username:");
        String username= scanner.nextLine();
        System.out.println("Enter your password");
        String password= scanner.nextLine();
        //adminster username= adminpro password= passadmin 
        if(username=="adminpro" && password=="passadmin"){
        while (true) {
            System.out.println("\nShop Management Menu");
            System.out.println("1. Add Property");
            System.out.println("2. Remove Property");
            System.out.println("3. Find Property");
            System.out.println("4. List Properties");
            System.out.println("5. logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter property name: ");
                String propertyName = scanner.nextLine();
                System.out.print("Enter property price: ");
                double propertyPrice = scanner.nextDouble();
                System.out.print("Enter property quantity: ");
                int propertyQuantity = scanner.nextInt();
                Property property = new Property(propertyName, propertyPrice, propertyQuantity);
                shop.addProperty(property);
                System.out.println("Property added successfully.");
            } else if (choice == 2) {
                System.out.print("Enter property name: ");
                String propertyName = scanner.nextLine();
                Property property = shop.findProperty(propertyName);
                if (property == null) {
                    System.out.println("Property not found.");
                } else {
                    shop.removeProperty(property);
                    System.out.println("Property removed successfully.");
                }
            } else if (choice == 3) {
                System.out.print("Enter property name: ");
                String propertyName = scanner.nextLine();
                Property property = shop.findProperty(propertyName);
                if (property == null) {
                    System.out.println("Property not found.");
                } else {
                    System.out.println("Name: " + property.getName());
                    System.out.println("Price: " + property.getPrice());
                    System.out.println("Quantity: " + property.getQuantity());
                }
            } else if (choice == 4) {
                shop.listProperties();
            } else if (choice == 5) {
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }}else{
            System.out.println("Do you want to exist 1");
            x=scanner.nextInt();
        }
    }
}
}

