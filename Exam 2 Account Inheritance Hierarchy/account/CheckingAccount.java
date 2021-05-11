/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author lukemiller
 */
public class CheckingAccount extends Account{
    
    static Double fee = .25;
    
    public CheckingAccount(Double balance){
        super(balance);
    }
    
    
    public void Credit(Double add){
        add-=fee;
        super.Credit(add);
        
    }
    public void Debit(Double sub){
        
        sub+=fee;
        super.Debit(sub);
        
      
    }
    
    
}
