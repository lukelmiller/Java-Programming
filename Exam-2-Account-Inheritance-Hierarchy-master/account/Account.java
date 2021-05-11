
package account;

/**
 *
 * @author lukemiller
 */
public class Account {
    private Double balance;

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    
    
    public Double getBalance() {
        return balance;
    }
    
    Account(Double balance){
        
        this.balance = balance;
    }
    
    public void Credit(Double add){
        balance+=add;
    }
    public void Debit(Double sub){
        if(sub>=balance){
            System.out.println("Debit amount exceeded account balance");
        }else{
            balance-=sub;
        }
        
    }
    
    
    
}
