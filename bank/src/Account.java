import java.util.List;
public class Account {

    // ISTANCE VARIABLES
    private int accountID;
    private double balance;
    private List<Operation> operations;

    // CONSTRUCTOR
    public Account(int accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    // toString
    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", balance=" + balance +
                ", operations=" + operations +
                '}';
    }

    // GETTERS && SETTERS
    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public void executeOperation(Operation operation) {
        if(operation.getOperationType()=="prelievo"){
            balance = balance - operation.getAmount();
        } else if(operation.getOperationType()=="versamento"){
            balance = balance + operation.getAmount();
        } else {
            System.out.println("Operazione non presente");
        }
    }
}