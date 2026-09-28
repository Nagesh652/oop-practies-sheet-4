import java.util.Scanner;

public class Main {
    static void checkEligibility(int age) {
        try {
            if (age < 18) {
                throw new Exception("Not eligible to vote.");
            }
            System.out.println("Eligible to vote.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Age = ");
        int age = sc.nextInt();

        checkEligibility(age);

        sc.close();
    }
}