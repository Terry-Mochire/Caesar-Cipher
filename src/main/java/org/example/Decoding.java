package org.example;

public class Decoding {
    public static Encoding encoding = new Encoding();
    private String userText;

    public void decipher(String userText) {
        this.userText = encoding.getPlaintext();
        System.out.println("Decrypted String: " + userText);
    }
}
