package InsuranceManagementSystem;

import generic.A;

import java.util.ArrayList;

public class InsuranceManager {
    private ArrayList<Insurance> insuranceList;

    public InsuranceManager() {
        this.insuranceList = new ArrayList<>();
    }

    public void addInsurance(Account account, Insurance insurance) {
        if (checkAuthentication(account)) {
            if (insurance != null) {
                account.addInsurance(insurance);
                insuranceList.add(insurance);
                System.out.println("Insurance added successfully.");
            } else {
                System.out.println("Invalid insurance.");
            }
        } else {
            System.out.println("Authentication failed. Cannot add insurance.");
        }
    }

    public void removeInsurance(Account account, Insurance insurance) {
        if (checkAuthentication(account)) {
            if (insurance != null) {
                account.removeInsurance(insurance);
                insuranceList.remove(insurance);
                System.out.println("Insurance removed successfully");

            } else {
                System.out.println("Invalid insurance");
            }
        } else {
            System.out.println("Authentication failed. Cannot add insurance.");
        }
    }


    private boolean checkAuthentication(Account account) {
        return account != null && account.getAuthenticationStatus() == AuthenticationStatus.SUCCESS;
    }
}
