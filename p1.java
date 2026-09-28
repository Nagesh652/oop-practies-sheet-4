import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First number = ");
        int num1 = sc.nextInt();

        System.out.print("Second number = ");
        int num2 = sc.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        sc.close();
    }
}