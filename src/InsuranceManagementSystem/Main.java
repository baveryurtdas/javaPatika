package InsuranceManagementSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static int productAccountIdCounter = 1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AccountManager accountManager = new AccountManager();

        System.out.print("Adınız : ");
        String name = scan.nextLine();
        System.out.print("Soyadınız : ");
        String surname = scan.nextLine();
        System.out.print("Emailiniz : ");
        String email = scan.nextLine();
        System.out.print("Şifreniz : ");
        String password = scan.nextLine();
        System.out.print("Mesleğiniz : ");
        String profession = scan.nextLine();
        System.out.print("Yaşınız : ");
        int age = scan.nextInt();


        //Örnek bireysel ve kurumsal hesaplar.
        Account individualAccount = new IndividualAccount(productAccountIdCounter, new User(name, surname,
                email, password, profession, age, null, null));


        //Hesapları AccountManager'e ekleme.
        accountManager.addAccount(individualAccount);

        System.out.print("Login - Email : ");
        String loginEmail = scan.nextLine();
        scan.nextLine();

        System.out.print("Login - Password : ");
        String loginPassword = scan.nextLine();



        Account loggedInAccount = login(accountManager, loginEmail, loginPassword);


        //Login işlemi.
        if(loggedInAccount != null){
            System.out.println("Login successfull.");
            System.out.println("-----------------");
            individualAccount.showUserInfo();
        }else{
            System.out.println("Login failed.");
        }

    }

    public static Account login(AccountManager accountManager, String loginEmail, String loginPassword) {
        //Account Manager sınında ki login fonksiyonunu çağırma
        return accountManager.login(loginEmail, loginPassword);
    }
}
