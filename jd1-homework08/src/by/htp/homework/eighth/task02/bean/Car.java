package by.htp.homework.eighth.task02.bean;

import java.io.Serializable;
import java.util.Arrays;

public class Car implements Serializable {
    
    private Engine carEngine;
    private Wheel[] carWheels;
    private double speed;
    private double fuel;
    private double tankVolume;
    private String made;
    
    public Car() {}

    public Car(Engine carEngine, Wheel[] carWheels, double speed, double fuel, double tankVolume, String made) {
        this.carEngine = carEngine;
        this.carWheels = carWheels;
        this.speed = speed;
        this.fuel = fuel;
        this.tankVolume = tankVolume;
        this.made = made;
    }

    public Engine getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(Engine carEngine) {
        this.carEngine = carEngine;
    }

    public Wheel[] getCarWheels() {
        return carWheels;
    }

    public void setCarWheels(Wheel[] carWheels) {
        this.carWheels = carWheels;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[carEngine=" + carEngine + ", carWheels=" + Arrays.toString(carWheels) + ", speed=" + speed
                + ", fuel=" + fuel + ", tankVolume=" + tankVolume + ", made=" + made + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((carEngine == null) ? 0 : carEngine.hashCode());
        result = prime * result + Arrays.hashCode(carWheels);
        long temp;
        temp = Double.doubleToLongBits(fuel);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((made == null) ? 0 : made.hashCode());
        temp = Double.doubleToLongBits(speed);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tankVolume);
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
        Car other = (Car) obj;
        if (carEngine == null) {
            if (other.carEngine != null)
                return false;
        } else if (!carEngine.equals(other.carEngine))
            return false;
        if (!Arrays.equals(carWheels, other.carWheels))
            return false;
        if (Double.doubleToLongBits(fuel) != Double.doubleToLongBits(other.fuel))
            return false;
        if (made == null) {
            if (other.made != null)
                return false;
        } else if (!made.equals(other.made))
            return false;
        if (Double.doubleToLongBits(speed) != Double.doubleToLongBits(other.speed))
            return false;
        if (Double.doubleToLongBits(tankVolume) != Double.doubleToLongBits(other.tankVolume))
            return false;
        return true;
    }

    
}
