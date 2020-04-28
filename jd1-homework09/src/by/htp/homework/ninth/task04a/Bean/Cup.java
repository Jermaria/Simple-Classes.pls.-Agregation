package by.htp.homework.ninth.task04a.bean;

import java.io.Serializable;

public class Cup extends Treasure implements Serializable {
    
    public Cup () {}
    
    public Cup (String name, double price, String description) {
        super.setName(name);
        super.setPrice(price);
        super.setDescription(description);
        super.setTreasureType(this.getClass().getName());
    }

}
