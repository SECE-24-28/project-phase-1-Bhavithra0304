import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "gasbookings.txt";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Gas Booking System ---");
            System.out.println("1. Add Customer & Book Cylinder");
            System.out.println("2. View All Bookings");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                addBooking(sc);
            } else if (choice == 2) {
                viewBookings();
            } else if (choice == 3) {
                System.out.println("Ended...");
                sc.close();
                return;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }

    public static void addBooking(Scanner sc) throws Exception {
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter Booking Date: ");
        String date = sc.nextLine();

        System.out.print("Enter Cylinder Type (Domestic/Commercial): ");
        String cylinder = sc.nextLine();

        FileWriter fw = new FileWriter(FILE_NAME, true);
        fw.write(id + "," + name + "," + address + "," + phone + "," + date + "," + cylinder + "\n");
        fw.close();

        System.out.println("Booking added successfully!");
    }

    public static void viewBookings() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
        System.out.println("\n------------------------Bookings-------------------------");

        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            System.out.println("ID: " + data[0] +", Name: " + data[1] + ", Address: " + data[2] + ", Phone: " + data[3] + ", Date: " + data[4] +", Cylinder: " + data[5]);
        }

        br.close();
    }
}
