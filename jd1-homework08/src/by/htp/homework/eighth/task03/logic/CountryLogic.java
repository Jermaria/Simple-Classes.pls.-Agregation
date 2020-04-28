package by.htp.homework.eighth.task03.logic;

import by.htp.homework.eighth.task03.bean.Country;

public class CountryLogic {
    
    public int countDistricts(Country country) {
        
        int num;
        
        num = country.getDistricts().size();
        
        return num;
    }
    
    

}
