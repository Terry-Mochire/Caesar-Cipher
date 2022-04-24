package org.example;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import  java.util.List;
public class Encoding {
    private   String plaintext = "";

    public void setPlaintext(String plaintext){
        this.plaintext = plaintext.toUpperCase();
    }

    public String getPlaintext() {
        return plaintext;
    }

    public Integer cipherKey;

    public String cipherText = "";
    public void  userInput(){

        try{
            System.out.print("Enter Plaintext: ");
            InputStreamReader streamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            String plaintext = bufferedReader.readLine();
            this.setPlaintext(plaintext);
            System.out.println("Enter your key: ");
            String cipherKey = bufferedReader.readLine();
            this.cipherKey = Integer.parseInt(cipherKey);

        }catch ( Exception e){
            e.printStackTrace();
        }

    }

    public String cipher(){
        String[] alphabets = {
                "A","B","C","D","E","F","G",
                "H","I","J","K","L","M","N",
                "O","P","Q","R","S","T","U",
                "V","W","X","Y","Z"
        };

        List<String> myList = new ArrayList<String>(List.of(alphabets));
        this.setPlaintext(plaintext);
        System.out.println(this.cipherKey);

        for (int i =0; i < this.getPlaintext().length(); i++){
            Character myLetter = this.getPlaintext().charAt(i);
            Integer currentIndex = myList.indexOf(myLetter.toString());
            Integer cipherKey = currentIndex + this.cipherKey;
            String cipherLetter = myList.get(cipherKey);
            this.cipherText = this.cipherText +  "" + cipherLetter;
        }
        return this.cipherText;
    }

}
