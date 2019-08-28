import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Task 1. Check if str1 is substring of str2");
            String str1 = reader.readLine();
            String str2 = reader.readLine();
            System.out.println("Str1 in str 2: " + isSubstring(str2, str1));

            System.out.println("Task 2. Enter Surname+Name+MidName");
            String variable = reader.readLine();
            System.out.println(getSurnameAndInitials(variable));
            System.out.println(getName(variable));
            System.out.println(getNameMidNameLasName(variable));

            System.out.println("Task 3. Add 5 usernames");
            List<String> names = new ArrayList<>();
            String tmp;

            for (int i = 0; i < 5; i++) {
                tmp = reader.readLine();
                names.add(tmp);
            }

            for (String name: names){
                System.out.println("Validation of '" + name + "' is "+checkWithRegExp(name));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isSubstring(String str, String sub){
        return str.contains(sub);
    }

    private static String getSurnameAndInitials(String text){
        String[] s = text.split(" ");
        return s[0] + " " + s[1].charAt(0)+". "+s[2].charAt(0)+".";
    }

    private static String getName(String text){
        String[] s = text.split(" ");
        return s[1];
    }

    private static String getNameMidNameLasName(String text){
        String[] s = text.split(" ");
        return s[1]+" "+s[2]+" "+s[0];
    }

    private static boolean checkWithRegExp(String userName){
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userName);
        return m.matches();
    }
}
