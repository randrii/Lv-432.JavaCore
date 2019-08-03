package com.softserve.rybka.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class callRate {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input a call rate from three countries");
        int c1 = Integer.parseInt(bufferedReader.readLine());
        int c2 = Integer.parseInt(bufferedReader.readLine());
        int c3 = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Input how much minutes from these countries gone out");
        int t1 = Integer.parseInt(bufferedReader.readLine());
        int t2 = Integer.parseInt(bufferedReader.readLine());
        int t3 = Integer.parseInt(bufferedReader.readLine());

        int res1 = c1*t1;
        int res2 = c2*t2;
        int res3 = c3*t3;

        System.out.println("From the first country it will cost "+res1);
        System.out.println("From the second country it will cost "+res2);
        System.out.println("From the third country it will cost "+res3);

        System.out.println("All together will be cost "+(res1+res2+res3));

    }
}
