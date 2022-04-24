package org.example;

public class Main {
    public static Encoding encoding = new Encoding();
    public static void main(String[] args) {

        System.out.println(encoding.getPlaintext());
        encoding.userInput();

        encoding.cipher();
    }
}