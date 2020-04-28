package by.htp.homework.seventh.task08;


import java.io.Serializable;
import java.util.ArrayList;

import by.htp.homework.seventh.task08.Customer;

public class Shop implements Serializable {
	
	private ArrayList <Customer> base = new ArrayList <Customer>(2);
		
	public Shop() {};

	public Shop(ArrayList<Customer> base) {
		this.base = base;
	}
	
	public ArrayList<Customer> getBase() {
		return base;
	}

	public void setBase(ArrayList<Customer> base) {
		this.base = base;
	}

    @Override
    public String toString() {
        return this.getClass().getName() + "[base=" + base + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((base == null) ? 0 : base.hashCode());
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
        Shop other = (Shop) obj;
        if (base == null) {
            if (other.base != null)
                return false;
        } else if (!base.equals(other.base))
            return false;
        return true;
    }
	
    
	
}
