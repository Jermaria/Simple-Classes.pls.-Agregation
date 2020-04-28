package by.htp.homework.ninth.task04a.bean;

import java.io.Serializable;

public class Diamond extends Treasure implements Serializable {
    
    public Diamond() {}
    
    public Diamond (String name, double price, String description) {
        super.setName(name);
        super.setPrice(price);
        super.setDescription(description);
        super.setTreasureType(this.getClass().getName());
    }
    
    

}
