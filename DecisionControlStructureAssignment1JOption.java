import javax.swing.JOptionPane;

public class LeapYearJOption {
    public static void main(String[] args) {
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter year:"));
        boolean leap = (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
        JOptionPane.showMessageDialog(null, y + (leap ? " is a leap year." : " is not a leap year."));
    }
}
