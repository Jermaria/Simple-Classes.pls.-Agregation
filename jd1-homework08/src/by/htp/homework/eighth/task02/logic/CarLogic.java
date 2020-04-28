package by.htp.homework.eighth.task02.logic;

import by.htp.homework.eighth.task02.bean.Car;
import by.htp.homework.eighth.task02.bean.Wheel;

public class CarLogic {
    
    public CarLogic() {}
    
    public void drive(Car car, double speed) {
        if ((car.getCarWheels().length == 4) && (car.getFuel() > 0)) {
            car.setSpeed(speed);
        }
    }
    
    public void fill(Car car, double fuel) {
        
        if (car.getFuel() < car.getTankVolume()) {
            double toFill = car.getTankVolume() - car.getFuel();
            
            if (fuel < toFill) {
                car.setFuel(car.getFuel() + fuel);
            } else {
                fuel = toFill;
                car.setFuel(car.getFuel() + toFill);
            }
        }
    }
    
    public void changeTyre(Car car, String tyre) {
        
        for (Wheel w : car.getCarWheels()) {
            if (w.getTyre().equals("punctured")) {
                w.setTyre(tyre);
            }
        }
    }

}
