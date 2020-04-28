package by.htp.homework.eighth.task05.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TravelAgency implements Serializable {
    
    private List<Tour> base = new ArrayList<Tour>();
    
    public TravelAgency() {}

    public TravelAgency(List<Tour> base) {

        this.base = base;
    }

    public List<Tour> getBase() {
        return base;
    }

    public void setBase(List<Tour> base) {
        this.base = base;
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
        TravelAgency other = (TravelAgency) obj;
        if (base == null) {
            if (other.base != null)
                return false;
        } else if (!base.equals(other.base))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "TravelAgency [base=" + base + "]";
    }
    
    

}
