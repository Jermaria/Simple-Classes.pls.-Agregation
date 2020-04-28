package by.htp.homework.ninth.task03.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.homework.ninth.task03.bean.Calendar;
import by.htp.homework.ninth.task03.bean.WeekendDay;

public class CalendarLogic {
    
    public boolean isAWeekend(Calendar.DayOff day) {
        
        if (day.getComment() == WeekendDay.SATURDAY.toString() 
                || day.getComment() == WeekendDay.SUNDAY.toString()) {       
            return true;
        } 
        
        return false;
    }
    
    public boolean isAHoliday(Calendar.DayOff day) {
        
        if (day.getComment() != null || isAWeekend(day) == false) {       
            return true;
        } 
        
        return false;
    }
    
    public List<Calendar.DayOff> findHolidays(List<Calendar.DayOff> list) {
        
        List<Calendar.DayOff> holidays = new ArrayList<Calendar.DayOff>();
        
        for (Calendar.DayOff day : list) {
            
            if (day.getComment() != null || isAWeekend(day) == false) {
                holidays.add(day);
            }
        }
        
        return holidays;
    }
    
    public List<Calendar.DayOff> findWeekends(List<Calendar.DayOff> list) {
        
        List<Calendar.DayOff> weekends = new ArrayList<Calendar.DayOff>();
        
        for (Calendar.DayOff day : list) {
            
            if(isAWeekend(day)) {
                
                weekends.add(day);
            }
        }
        
        return weekends;
    }
    
    
    


}
