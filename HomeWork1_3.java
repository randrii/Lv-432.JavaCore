import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork1_3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter unit per minute for country Ukraine...");
		double cUkr = Double.parseDouble(br.readLine());
		System.out.println("Enter unit per minute for country France...");
		double cFran = Double.parseDouble(br.readLine());
		System.out.println("Enter unit per minute for country Spain...");
		double cSpn = Double.parseDouble(br.readLine());
		System.out.println("Enter duration talk (in minutes) for Ukraine...");
		int mUkr = Integer.parseInt(br.readLine());
		System.out.println("Enter duration talk (in minutes) for France...");
		int mFran = Integer.parseInt(br.readLine());
		System.out.println("Enter duration talk (in minutes) for Spain...");
		int mSpn = Integer.parseInt(br.readLine());
		System.out.println("Count for Ukraine is " + (cUkr*mUkr));
		System.out.println("Count for France is " + (cFran*mFran));
		System.out.println("Count for Spain is " + (cSpn*mSpn));
		System.out.println("Count for all talks is " +((cUkr*mUkr)+(cFran*mFran)+(cSpn*mSpn)));
	}
}
