import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JediBR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Height (cm): ");
        double height = Double.parseDouble(br.readLine());
        System.out.print("Age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Citizenship code (C/N): ");
        String cit = br.readLine();
        System.out.print("Recommendee code (R/N): ");
        String rec = br.readLine();
        boolean accepted = rec.equalsIgnoreCase("R")
                || (height >= 200 && age >= 21 && age <= 25 && cit.equalsIgnoreCase("C"));
        System.out.println(accepted ? "Accepted" : "Rejected");
    }
}
