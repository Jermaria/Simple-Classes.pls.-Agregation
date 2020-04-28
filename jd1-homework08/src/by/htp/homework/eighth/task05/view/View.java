package by.htp.homework.eighth.task05.view;

import java.util.ArrayList;

import by.htp.homework.eighth.task05.bean.Tour;

public class View {
    
    public void printTour(Tour tour) {
        
        System.out.println("Destination " + tour.getDestination() + " purpose " + tour.getPurpose()
                                + " Transport " + tour.getVehicle() + " Meal " + tour.getMeal() 
                                + " Days " + tour.getLengthOfStay() + " Price per night " + tour.getPricePerNight());
    }
    
    public void printOptions(ArrayList<Tour> tours) {
        
        for (Tour t : tours) {
            
            printTour(t);
        }
    }

}
