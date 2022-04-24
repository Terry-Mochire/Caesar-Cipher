package org.example;

public class Main {
    public static Encoding encoding = new Encoding();
    public static void main(String[] args) {

        encoding.userInput();
        System.out.println("Input String: " + encoding.getPlaintext());
        System.out.println("Encrypted String: " + encoding.cipher());
    }
}