import java.util.Scanner;

public class JediScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Height (cm): ");
        double height = sc.nextDouble();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Citizenship code (C/N): ");
        String cit = sc.next();
        System.out.print("Recommendee code (R/N): ");
        String rec = sc.next();
        boolean accepted = rec.equalsIgnoreCase("R")
                || (height >= 200 && age >= 21 && age <= 25 && cit.equalsIgnoreCase("C"));
        System.out.println(accepted ? "Accepted" : "Rejected");
    }
}
