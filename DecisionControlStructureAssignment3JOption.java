import javax.swing.JOptionPane;

public class ScholarshipJOption {
    public static void main(String[] args) {
        double nsat = Double.parseDouble(JOptionPane.showInputDialog("NSAT score:"));
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Parents' monthly salary:"));
        double exam = Double.parseDouble(JOptionPane.showInputDialog("Entrance exam score:"));
        String result;
        if (salary > 10000 || nsat < 90 || exam < 85) {
            result = "Rejected";
        } else if (salary <= 3500 && (nsat + exam) / 2 >= 91) {
            result = "Accepted";
        } else {
            result = "For further study";
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
