package InsuranceManagementSystem;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    private static int productAccountIdCounter = 1;

    public static void main(String[] args) {

        AccountManager accountManager = new AccountManager();

        //Örnek bireysel ve kurumsal hesaplar.
        IndividualAccount individualAccount = new IndividualAccount(productAccountIdCounter, new User("Bawer", "Yurtdaş",
                "baweryurtdas@gmail.com", "123456", "SoftwareDeveloper", 27, null, null));
        EnterpriseAccount enterpriseAccount = new EnterpriseAccount(productAccountIdCounter++, new User("John", "Doe",
                "johndoe@example.com", "13257", "Development", 25, null, null));

        //Hesapları AccountManager'e ekleme.
        accountManager.addAccount(individualAccount);
        accountManager.addAccount(enterpriseAccount);

        //Login işlemi.

        Account loggedInAccount = accountManager.login("johndoe@example.com", "13257");
        if (loggedInAccount != null) {
            System.out.println("Login successfull.");
            loggedInAccount.showUserInfo();

        } else {
            System.out.println("Login failed.");
        }


    }
}
