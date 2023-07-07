import java.util.InputMismatchException;
import java.util.Scanner;

class LibraryDemo1 {
    private static class Node {
        Node next;
        int id;
        String name;
        String author;
        String publisher;

        Node(int id, String name, String author, String publisher) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            next = null;
        }
    }

    private Node head;

    public void insert() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        if (findBookById(id) != null) {
            System.out.println("Book with this ID already exists. Please try again with a different ID.");
            return;
        }

        System.out.print("Enter name of Book: ");
        String name = sc.next();

        System.out.print("Enter name of author: ");
        String author = sc.next();

        System.out.print("Enter publisher of Book: ");
        String publisher = sc.next();

        Node new_node = new Node(id, name, author, publisher);
        if (head == null) {
            head = new_node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new_node;
        }

        System.out.println("New book inserted successfully.");
    }

    public void search() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Node book = findBookById(id);
        if (book != null) {
            displayBookDetails(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void update() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID to update: ");
        int id = sc.nextInt();

        Node book = findBookById(id);
        if (book != null) {
            System.out.print("Enter new Book ID: ");
            book.id = sc.nextInt();

            System.out.print("Enter new name of Book: ");
            book.name = sc.next();

            System.out.print("Enter new name of author: ");
            book.author = sc.next();

            System.out.print("Enter new publisher of Book: ");
            book.publisher = sc.next();

            System.out.println("Book details updated successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID todelete: ");
        int id = sc.nextInt();

        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        if (head.id == id) {
            head = head.next;
            System.out.println("Book deleted successfully.");
            return;
        }

        Node curr = head;
        Node prev = null;

        while (curr != null && curr.id != id) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void show() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Node curr = head;
        while (curr != null) {
            displayBookDetails(curr);
            curr = curr.next;
        }
    }

    private Node findBookById(int id) {
        Node curr = head;
        while (curr != null) {
            if (curr.id == id) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    private void displayBookDetails(Node book) {
        System.out.println("Book ID: " + book.id);
        System.out.println("Name: " + book.name);
        System.out.println("Author: " + book.author);
        System.out.println("Publisher: " + book.publisher);
        System.out.println();
    }

    public static void main(String args[]) {
        System.out.println("*******************************************************");
        System.out.println("**********                                   **********");
        System.out.println("********** Library Management System Project **********");
        System.out.println("**********                                   **********");
        System.out.println("*******************************************************");

        Scanner sc = new Scanner(System.in);
        LibraryDemo1 library = new LibraryDemo1();

        boolean exit = false;
        do {
            System.out.println("1. Insert New Book Record");
            System.out.println("2. Search Book Record");
            System.out.println("3. Update Book Record");
            System.out.println("4. Delete Book Record");
            System.out.println("5. Show All Book Records");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        library.insert();
                        break;
                    case 2:
                        library.search();
                        break;
                    case 3:
                        library.update();
                        break;
                    case 4:
                        library.delete();
                        break;
                    case 5:
                        library.show();
                        break;
                    case 6:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                sc.nextLine(); // Consume the remaining input
            }
            System.out.println();
        } while (!exit);

        System.out.println("Exiting Library Management System. Thank you!");
    }
}
