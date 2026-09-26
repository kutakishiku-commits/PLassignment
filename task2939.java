import java.util.Scanner;
public class task2939 {
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = k % n;
        System.out.println(result);
    }
}