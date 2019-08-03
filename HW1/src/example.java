import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("number1= ");
        int number1 = Integer.parseInt(br.readLine());
        System.out.print("number2= ");
        int number2 = Integer.parseInt(br.readLine());
        System.out.println("number1+number2: "+(number1+number2));
        System.out.println("number1-number2: "+(number1-number2));
        System.out.println("number1*number2: "+(number1*number2));
        System.out.println("number1/number2: "+(number1/number2));

        System.out.println("How are you?");
        String answer;
        answer = br.readLine();
        System.out.println("You are "+answer);

    }
}
