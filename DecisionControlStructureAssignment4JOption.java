import javax.swing.JOptionPane;

public class JediJOption {
    public static void main(String[] args) {
        double height = Double.parseDouble(JOptionPane.showInputDialog("Height (cm):"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("Age:"));
        String cit = JOptionPane.showInputDialog("Citizenship code (C/N):");
        String rec = JOptionPane.showInputDialog("Recommendee code (R/N):");
        boolean accepted = rec.equalsIgnoreCase("R")
                || (height >= 200 && age >= 21 && age <= 25 && cit.equalsIgnoreCase("C"));
        JOptionPane.showMessageDialog(null, accepted ? "Accepted" : "Rejected");
    }
}
