import java.util.Scanner;

public class task2947 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(((n / 60)% 24) + " " + (n % 60));
    }
}