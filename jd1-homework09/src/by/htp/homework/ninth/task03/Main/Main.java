package by.htp.homework.ninth.task03.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import by.htp.homework.ninth.task03.bean.Calendar;
import by.htp.homework.ninth.task03.bean.WeekendDay;
import by.htp.homework.ninth.task03.logic.CalendarLogic;
import by.htp.homework.ninth.task03.view.View;

public class Main {
    
    public static void main(String[] args) {
    
    Calendar offWorkCalendar = new Calendar();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    
    Calendar.Weekend testWeekend = new Calendar().new Weekend(LocalDate.parse("26.04.2020", formatter), WeekendDay.SUNDAY);
    Calendar.Holiday testHoliday = new Calendar().new Holiday(LocalDate.parse("25.01.2020", formatter), "Christmas");
    
    offWorkCalendar.getDaysOff().add(testHoliday);
    offWorkCalendar.getDaysOff().add(testWeekend);
    
    CalendarLogic logic = new CalendarLogic();
    View view = new View();
    
    List <Calendar.DayOff> weekends = logic.findWeekends(offWorkCalendar.getDaysOff());
    
    view.showDaysOff(weekends);
    
    }

}
