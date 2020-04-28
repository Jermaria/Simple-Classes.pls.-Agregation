package by.htp.homework.eighth.task03.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Country implements Serializable {
    
    private String name;
    private City capital;
    private List<District>districts = new ArrayList<District>();
    private double area;
    
    public Country() {}

    public Country(String name, City capital, List<District> districts, double area) {
        super();
        this.name = name;
        this.capital = capital;
        this.districts = districts;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[name=" + name + ", capital=" + capital + ", districts=" + districts + ", area=" + area + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(area);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((capital == null) ? 0 : capital.hashCode());
        result = prime * result + ((districts == null) ? 0 : districts.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Country other = (Country) obj;
        if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
            return false;
        if (capital == null) {
            if (other.capital != null)
                return false;
        } else if (!capital.equals(other.capital))
            return false;
        if (districts == null) {
            if (other.districts != null)
                return false;
        } else if (!districts.equals(other.districts))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
    

}
