public class AccountSpecial extends Account{
    public AccountSpecial(int accountID, double balance){
        super();
    }

    public void executeOperation(Operation operation) {
        if(operation.getOperationType()=="prelievo"){
            super.balance = balance - operation.getAmount();
        } else if(operation.getOperationType()=="versamento"){
            balance = balance + operation.getAmount();
        } else {
            System.out.println("Operazione non presente");
        }
    }
}
