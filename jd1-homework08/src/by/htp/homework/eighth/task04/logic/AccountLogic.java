package by.htp.homework.eighth.task04.logic;

import java.util.ArrayList;
import java.util.Collections;

import by.htp.homework.eighth.task04.bean.Account;

public class AccountLogic {

    public void blockAccount(Account acc) {
        
       acc.setStatus("blocked");
    }
    
    public void unblockAccount(Account acc) {
        
        acc.setStatus("active");
    }
    
    public void sortAccounts(ArrayList<Account> accounts) {
        
        Collections.sort(accounts);
    }
    
    public Account findAccount(ArrayList<Account> accounts, Account searchedAccount) {
        
        for (Account acc : accounts) {
           
            if (acc.getAccountNumber() == searchedAccount.getAccountNumber()) {
                
                return acc;
            }
        }

        return null;
    }
    
    public double countTotalSum(ArrayList<Account> accounts) {
        
        double totalSum;
        
        totalSum = 0;
        
        for (Account acc : accounts) {
            totalSum = totalSum + acc.getSum();
        }
        
        return totalSum;
    }
    
    public double countPositiveAccountBalance(ArrayList<Account> accounts) {
        
        double total;
        total = 0;
        
        for (Account acc : accounts) {
            
            if (acc.getSum() > 0) {
                
                total = total + acc.getSum();
            }
        }
        
        return total;
    }
    
    public double countNegativeAccountBalance(ArrayList<Account> accounts) {
        
        double total;
        total = 0;
        
        for (Account acc : accounts) {
            
            if (acc.getSum() < 0) {
                
                total = total + acc.getSum();
            }
        }
        
        return total;
    }
}
