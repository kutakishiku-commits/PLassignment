import java.util.Scanner;

public class task2936 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println(c);

        scanner.close();
    }
}