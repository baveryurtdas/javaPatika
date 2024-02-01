package InsuranceManagementSystem;

public class EnterpriseAccount extends Account {
    private String businessName;

    public EnterpriseAccount(int accountId, User user, String businessName) {
        super(accountId, user);
        this.businessName = businessName;
    }

    @Override
    public void calculateBalance() {

    }

}
