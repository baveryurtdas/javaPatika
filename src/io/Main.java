package io;


import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        String data = "BAWERYURTDAŞ";
        try {
            PrintWriter writer = new PrintWriter("output.txt");
            writer.print(1213123);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}