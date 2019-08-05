import java.util.Scanner;

import static java.lang.Math.PI;

public class Homework {
    public static void main (String [] args){
        double perimeter;
        double area;
        System.out.println("Please enter your radius");
        Scanner input_values =  new Scanner(System.in);
        int radius  = input_values.nextInt();
        perimeter = 2* radius*PI;
        area = PI*radius*radius;
        System.out.println("Our perimeter is "+ perimeter );
        System.out.println("Our area is "+ area );


    }
}
