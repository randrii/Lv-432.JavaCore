import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Homework_1_2 {
    public static void main(String []args) throws IOException {
        BufferedReader input_values = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name ?");
        String name = input_values.readLine();
        System.out.println("So, where do you live, " + name);
        System.out.println("Please enter your address");
        String address  = input_values.readLine();
        System.out.println("Short infomation about you : Your name is " + name + " and your address is "+ address);


    }
}
