import java.util.Scanner;

public class Main {
    static void validateMarks(int marks) {
        try {
            if (marks < 0 || marks > 100) {
                throw new Exception("Invalid marks.");
            }
            System.out.println("Valid marks.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Marks = ");
        int marks = sc.nextInt();

        validateMarks(marks);

        sc.close();
    }
}
