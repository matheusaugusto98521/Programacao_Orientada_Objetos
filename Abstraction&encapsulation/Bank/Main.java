package Bank;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner sName = new Scanner(System.in);
        Scanner sAccount = new Scanner(System.in);
        Scanner sAgency = new Scanner(System.in);
   
        
        System.out.println("Enter your name: ");
        String name = sName.next();
        
        System.out.println("Enter your account number: ");
        int account = sAccount.nextInt();
        
        System.out.println("Enter your agency number: ");
        int agencys = sAgency.nextInt();
        
  
        
        BankAccount client1 = new BankAccount(name, account, agencys,25000.0);
        
        client1.setAccountNumber(account);
        client1.setAgency(agencys);
        client1.setBalance(25000.0);
        double balanceD = client1.deposit(2000.0, client1.getBalance());
        double balanceW = client1.withdrawal(7000.0, balanceD);
        double balanceF = client1.balanceAvailable(balanceW);
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("| Name: " + client1.getCardholderName());
        System.out.println("| Account: " + client1.getAccountNumber());
        System.out.println("| Agency: " + client1.getAgency());
        System.out.println("| Balance: " + balanceF);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
        
        
    }
    
}
