package account;
/**
 *
 * @author lukemiller
 */
public class SavingsAccount extends Account{
    
    Double rate = .01;
    
    
    public SavingsAccount(Double balance){
        super(balance);
    }
    
    public Double CalculateInterest(){
        return (getBalance()*rate);
    }
    
    
    
    
}
