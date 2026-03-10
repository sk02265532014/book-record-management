import java.util.Scanner;

public class Menu {

    public static void start() {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n===== BOOK MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    addBook(sc);
                    break;

                case 2:
                    BookDAO.viewBooks();
                    break;

                case 3:
                    updateBook(sc);
                    break;

                case 4:
                    deleteBook(sc);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }

        }
    }

    private static void addBook(Scanner sc) {

        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Book book = new Book(title,author,price,quantity);

        BookDAO.addBook(book);
    }

    private static void updateBook(Scanner sc) {

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        System.out.print("Enter New Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter New Quantity: ");
        int quantity = sc.nextInt();

        BookDAO.updateBook(id,price,quantity);
    }

    private static void deleteBook(Scanner sc) {

        System.out.print("Enter Book ID to delete: ");
        int id = sc.nextInt();

        BookDAO.deleteBook(id);
    }

}