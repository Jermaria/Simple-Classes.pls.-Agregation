package by.htp.homework.eighth.task05.logic;

import java.util.ArrayList;
import java.util.Collections;

import by.htp.homework.eighth.task05.bean.Meal;
import by.htp.homework.eighth.task05.bean.Purpose;
import by.htp.homework.eighth.task05.bean.Tour;
import by.htp.homework.eighth.task05.bean.Transport;
import by.htp.homework.eighth.task05.bean.TravelAgency;

public class AgencyLogic {
    
    public ArrayList<Tour> findTourByPurpose(TravelAgency agency, Purpose p) {
        
        ArrayList<Tour> suitableTours = new ArrayList<Tour>();
        
        for (Tour t : agency.getBase()) {
            
            if (t.getPurpose() == p) {
                
                suitableTours.add(t);
            }
        }
        
        return suitableTours;
    }
    
    public ArrayList<Tour> distinguishByFacilities(TravelAgency agency, Purpose p, String destination, Transport t, Meal m, int days) {
        
        ArrayList<Tour> suitable = findTourByPurpose(agency, p);
        
        for (Tour tour : suitable) {
            
            if (tour.getDestination() != destination || tour.getVehicle() != t || tour.getMeal() != m || tour.getLengthOfStay() != days) {
                
                suitable.remove(tour);
            }
        }
        
        return suitable;
    }
    
    public void sortByDestination(TravelAgency agency) {
        
        Collections.sort(agency.getBase());
        
    }
    
    
    

}
