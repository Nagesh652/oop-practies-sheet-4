import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Position = ");
        int position = sc.nextInt();

        try {
            System.out.println("Element = " + arr[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array position.");
        }

        sc.close();
    }
}