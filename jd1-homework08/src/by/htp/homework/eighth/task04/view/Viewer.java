package by.htp.homework.eighth.task04.view;

import java.util.List;

import by.htp.homework.eighth.task04.bean.Account;

public class Viewer {
    
    public void viewAccount(Account acc) {
        
        if (acc != null) {
            
            if (acc.getStatus() == "active") {
            
                System.out.println("Number: " + acc.getAccountNumber() + " sum " + acc.getSum());
                
            } else {
                
                System.out.println("You've been blocked. Please, call the technical support");
            }
            
        } else {
            
            System.out.println("No account found");
        }
    }
    
    public void viewAccounts(List<Account> accounts) {
        
        for (Account acc : accounts) {
            viewAccount(acc);
        }
        
    }

}
