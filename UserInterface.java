import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student details
        System.out.println("Enter student ID:");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();
        System.out.println("Enter department:");
        String department = scanner.nextLine();
        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter category (Hosteller/DayScholar):");
        String category = scanner.nextLine();
        System.out.println("Enter college fee:");
        double collegeFee = scanner.nextDouble();

        // Create student object based on category
        Student student;
        if (category.equals("Hosteller")) {
            System.out.println("Enter room number:");
            int roomNumber = scanner.nextInt();
            System.out.println("Enter block name:");
            char blockName = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline
            System.out.println("Enter room type:");
            String roomType = scanner.nextLine();
            student = new Hosteller(studentId, studentName, department, gender, category, collegeFee, roomNumber, blockName, roomType);
        } else if (category.equals("DayScholar")) {
            System.out.println("Enter bus number:");
            int busNumber = scanner.nextInt();
            System.out.println("Enter distance:");
            float distance = scanner.nextFloat();
            student = new DayScholar(studentId, studentName, department, gender, category, collegeFee, busNumber, distance);
        } else {
            System.out.println("Invalid category");
            return;
        }

        // Calculate and display total fee
        double totalFee = student.calculateTotalFee();
        System.out.println("Total fee: " + totalFee);

        scanner.close();
    }
}