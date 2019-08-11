import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example{

    public enum Continent {
        NORTH_AMERICA("usa", "canada", "mexico"),
        SOUTH_AMERICA("brasil", "argentina", "columbia"),
        //ANTARCTICA("", "", ""),
        AFRICA("egypt", "aomalia", "ghana"),
        EUROPE("france", "england", "italy"),
        ASIA("israel", "japan", "india");
        //AUSTRALIA("англійська", "English", ""),
        private final String country1;
        private final String country2;
        private final String country3;

        Continent(String country1, String country2, String country3) {
            this.country1 = country1;
            this.country2 = country2;
            this.country3 = country3;
        }

        public String getCountry1() {
            return country1;
        }

        public String getCountry2() {
            return country2;
        }

        public String getCountry3() {
            return country3;
        }
    }


    public static void main(String[] args) throws IOException {
        System.out.println("Task 1");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        int num3 = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        if (num1%2==0){
            count++;
        }
        if (num2%2==0){
            count++;
        }
        if (num3%2==0){
            count++;
        }

        System.out.println("Odd number: "+count);

        System.out.println("Task 2");
        int day = Integer.parseInt(bufferedReader.readLine());
        switch (day) {
            case 1:
                System.out.println("Понеділок");
                System.out.println("Monday");
                System.out.println("Le lundi");
                break;

            case 2:
                System.out.println("Вівторок");
                System.out.println("Tuesday");
                System.out.println("Mardi");
                break;

            case 3:
                System.out.println("Середа");
                System.out.println("Wednesday");
                System.out.println("Le mercredi");
                break;

            case 4:
                System.out.println("Четвер");
                System.out.println("Thursday");
                System.out.println("Jeudi");
                break;

            case 5:
                System.out.println("П\'ятниця");
                System.out.println("Friday");
                System.out.println("Vendredi");
                break;

            case 6:
                System.out.println("Субота");
                System.out.println("Saturday");
                System.out.println("Samedi");
                break;

            case 7:
                System.out.println("Неділя");
                System.out.println("Sunday");
                System.out.println("Le dimanche");
                break;

                default:
                    System.out.println("None");
                    break;
        }
        System.out.println("Task 3");
        String country1 = bufferedReader.readLine().toLowerCase();
        //String country2 = bufferedReader.readLine();
        //String country3 = bufferedReader.readLine();

        Continent continent1 = Continent.AFRICA;
        Continent continent2 = Continent.ASIA;
        Continent continent3 = Continent.EUROPE;
        Continent continent4 = Continent.NORTH_AMERICA;
        Continent continent5 = Continent.SOUTH_AMERICA;

        if (country1.equals(continent1.getCountry1()) || country1.equals(continent1.getCountry2()) || country1.equals(continent1.getCountry3())){
            System.out.println("It situated in "+continent1);
        }
        if (continent2.getCountry1().equals(country1) || continent2.getCountry2().equals(country1) || continent2.getCountry3().equals(country1)){
            System.out.println("It situated in "+continent2);
        }
        if (continent3.getCountry1().equals(country1) || continent3.getCountry2().equals(country1) || continent3.getCountry3().equals(country1)){
            System.out.println("It situated in "+continent3);
        }
        if (continent4.getCountry1().equals(country1) || continent4.getCountry2().equals(country1) || continent4.getCountry3().equals(country1)){
            System.out.println("It situated in "+continent4);
        }
        if (continent5.getCountry1().equals(country1) || continent5.getCountry2().equals(country1) || continent5.getCountry3().equals(country1)){
            System.out.println("It situated in "+continent5);
        }


    }
}