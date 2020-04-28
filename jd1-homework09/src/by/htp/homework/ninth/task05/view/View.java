package by.htp.homework.ninth.task05.view;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import by.htp.homework.ninth.task05.bean.Bouquet;
import by.htp.homework.ninth.task05.bean.Flower;
import by.htp.homework.ninth.task05.bean.Rose;
import by.htp.homework.ninth.task05.bean.Wrapping;

public class View {
    
    public void showFlower(Flower flower) {
        
        System.out.print("a " + flower.getColour() + " " + flower.getName().toLowerCase() + ", ");
    }
     
    public void showWrapping(Wrapping wrapping) {
        
        System.out.println(wrapping.getSize() + " " + wrapping.getColour() + " " + wrapping.getMaterial());
    }
    
    public void showBouquet(Bouquet bouquet) {
        
        System.out.println("The bouquet contains: ");
        
       for(Flower f : bouquet.getFlowers()) {
            
        showFlower(f);
        
  
        }
        
        System.out.print("wrapped in ");
        showWrapping(bouquet.getWrapping());
    }

}
