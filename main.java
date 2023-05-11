import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the power number: ");
        int power = scanner.nextInt();

        int result = advancedCalcultor(base, power);
        System.out.println("Result: " + result);
    }

    public static int advancedCalcultor(int base, int power) {
        if (base == 0) {
            return 1;
        } else {
            return base * advancedCalcultor(base, power - 1);
        }
    }
}






