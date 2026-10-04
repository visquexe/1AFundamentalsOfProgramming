import javax.swing.JOptionPane;

public class PayrollJOption {
    public static void main(String[] args) {
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Hourly rate:"));
        double hours = Double.parseDouble(JOptionPane.showInputDialog("Hours worked:"));
        double gross = rate * hours;
        double pct = gross <= 2000 ? 10 : gross <= 4000 ? 12 : gross <= 10000 ? 15 : 20;
        double tax = gross * pct / 100;
        JOptionPane.showMessageDialog(null, String.format(
                "Gross pay: Php %.2f\nWithholding (%.0f%%): Php %.2f\nNet pay: Php %.2f",
                gross, pct, tax, gross - tax));
    }
}
