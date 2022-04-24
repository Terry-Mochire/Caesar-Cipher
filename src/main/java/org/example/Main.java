package org.example;

public class Main {
    public static Encoding encoding = new Encoding();
    public static void main(String[] args) {

       encoding.setPlaintext("The path to heaven begins in Hell");
        System.out.println(encoding.getPlaintext());
        encoding.userInput();
    }
}