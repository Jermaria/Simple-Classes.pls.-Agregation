package by.htp.homework.ninth.task03.bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Calendar implements Serializable {
    
    private List<DayOff> daysOff = new ArrayList<DayOff>();
    
    
    public Calendar() {}
     
    public Calendar(List<DayOff> daysOff) {
        this.daysOff = daysOff;
    }

    public List<DayOff> getDaysOff() {
        return daysOff;
    }

    public void setDaysOff(List<DayOff> daysOff) {
        this.daysOff = daysOff;
    }

    @Override
    public String toString() {
        return "Calendar [daysOff=" + daysOff + "]";
    }







    public class DayOff implements Serializable {
        
        private LocalDate date;
        private String comment;
  
        public DayOff() {}

        public DayOff(LocalDate date, String comment) {
            super();
            this.date = date;
            this.comment = comment;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
        
        


        
        


    }
    
    public class Weekend extends DayOff implements Serializable {
        
        private WeekendDay dayName;
        
        public Weekend() {}

        public Weekend(LocalDate date, WeekendDay dayName) {
            
            super(date, dayName.toString());
            this.dayName = dayName;       
        }

        public WeekendDay getDayName() {
            return dayName;
        }

        public void setDayName(WeekendDay dayName) {
            this.dayName = dayName;
        }
        
        
        
        

        
        
        
        
        
    }
    
    public class Holiday extends DayOff implements Serializable {
        
        private String holidayName;
        
        public Holiday() {}

        public Holiday(LocalDate date, String holidayName) {
            super(date, holidayName);
            this.holidayName = holidayName;
        }
        
        
        
        

       
        
        
    }
}
