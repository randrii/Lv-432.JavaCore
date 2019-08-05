import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Phone_calls {
    public static void main (String []args) throws IOException {

        BufferedReader input_values = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter your values");
        String values = input_values.readLine();
        double c1 = Double.parseDouble(values);
        values = input_values.readLine();
        double c2 = Double.parseDouble(values);
        values = input_values.readLine();
        double c3 = Double.parseDouble(values);
        values = input_values.readLine();
        double t1 = Double.parseDouble(values);
        values = input_values.readLine();
        double t2 = Double.parseDouble(values);
        values = input_values.readLine();
        double t3 = Double.parseDouble(values);
        System.out.println("With first country you'll spend "  + c1*t1 + " units ");
        System.out.println("With second country you'll spend "  + c2*t2 + " units ");
        System.out.println("With third country you'll spend "  + c3*t3 + " units ");
        System.out.println("Together  you'll spend "  + (c1*t1+c2*t2+c3*t3) + " units ");
    }
}
