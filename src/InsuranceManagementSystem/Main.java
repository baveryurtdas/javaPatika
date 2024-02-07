package InsuranceManagementSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static int productAccountIdCounter = 1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Account Manager sınıfı oluşturma
        AccountManager accountManager = new AccountManager();
        //Kullanıcı kaydı oluşturma.
        System.out.print("Name : ");
        String name = scan.nextLine();

        System.out.print("Surname : ");
        String surname = scan.nextLine();

        System.out.print("Email : ");
        String email = scan.nextLine();

        System.out.print("Password : ");
        String password = scan.nextLine();

        System.out.print("Profession : ");
        String profession = scan.nextLine();

        System.out.print("Age : ");
        int age = scan.nextInt();
        scan.nextLine();

        User user = new User(name, surname, email, password, profession, age, null, null);
        Account individualAccount = new IndividualAccount(productAccountIdCounter, user);
        accountManager.addAccount(individualAccount);

        //Klavyeden alınan email ve şifre bilgisi ile giriş işlemi

        System.out.print("Login - Email : ");
        String loginEmail = scan.nextLine();

        System.out.print("Login - Password : ");
        String loginPassword = scan.nextLine();

        Account loggedInAccount = login(accountManager, loginEmail, loginPassword);
        if (loggedInAccount != null) {
            System.out.println("Login successful.");
            individualAccount.showUserInfo();
        } else {
            System.out.println("Login failed");
        }


    }

    public static Account login(AccountManager accountManager, String email, String password) {
        //Account manager sınıfında ki login metodunu çağırma
        return accountManager.login(email, password);
    }


}
