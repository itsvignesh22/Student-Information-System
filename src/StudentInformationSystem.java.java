import java.util.Scanner;

public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n--- Student Information System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.println("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age ");
                    int age = sc.nextInt();

                    System.out.print("Enter grade: ");
                    double grade = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter contact: ");
                    String contact = sc.nextLine();

                    if (!ValidationUtils.isValidName(name) || !ValidationUtils.isValidAge(age) || !ValidationUtils.isValidGrade(grade)) {
                        System.out.println("Invalid input. Try again.");
                        break;
                    }
                    Student student = new Student(name, age, grade, contact);
                    manager.addStudent(student);
                    break;

                case 2:
                    manager.displayAllStudents();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }


            }
        }
    }