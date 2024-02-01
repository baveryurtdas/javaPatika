package InsuranceManagementSystem;

public class IndividualAccount extends Account {

    private String insuranceType;

    public IndividualAccount(int accountId, User user, String insuranceType){
        super(accountId,user);
        this.insuranceType = insuranceType;
    }

    @Override
    public void calculateBalance(){

    }
}
