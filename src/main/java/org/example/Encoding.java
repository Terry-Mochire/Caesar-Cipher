package org.example;

import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Encoding {
    private   String plaintext = "";

    public void setPlaintext(String plaintext){
        this.plaintext = plaintext;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void  userInput(){
        String cipherText = "";

        try{
            System.out.print("Enter Plaintext: ");
            InputStreamReader streamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            String plaintext = bufferedReader.readLine();
            this.setPlaintext(plaintext);


        }catch ( Exception e){
            e.printStackTrace();
        }

    }
}
