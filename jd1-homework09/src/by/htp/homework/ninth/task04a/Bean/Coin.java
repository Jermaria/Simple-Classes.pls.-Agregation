package by.htp.homework.ninth.task04a.bean;

import java.io.Serializable;

public class Coin extends Treasure implements Serializable {
    
    public Coin() {}
    
    public Coin (String name, double price, String description) {
        super.setName(name);
        super.setPrice(price);
        super.setDescription(description);
        super.setTreasureType(this.getClass().getName());
    }
    
    
    
    
}
