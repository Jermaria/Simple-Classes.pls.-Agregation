package by.htp.homework.eighth.task04.bean;

import java.util.ArrayList;
import java.util.List;

public class Client {
    
    private String name;
    private String surname;
    private List<Account> accounts = new ArrayList<Account>();
    
    public Client () {}

    public Client(String name, String surname, List<Account> accounts) {
        super();
        this.name = name;
        this.surname = surname;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[name=" + name + ", surname=" + surname + ", accounts=" + accounts + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if (accounts == null) {
            if (other.accounts != null)
                return false;
        } else if (!accounts.equals(other.accounts))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (surname == null) {
            if (other.surname != null)
                return false;
        } else if (!surname.equals(other.surname))
            return false;
        return true;
    }
    
    

}
