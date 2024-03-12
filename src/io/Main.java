package io;

import java.io.*;
import java.nio.charset.Charset;


public class Main {
    public static void main(String[] args) {

        try {
            FileInputStream fileInput = new FileInputStream("patika.txt");
            InputStreamReader inpReader = new InputStreamReader(fileInput);

            int i = inpReader.read();
            while (i != -1){
                System.out.print((char) i);
                i = inpReader.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());        }
    }
}