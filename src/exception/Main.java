package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void checkAge(int age) throws AgeCheckException {
        if (age < 18) {
            throw new AgeCheckException("Yaş hatası yakalandı.");
        }

        System.out.println("Yaşı uygundur.");
    }

    public static void main(String[] args) throws AgeCheckException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz : ");
        int age = scan.nextInt();


        try {
            checkAge(age);
        }catch (AgeCheckException e){
            System.out.println(e.toString());
        }


        System.out.println("Program bitti");
    }
}
