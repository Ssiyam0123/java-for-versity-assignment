import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // TeddyBear bear1 = new TeddyBear(); // If needed
        Calc forSum = new Calc();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float a = input.nextFloat();

        System.out.print("Enter the second number: ");
        float b = input.nextFloat();

        float resultForSum = forSum.sum(a, b); // Use float
        System.out.println("Result: " + resultForSum);

        input.close();
    }
}
