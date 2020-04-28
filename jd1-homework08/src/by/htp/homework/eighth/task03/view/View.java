package by.htp.homework.eighth.task03.view;

import by.htp.homework.eighth.task03.bean.Country;
import by.htp.homework.eighth.task03.bean.District;

public class View {
    
    public void showCapital(Country country) {
        System.out.println(country.getCapital());
    }
    
    public void showNumberOfDistricts(int num) {
        
        System.out.println(num + " districts");
    }
    
    public void showArea(Country country) {
        System.out.println("The area is " + country.getArea());
    }
    
    public void ShowDistrictCenters(Country country) {
        
        for(District distr : country.getDistricts()) {
            System.out.print(distr.getDistrictCentre() + "; ");
        }
    }
    

}
