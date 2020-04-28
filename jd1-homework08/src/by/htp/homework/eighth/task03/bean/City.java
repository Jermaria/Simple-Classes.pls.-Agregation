package by.htp.homework.eighth.task03.bean;

import java.io.Serializable;

public class City implements Serializable {
    
    private String name;
    private int population;
    private double area;
    private int yearOfFoundation;
    
    public City() {}

    public City(String name, int population, double area, int yearOfFoundation) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[name=" + name + ", population=" + population + ", area=" + area + ", yearOfFoundation="
                + yearOfFoundation + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(area);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + population;
        result = prime * result + yearOfFoundation;
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
        City other = (City) obj;
        if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (population != other.population)
            return false;
        if (yearOfFoundation != other.yearOfFoundation)
            return false;
        return true;
    }
    
    

}
