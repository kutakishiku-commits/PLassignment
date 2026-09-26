import java.util.Scanner;

public class task2948 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = (n / 3600) % 24;
        int m = (n / 60)% 60;
        int s = n % 60;
        System.out.println(h + ":" + m/10 + m%10 + ":" + s/10 + s%10);
    }
}