package Bank;


public class BankAccount {
    private String cardholderName;
    private int accountNumber;
    private int agency;
    private double balance;
    
    public BankAccount(String cardholderName, int accountNumber, int agency, double balance){
        this.cardholderName = cardholderName;
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.balance = balance;
    }
    
    public double deposit(double valueDeposit, double balance){
        
        if((valueDeposit <= 0) && (agency == 0 || accountNumber == 0)){
            System.out.println(" >>> Data invalid for deposit <<<");
        }
        else{
            System.out.println("The amount of U$ " + valueDeposit + " has been deposited in your account");
            
        }
        double balancedeposit = balance + valueDeposit;  
        return balancedeposit;
    }
    
    public double withdrawal(double valueWithdrawal, double balancedeposit){
        if((valueWithdrawal <= 0) && (agency == 0 || accountNumber == 0)){
            System.out.println(" >>> Data invalid for withdrawal <<<");
        }
        else{
            if(balancedeposit < valueWithdrawal){
                System.out.println(">>> Insuficient balance <<<");
            }
            else{
                System.out.println("the amount of U$ " + valueWithdrawal + " was withdrawn from your account");
            }
        }
        
        
        double balancefinal = balancedeposit - valueWithdrawal;
        return balancefinal;
    }
    
    public double balanceAvailable(double balancefinal){
        return balancefinal;
    }
    
    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
