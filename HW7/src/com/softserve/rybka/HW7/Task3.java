package com.softserve.rybka.HW7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String text = reader.readLine();

        String text = "I have $5.25 and You have $100.00. This bottle costs $ 5.50. Bill has 6.75. But now $3.95 left. Snickers costs $4 but I have only $3.";
        String pattern = "\\$\\s?(\\d*(\\.\\d{2})*)";
        //String pattern = "\\$(\\d*)(\\.\\d{2})";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()){
            System.out.println(text.substring(m.start(), m.end()));
        }
    }
}
