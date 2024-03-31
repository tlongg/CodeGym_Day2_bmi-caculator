import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Height:");
        double height = scanner.nextDouble();

        System.out.println("Enter Weight:");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Overweight");
        } else if (bmi >= 30) {
            System.out.println("Obese");
        } else {
            System.out.println("Invalid data");
        }

    }
}

