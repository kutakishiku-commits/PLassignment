import java.util.Scanner;

public class task2955 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int days = (h - b - 1) / (a - b) + 1;

        System.out.println(days);
    }
}