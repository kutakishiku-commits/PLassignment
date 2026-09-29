import java.util.Scanner;

public class task2958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = 1 - 1 / (a / b + 1);
        int max = a * k + b * (1 - k);

        System.out.println(max);
    }
}