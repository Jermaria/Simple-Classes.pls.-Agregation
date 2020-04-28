package by.htp.homework.ninth.task05.bean;

import java.io.Serializable;

public class Cornflower extends Flower implements Serializable {
    
    public Cornflower() {}
    
    public Cornflower(String colour ) {
        
        super.setName(this.getClass().getSimpleName());
        super.setColour(colour);
    }


}
