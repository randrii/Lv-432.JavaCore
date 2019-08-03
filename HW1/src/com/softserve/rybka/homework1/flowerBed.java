package com.softserve.rybka.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class flowerBed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("r= ");
        int r = Integer.parseInt(br.readLine());
        double p = 2*Math.PI*r;
        System.out.printf("Perimeter: %.3f\n",p);
        double s = Math.PI * r*r;
        System.out.printf("Area: %.3f",s);
    }
}
