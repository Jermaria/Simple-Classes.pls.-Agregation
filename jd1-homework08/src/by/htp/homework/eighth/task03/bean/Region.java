package by.htp.homework.eighth.task03.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Region implements Serializable {
    
    private String name;
    private City regionalCentre;
    private List <City> cities = new ArrayList<City>();
    private int population;
    private double area;
    
    public Region () {}

    public Region(String name, City regionalCentre, List<City> cities, int population, double area) {
        super();
        this.name = name;
        this.regionalCentre = regionalCentre;
        this.cities = cities;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getRegionalCentre() {
        return regionalCentre;
    }

    public void setRegionalCentre(City regionalCentre) {
        this.regionalCentre = regionalCentre;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[name=" + name + ", regionalCentre=" + regionalCentre + ", cities=" + cities + ", population="
                + population + ", area=" + area + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(area);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((cities == null) ? 0 : cities.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + population;
        result = prime * result + ((regionalCentre == null) ? 0 : regionalCentre.hashCode());
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
        Region other = (Region) obj;
        if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
            return false;
        if (cities == null) {
            if (other.cities != null)
                return false;
        } else if (!cities.equals(other.cities))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (population != other.population)
            return false;
        if (regionalCentre == null) {
            if (other.regionalCentre != null)
                return false;
        } else if (!regionalCentre.equals(other.regionalCentre))
            return false;
        return true;
    }
    
    

}
