package by.htp.homework.ninth.task05.bean;

import java.io.Serializable;

public class Rose extends Flower implements Serializable {
    
    public Rose() {}
    
    public Rose(String colour ) {

        super.setName(this.getClass().getSimpleName());
        super.setColour(colour);
    }

}
