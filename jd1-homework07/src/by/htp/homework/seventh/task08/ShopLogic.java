package by.htp.homework.seventh.task08;

import java.util.ArrayList;

public class ShopLogic {
    
    public void addCustomer(Shop base, Customer client) {
        
        base.getBase().add(client);
    }
    
    public void sortAlphabetically(Shop base) {
        
        sortBySurname(base);
        sortByName(base);
        sortByPatronimic(base);
    }
    
    public void sortBySurname(Shop base) {
        
        for (int i = 0; i < base.getBase().size() - 1; i++) {
            for (int j = i + 1; j < base.getBase().size(); j++) {
                
                if(base.getBase().get(i).getSurname().compareTo(base.getBase().get(j).getSurname()) > 0) {
                    
                    Customer temp;
                    
                    temp = base.getBase().get(i);
                    base.getBase().set(i, base.getBase().get(j));
                    base.getBase().set(j, temp);
                }
            }
        }
    }
    
    public void sortByName(Shop base) {
        
        for (int i = 0; i < base.getBase().size() - 1; i++) {
            
            if (base.getBase().get(i).getSurname().equals(base.getBase().get(i+1).getSurname())) {
                
                int start;
                start = i;
                
                int j;
                j = i + 1;
                
                while ((j < base.getBase().size()) && (base.getBase().get(i).getSurname().equals(base.getBase().get(j).getSurname()))) {
                    j++;
                }
                
                if ( j - 1 > i) {
                    
                    int finish;
                    finish = j - 1;
                    
                    sortNamesWithin(base, start, finish);
                }   
            }
        }
    }
    
    public void sortByPatronimic(Shop base) {
        
        for (int i = 0; i < base.getBase().size() - 1; i++) {
            
            if ((base.getBase().get(i).getSurname().equals(base.getBase().get(i+1).getSurname())) && (base.getBase().get(i).getName().equals(base.getBase().get(i+1).getName()))) {
                
                int start;
                start = i;
                
                int j;
                j = i + 1;
                
                while ((j < base.getBase().size()) && (base.getBase().get(i).getSurname().equals(base.getBase().get(j).getSurname()))
                            && (base.getBase().get(i).getName().equals(base.getBase().get(i+1).getName()))) {
                    j++;
                }
                
                if ( j - 1 > i) {
                    
                    int finish;
                    finish = j - 1;
                    
                    sortPatronimicWithin(base, start, finish);
                }   
            }
        }
    }
    
    public void sortNamesWithin(Shop base, int start, int finish) {
        
        for (int i = start; i < finish; i++) {
            
            for (int j = i + 1; j > i; j--) {
                
                if (base.getBase().get(i).getName().compareTo(base.getBase().get(j).getName()) > 0) {
                
                Customer temp;
                
                temp = base.getBase().get(i);
                base.getBase().set(i, base.getBase().get(j));
                base.getBase().set(j, temp);
                }
            }       
        }
    }
    
    public void sortPatronimicWithin(Shop base, int start, int finish) {
        
        for (int i = start; i < finish; i++) {
            
            for (int j = i + 1; j > i; j--) {
                
                if (base.getBase().get(i).getPatronimic().compareTo(base.getBase().get(j).getPatronimic()) > 0) {
                
                Customer temp;
                
                temp = base.getBase().get(i);
                base.getBase().set(i, base.getBase().get(j));
                base.getBase().set(j, temp);
                }
            }       
        }
    }
    
    public ArrayList <Customer> findCardsLocatedWithin(Shop base, String start, String finish) {
        
        ArrayList<Customer> found = new ArrayList <Customer>(1);
        
        for (int i = 0; i < base.getBase().size(); i++) {
            
            if (base.getBase().get(i).getCreditCardNum().compareTo(start) >= 0 && base.getBase().get(i).getCreditCardNum().compareTo(finish) <= 0) {
                found.add(base.getBase().get(i));
            }
        }
        
        return found;
    }

}
