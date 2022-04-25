package org.example;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import  java.util.List;
public class Encoding {
    private String userText = "";

    public String setPlaintext(String plaintext){
        this.userText = plaintext.toUpperCase();
        return this.userText;
    }

    public String getPlaintext() {
        return userText;
    }

    private Integer cipherKey;

    private String cipherText = "";
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
                "V","W","X","Y","Z", " "
        };

        List<String> myList = new ArrayList<String>(List.of(alphabets));
        this.setPlaintext(userText);

        for (int i =0; i < this.getPlaintext().length(); i++){
            Character myLetter = this.getPlaintext().charAt(i);
            String cipherLetter = "";
            if ( myLetter == ' ' ) {
                cipherLetter = " ";
            }else {
                Integer currentIndex = myList.indexOf(myLetter.toString());
                Integer cipherKey = (currentIndex + this.cipherKey) % 26;
                cipherLetter = myList.get(cipherKey);
            }
            this.cipherText = this.cipherText + "" + cipherLetter;
        }
        return this.cipherText;
    }

}
