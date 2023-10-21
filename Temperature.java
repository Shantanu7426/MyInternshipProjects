import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value: ");
        double value = scanner.nextDouble();

        System.out.println("Enter the unit of temperature (Celsius or Fahrenheit): ");
        String unit = scanner.next();

        if (unit.equalsIgnoreCase("Celsius")) {
            double result = (value * 9/5) + 32;
            System.out.println("The temperature in Fahrenheit is " + result);
        } else if (unit.equalsIgnoreCase("Fahrenheit")) {
            double result = (value - 32) * 5/9;
            System.out.println("The temperature in Celsius is " + result);
        } else {
            System.out.println("Invalid unit of temperature. Please enter either Celsius or Fahrenheit.");
        }
        scanner.close();
    }
}
