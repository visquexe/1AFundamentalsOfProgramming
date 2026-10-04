import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScholarshipBR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("NSAT score: ");
        double nsat = Double.parseDouble(br.readLine());
        System.out.print("Parents' monthly salary: ");
        double salary = Double.parseDouble(br.readLine());
        System.out.print("Entrance exam score: ");
        double exam = Double.parseDouble(br.readLine());
        String result;
        if (salary > 10000 || nsat < 90 || exam < 85) {
            result = "Rejected";
        } else if (salary <= 3500 && (nsat + exam) / 2 >= 91) {
            result = "Accepted";
        } else {
            result = "For further study";
        }
        System.out.println(result);
    }
}
