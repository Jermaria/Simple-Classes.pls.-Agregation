package by.htp.homework.eighth.task04.bean;

public class Account implements Comparable <Account> {
    
    private int accountNumber;
    private String status;
    private double sum;
    
    public Account() {}

    public Account(int accountNumber, String status, double sum) {
        super();
        this.accountNumber = accountNumber;
        this.status = status;
        this.sum = sum;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[accountNumber=" + accountNumber + ", status=" + status + ", sum=" + sum + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + accountNumber;
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        long temp;
        temp = Double.doubleToLongBits(sum);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Account other = (Account) obj;
        if (accountNumber != other.accountNumber)
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (Double.doubleToLongBits(sum) != Double.doubleToLongBits(other.sum))
            return false;
        return true;
    }

    @Override
    public int compareTo(Account acc) {
        if (this.sum > acc.getSum()) {
            return 1;
        } else if (this.sum < acc.getSum()) {
            return -1;
        } else {
             return 0;
        } 
    }   

}
