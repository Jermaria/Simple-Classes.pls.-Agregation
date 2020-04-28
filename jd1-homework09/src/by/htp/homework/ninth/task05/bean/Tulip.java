package by.htp.homework.ninth.task05.bean;

import java.io.Serializable;

public class Tulip extends Flower implements Serializable {

    public Tulip() {}
    
    public Tulip(String colour ) {
        
        super.setName(this.getClass().getSimpleName());
        super.setColour(colour);
    }
    
}
