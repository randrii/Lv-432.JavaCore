import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practice1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());

            if (a < 0 | b < 0) {
                throw new Exception("Negative value");
            }
        } catch (NumberFormatException e){
            System.out.println("Nonnumeric value");
            System.exit(1);
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
        }

        int square = squareRectangle(a,b);
        System.out.println(square);
    }

    private static int squareRectangle(int a, int b){
        return a*b;
    }

}
