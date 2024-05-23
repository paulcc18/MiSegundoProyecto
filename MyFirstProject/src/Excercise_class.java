import java.util.Scanner;

public class Excercise_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int number = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int number2 = scanner.nextInt();

        int sum = number+ number2;
        double division = (double) number / number2;

        System.out.println("The result of the sum of the numbers is: " + sum);
        System.out.println("The of the division is: " + division);

        scanner.close();
    }
}