package by.htp.homework.eighth.task05.bean;

import java.io.Serializable;

public class Tour implements Serializable, Comparable <Tour> {
    
    private String destination;
    private Purpose purpose;
    private Transport vehicle;
    private Meal meal;
    private int lengthOfStay;
    private double pricePerNight;
    
    public Tour() {}

    public Tour(String destination, Purpose purpose, Transport vehicle, Meal meal, int lengthOfStay,
            double pricePerNight) {
        super();
        this.destination = destination;
        this.purpose = purpose;
        this.vehicle = vehicle;
        this.meal = meal;
        this.lengthOfStay = lengthOfStay;
        this.pricePerNight = pricePerNight;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public Transport getVehicle() {
        return vehicle;
    }

    public void setVehicle(Transport vehicle) {
        this.vehicle = vehicle;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public int getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(int lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((destination == null) ? 0 : destination.hashCode());
        result = prime * result + lengthOfStay;
        result = prime * result + ((meal == null) ? 0 : meal.hashCode());
        long temp;
        temp = Double.doubleToLongBits(pricePerNight);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((purpose == null) ? 0 : purpose.hashCode());
        result = prime * result + ((vehicle == null) ? 0 : vehicle.hashCode());
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
        Tour other = (Tour) obj;
        if (destination == null) {
            if (other.destination != null)
                return false;
        } else if (!destination.equals(other.destination))
            return false;
        if (lengthOfStay != other.lengthOfStay)
            return false;
        if (meal != other.meal)
            return false;
        if (Double.doubleToLongBits(pricePerNight) != Double.doubleToLongBits(other.pricePerNight))
            return false;
        if (purpose != other.purpose)
            return false;
        if (vehicle != other.vehicle)
            return false;
        return true;
    }

    @Override
    public int compareTo(Tour o) {
        
        if (this.destination.compareTo(o.getDestination()) > 1) {
            return 1;
        } else if (this.destination.compareTo(o.getDestination()) < 1) {
            return -1;
        } else {
            return 0;
        }
        
    }
    
}