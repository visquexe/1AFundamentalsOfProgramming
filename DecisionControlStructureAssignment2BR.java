import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayrollBR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Hourly rate: ");
        double rate = Double.parseDouble(br.readLine());
        System.out.print("Hours worked: ");
        double hours = Double.parseDouble(br.readLine());
        double gross = rate * hours;
        double pct = gross <= 2000 ? 10 : gross <= 4000 ? 12 : gross <= 10000 ? 15 : 20;
        double tax = gross * pct / 100;
        System.out.printf("Gross pay: Php %.2f%nWithholding (%.0f%%): Php %.2f%nNet pay: Php %.2f%n",
                gross, pct, tax, gross - tax);
    }
}
