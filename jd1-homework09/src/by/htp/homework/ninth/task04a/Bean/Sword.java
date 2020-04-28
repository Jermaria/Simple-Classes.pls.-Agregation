package by.htp.homework.ninth.task04a.bean;

import java.io.Serializable;

public class Sword extends Treasure implements Serializable {
    
    public Sword() {}
    
    public Sword (String name, double price, String description) {
        super.setName(name);
        super.setPrice(price);
        super.setDescription(description);
        super.setTreasureType(this.getClass().getName());
    }
    

}
