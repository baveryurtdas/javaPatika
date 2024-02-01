package InsuranceManagementSystem;

public abstract class Account {
    private int accountId;
    private User user;

    public Account(int accountId, User user){
        this.accountId = accountId;
        this.user = user;
    }

    public abstract void calculateBalance();
}
