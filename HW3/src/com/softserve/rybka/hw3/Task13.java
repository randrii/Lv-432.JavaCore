package com.softserve.rybka.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {

    public enum HTTPError {
        e400("Bad_Request"),
        e401("Unauthorized"),
        e402("Payment_Required"),
        e403("Forbidden"),
        e404 ("Not_Found"),
        e405("Method_Not_Allowed"),
        e406("Not_Acceptable"),
        e407("Proxy_Authentication_Required"),
        e408("Request_Timeout"),
        e409("Conflict"),
        e410("Gone"),
        e411("Length_Required"),
        e412 ("Precondition_Failed"),
        e413("Payload_Too_Large"),
        e414("URI_Too_Long"),
        e415("Unsupported_Media_Type"),
        e416("Range_Not_Satisfiable"),
        e417("Expectation_Failed"),
        e421("Misdirected_Request"),
        e451("Unavailable_For_Legal_Reasons");

        private String err;

        HTTPError(String  error) {
            this.err = error;
        }

        public String getErr() {
            return err;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Task 1");
        float fnum1 = Float.parseFloat(bufferedReader.readLine());
        float fnum2 = Float.parseFloat(bufferedReader.readLine());
        float fnum3 = Float.parseFloat(bufferedReader.readLine());

        System.out.println(fnum1+" in range [-5;5]: "+belongRange(fnum1));
        System.out.println(fnum2+" in range [-5;5]: "+belongRange(fnum2));
        System.out.println(fnum3+" in range [-5;5]: "+belongRange(fnum3));

        System.out.println("Task 2");
        int inum1 = Integer.parseInt(bufferedReader.readLine());
        int inum2 = Integer.parseInt(bufferedReader.readLine());
        int inum3 = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Min: "+Math.min(inum1, Math.min(inum2, inum3))+"\n"+"Max: "+Math.max(inum1, Math.max(inum2, inum3)));

        System.out.println("Task 3");
        String errno = bufferedReader.readLine();
        HTTPError err = HTTPError.valueOf("e"+errno);

        System.out.println("Error description: "+err.getErr());
    }

    private static boolean belongRange(float f){
        return  (f >= -5 && f <= 5);
    }

}
