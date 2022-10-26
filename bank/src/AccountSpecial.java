public class AccountSpecial extends Account{
    public AccountSpecial(int accountID, double balance){
        super(accountID,balance);
    }

    public void executeOperation(Operation operation) {
        operation.setAmount(operation.getAmount()-2);
        super.executeOperation(operation);
    }
}
