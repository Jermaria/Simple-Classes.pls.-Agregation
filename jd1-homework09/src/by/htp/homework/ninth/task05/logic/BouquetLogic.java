package by.htp.homework.ninth.task05.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.homework.ninth.task05.bean.Bouquet;
import by.htp.homework.ninth.task05.bean.Cornflower;
import by.htp.homework.ninth.task05.bean.Flower;
import by.htp.homework.ninth.task05.bean.Rose;
import by.htp.homework.ninth.task05.bean.Tulip;
import by.htp.homework.ninth.task05.bean.Wrapping;
import by.htp.homework.ninth.task05.controller.Controller;

public class BouquetLogic {
    
    public Bouquet createBouquet(String flowersRequest, String wrappingRequest) {
        
        Bouquet newBouquet = new Bouquet();
        
        Controller controller = new Controller();
        
        if (controller.isFlowersRequestCorrect(flowersRequest) && controller.isWrappingRequestCorrect(wrappingRequest)) {
            
            newBouquet.setFlowers(pickFlowersForBouquet(flowersRequest));
            newBouquet.setWrapping(createWrapping(wrappingRequest));
        }
        
        return newBouquet;
    }
    
    public List<Flower> pickFlowersForBouquet(String flowersRequest) {
        
        List<Flower> flowersForBouquet = new ArrayList<Flower>();
        
        String[] flowerInfo = flowersRequest.split(", ");   // works
        
        for (int i = 0; i < flowerInfo.length; i++) {
            
            String[] flowerDetails;
            flowerDetails = flowerInfo[i].split(" ");
            
            int number;
            number = Integer.parseInt(flowerDetails[0]);
            
            String colour, name;
            
            colour = flowerDetails[1];
            name = flowerDetails[2];
            
            String nameSingular;
            nameSingular = name.replaceAll("s$", "");
           
            for (int j = 0; j < number; j++) {
         
                if (nameSingular.equalsIgnoreCase("rose")) {
                
                    flowersForBouquet.add(new Rose(colour));
                    
                } else if (nameSingular.equalsIgnoreCase("cornflower")) {
                    
                    flowersForBouquet.add(new Cornflower(colour));
                    
                } else {
                    
                    flowersForBouquet.add(new Tulip(colour));
                }
            }             
        }
        
        return flowersForBouquet;
    }
    
    public Wrapping createWrapping(String wrappingRequest) {
        
        String[] wrappingInfo;
        
        wrappingInfo = wrappingRequest.split(" ");
        
        String wrappingSize, wrappingColour, wrappingMaterial;
        
        wrappingSize = wrappingInfo[0];
        wrappingColour = wrappingInfo[1];
        wrappingMaterial = wrappingInfo[2];
        
        Wrapping wrapping = new Wrapping(wrappingSize, wrappingColour, wrappingMaterial);
        
        return wrapping;
    }

}
