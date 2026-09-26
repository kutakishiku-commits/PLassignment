import java.util.Scanner;

public class task2943 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = n / 10;
        int j = k % 10;
        System.out.println(j);
    }
}