import java.util.Scanner;

public class task2950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int breaks = n - 1;
        int breakTime = (breaks / 2) * 20 + (breaks % 2) * 5;
        int totalMinutes = n * 45 + breakTime;
        int hours = 9 + totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(hours + " " + minutes);
    }
}