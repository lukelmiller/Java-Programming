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
public class NewAccount {
    public static void main(String[] args) {
        SavingsAccount a1 = new SavingsAccount(2000.0);
        CheckingAccount a2 = new CheckingAccount(200.0);
        a2.Debit(200.0);
        System.out.println(a2.getBalance());
        a2.Debit(20.0);
        System.out.println(a2.getBalance());
        System.out.println(a1.CalculateInterest());
        a1.Credit(a1.CalculateInterest());
        System.out.println(a1.getBalance());
        
    }
}
