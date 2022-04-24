package org.example;

import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Encoding {
    public static void main(String[] args) {
       try {
           System.out.println("Enter Plaintext: ");
           InputStreamReader streamReader = new InputStreamReader(System.in);
           BufferedReader bufferedReader = new BufferedReader(streamReader);
           String plaintext = bufferedReader.readLine();
           System.out.print("Your plaintext is " + plaintext);
       } catch ( Exception e){
           e.printStackTrace();
       }

    }
}
