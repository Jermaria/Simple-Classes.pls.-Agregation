package by.htp.homework.ninth.task04a.logic;

import by.htp.homework.ninth.task04a.bean.Coin;
import by.htp.homework.ninth.task04a.bean.Crown;
import by.htp.homework.ninth.task04a.bean.Cup;
import by.htp.homework.ninth.task04a.bean.Diamond;
import by.htp.homework.ninth.task04a.bean.Ring;
import by.htp.homework.ninth.task04a.bean.Sarcophagus;
import by.htp.homework.ninth.task04a.bean.Sword;
import by.htp.homework.ninth.task04a.bean.Treasure;

public class TreasureLogic {
    
    public Treasure createCertainTreasure(String[] s) {
        
        Treasure newTreasure;
        
        String treasureType, treasureName, treasureDescription;
        double treasurePrice;
        
        treasureType = s[0];
        treasureName = s[1];
        treasurePrice = Double.parseDouble(s[2]);
        treasureDescription = s[3];
        
        switch (treasureType) {
        
        case "Coin":
            
            newTreasure = new Coin(treasureName, treasurePrice, treasureDescription);
            break;
        
        case "Sword":
            newTreasure = new Sword(treasureName, treasurePrice, treasureDescription);
            break;
            
        case "Crown":
            newTreasure = new Crown(treasureName, treasurePrice, treasureDescription);
            break;
            
        case "Ring":
            newTreasure = new Ring(treasureName, treasurePrice, treasureDescription);
            break;
            
        case "Diamond":
            newTreasure = new Diamond(treasureName, treasurePrice, treasureDescription);
            break;
            
        case "Cup":
            newTreasure = new Cup(treasureName, treasurePrice, treasureDescription);
            break;
            
        case "Sarcophagus":
            newTreasure = new Sarcophagus(treasureName, treasurePrice, treasureDescription);
            break;
            
        default:
            newTreasure = null;
        }
        
        return newTreasure;
    }

}
