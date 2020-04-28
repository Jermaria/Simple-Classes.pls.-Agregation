package by.htp.homework.eighth.task03.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class District implements Serializable {
    
    private String name;
    private City districtCentre;
    private List<Region> regions = new ArrayList<Region>();
    private double area;
    private double population;
    
    public District() {}

    public District(String name, City districtCentre, List<Region> regions, double area, double population) {
        this.name = name;
        this.districtCentre = districtCentre;
        this.regions = regions;
        this.area = area;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getDistrictCentre() {
        return districtCentre;
    }

    public void setDistrictCentre(City districtCentre) {
        this.districtCentre = districtCentre;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[name=" + name + ", districtCentre=" + districtCentre + ", regions=" + regions + ", area="
                + area + ", population=" + population + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(area);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((districtCentre == null) ? 0 : districtCentre.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        temp = Double.doubleToLongBits(population);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
        District other = (District) obj;
        if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
            return false;
        if (districtCentre == null) {
            if (other.districtCentre != null)
                return false;
        } else if (!districtCentre.equals(other.districtCentre))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(population) != Double.doubleToLongBits(other.population))
            return false;
        if (regions == null) {
            if (other.regions != null)
                return false;
        } else if (!regions.equals(other.regions))
            return false;
        return true;
    } 
    
    

}
