package by.htp.homework.ninth.task05.controller;

import java.util.regex.Pattern;

import by.htp.homework.ninth.task05.bean.Bouquet;
import by.htp.homework.ninth.task05.logic.BouquetLogic;

public class Controller {
    
    public boolean isFlowersRequestCorrect(String request) {
        
        String[] flowerInfo = request.split(", ");      
        
        for (int i = 0; i < flowerInfo.length; i++) {
            
            if (!isMeetingInputRequirement(flowerInfo[i])) {
                
                return false;     
            }
            
            String[] flower;
            flower = parseString(flowerInfo[i]);
            
            String flowerColour;
            flowerColour = flower[1];
            
            if (!isAvailableColour(flowerColour)) {
                
                return false;
            }
            
            String flowerName;
            flowerName = flower[2];
            
            if (!isAvailableFlower(flowerName)) {
                
                return false;
            }
        }
        
        return true;
       
    }
    
    
    public boolean isMeetingInputRequirement(String flowerInfo) {
        
        if (Pattern.matches("\\d+\\s[a-z]+\\s[a-z]+", flowerInfo)) {
            
            return true;
        }
        
        return false;
    }
    
    public String[] parseString(String description) {
        
        String[] parsedDescription = description.split(" ");
        
        return parsedDescription;
    }
    
    public boolean isAvailableColour(String colour) {
        
        for (Colour c : Colour.values()) {
            
            if (colour.equalsIgnoreCase(c.toString())) {
                return true;
            }
        }
        
        return false;
    }
    
    public boolean isAvailableFlower(String flowerName) {
        
        String convertedName = convertToSingular(flowerName);
        
        for (Flower f : Flower.values()) {
            
            if (convertedName.equalsIgnoreCase(f.toString())) {
                return true;
            }
        }
        
        return false;
    }
    
    public String convertToSingular(String s) {
        
        String newString;
        
        newString = s.replaceAll("s$", "");
        
        return newString;
    }
    
    public boolean isWrappingRequestCorrect(String request) {
        
        String[] wrappingInfo;
        
        wrappingInfo = parseString(request);
        
        String wrappingSize;
        
        wrappingSize = wrappingInfo[0];
        
        if (!isSizeAllowable(wrappingSize)) {
            
            return false;
        }
        
        String wrappingColour;
        
        wrappingColour = wrappingInfo[1];
        
        if (!isColourAvailable(wrappingColour)) {
            
            return false;
        }
        
        String wrappingMaterial;
        
        wrappingMaterial = wrappingInfo[2];
        
        if(!isMaterialAvailable(wrappingMaterial)) {
            
            return false;
        }
        
        return true;
    }
    
    public boolean isSizeAllowable(String size) {
        
        if (!Pattern.matches("\\d+\\s*[x]\\s*\\d+", size)) {
            
            return false;
        }
        
        return true;
    }
    
    public boolean isColourAvailable(String colour) {
        
        for (Colour c : Colour.values()) {
            
            if(colour.equalsIgnoreCase(c.toString())) {
                
                return true;
            }
        }
        
        return false;
    }
    
    public boolean isMaterialAvailable(String material) {
        
        for(WrappingMaterial wm : WrappingMaterial.values()) {
            
            if (material.equalsIgnoreCase(wm.toString())) {
                
                return true;
            }
        }
        
        return false;
    }
    
    public Bouquet provideBouquet(String flowersRequest, String wrappingRequest) {
        
        BouquetLogic logic = new BouquetLogic();
        
        Bouquet b = logic.createBouquet(flowersRequest, wrappingRequest);
        
        return b;
    }

}
