package by.htp.homework.eighth.task02.bean;

import java.io.Serializable;

public class Wheel implements Serializable {
    
    private double diameter;
    private double width;
    private double maxLoad;
    private String tyre;
    
    public Wheel() {}

    public Wheel(double diameter, double width, double maxLoad, String tyre) {
        this.diameter = diameter;
        this.width = width;
        this.maxLoad = maxLoad;
        this.tyre = tyre;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        tyre = tyre;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[diameter=" + diameter + ", width=" + width + ", maxLoad=" + maxLoad + ", Tyre=" + tyre + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tyre == null) ? 0 : tyre.hashCode());
        long temp;
        temp = Double.doubleToLongBits(diameter);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maxLoad);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
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
        Wheel other = (Wheel) obj;
        if (tyre == null) {
            if (other.tyre != null)
                return false;
        } else if (!tyre.equals(other.tyre))
            return false;
        if (Double.doubleToLongBits(diameter) != Double.doubleToLongBits(other.diameter))
            return false;
        if (Double.doubleToLongBits(maxLoad) != Double.doubleToLongBits(other.maxLoad))
            return false;
        if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
            return false;
        return true;
    }
    
    
}
