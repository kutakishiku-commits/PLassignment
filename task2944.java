import java.util.Scanner;

public class task2944 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f = n / 100;
        int k = (n / 10) % 10;
        int a = n % 10;
        System.out.println(f+k+a);
    }
}