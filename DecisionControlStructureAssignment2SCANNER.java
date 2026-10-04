import java.util.Scanner;

public class LeapYearScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        boolean leap = (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
        System.out.println(y + (leap ? " is a leap year." : " is not a leap year."));
    }
}
