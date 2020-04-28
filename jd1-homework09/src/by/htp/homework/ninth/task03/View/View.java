package by.htp.homework.ninth.task03.view;

import java.util.List;

import by.htp.homework.ninth.task03.bean.Calendar;

public class View {
    
    public void showDayOff(Calendar.DayOff day) {
        
        System.out.println("Day off: " + day.getComment() + " Date " + day.getDate());
    }
    
    public void showDaysOff(List<Calendar.DayOff> list) {
        
        for (Calendar.DayOff day : list) {
            
            showDayOff(day);
        }
        
    }

}
