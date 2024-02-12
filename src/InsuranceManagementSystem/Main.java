package InsuranceManagementSystem;

import java.util.Scanner;

public class Main {
    private static int productAccountIdCounter = 1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Account Manager sınıfı oluşturma
        AccountManager accountManager = new AccountManager();
        //Kullanıcı kaydı oluşturma.
        System.out.println("Welcome Insurance Management System");
        System.out.println("Create a new account");
        Account newAccount = createAccount(scan);
        if (newAccount != null) {
            accountManager.addAccount(newAccount);

            System.out.print("Login - Email : ");
            String loginEmail = scan.nextLine();

            System.out.print("Login - Password : ");
            String loginPassword = scan.nextLine();

            Account loggedInAccount = login(accountManager, loginEmail, loginPassword);
            if (loggedInAccount != null) {
                System.out.println("Login Successful.");
                loggedInAccount.showUserInfo();
            } else {
                System.out.println("Login failed.");
            }

        } else {
            System.out.println("Account creation failed.");
        }


    }


    public static Account createAccount(Scanner scan) {

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

        char accountType;

        do {
            System.out.print("Create an Individual(I) or Enterprise (E) account : ");
            accountType = scan.nextLine().toUpperCase().charAt(0);
        } while (accountType != 'I' && accountType != 'E');

        User user = new User(name, surname, email, password, profession, age, null, null);

        switch (accountType) {
            case 'I':
                return new IndividualAccount(productAccountIdCounter, user);

            case 'E':
                return new EnterpriseAccount(productAccountIdCounter++, user);

            default:
                System.out.println("Invalid Option");
                break;

        }
        return null;
    }

    public static Account login(AccountManager accountManager, String email, String password) {
        //Account manager sınıfında ki login metodunu çağırma
        return accountManager.login(email, password);
    }


}
