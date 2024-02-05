package InsuranceManagementSystem;

public class EnterpriseAccount extends Account {


    public EnterpriseAccount(int accountId, User user) {
        super(accountId, user);

    }

    @Override
    public void addInsurance(Insurance insurance) {
        //Kurumsal müşteriye özgü sigorta ekleme işlemi.
        System.out.println("Enterprise Insurance Added.");
    }

    @Override
    public void calculateBalance() {

    }




}
