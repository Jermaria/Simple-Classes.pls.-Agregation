package by.htp.homework.eighth.task02.bean;

import java.io.Serializable;

public class Engine implements Serializable {
    
    private double volume;
    private int power;
    private double consumption;
    
    public Engine() {}

    public Engine(double volume, int power, double consumption) {
        super();
        this.volume = volume;
        this.power = power;
        this.consumption = consumption;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[volume=" + volume + ", power=" + power + ", consumption=" + consumption + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(consumption);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + power;
        temp = Double.doubleToLongBits(volume);
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
        Engine other = (Engine) obj;
        if (Double.doubleToLongBits(consumption) != Double.doubleToLongBits(other.consumption))
            return false;
        if (power != other.power)
            return false;
        if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
            return false;
        return true;
    }

    
}
