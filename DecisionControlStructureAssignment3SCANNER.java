import java.util.Scanner;

public class ScholarshipScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NSAT score: ");
        double nsat = sc.nextDouble();
        System.out.print("Parents' monthly salary: ");
        double salary = sc.nextDouble();
        System.out.print("Entrance exam score: ");
        double exam = sc.nextDouble();
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
