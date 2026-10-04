import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYearBR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter year: ");
        int y = Integer.parseInt(br.readLine());
        boolean leap = (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
        System.out.println(y + (leap ? " is a leap year." : " is not a leap year."));
    }
}
