import java.util.Scanner;

public class PayrollScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hourly rate: ");
        double rate = sc.nextDouble();
        System.out.print("Hours worked: ");
        double hours = sc.nextDouble();
        double gross = rate * hours;
        double pct = gross <= 2000 ? 10 : gross <= 4000 ? 12 : gross <= 10000 ? 15 : 20;
        double tax = gross * pct / 100;
        System.out.printf("Gross pay: Php %.2f%nWithholding (%.0f%%): Php %.2f%nNet pay: Php %.2f%n",
                gross, pct, tax, gross - tax);
    }
}
