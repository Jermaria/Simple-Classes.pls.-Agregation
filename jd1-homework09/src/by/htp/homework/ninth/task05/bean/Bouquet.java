package by.htp.homework.ninth.task05.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bouquet implements Serializable {
    
    private List<Flower> flowers = new ArrayList<>();
    
    private Wrapping wrapping;
    
    public Bouquet() {}

    public Bouquet(List<Flower> flowers, Wrapping wrapping) {
  
        this.flowers = flowers;
        this.wrapping = wrapping;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public Wrapping getWrapping() {
        return wrapping;
    }

    public void setWrapping(Wrapping wrapping) {
        this.wrapping = wrapping;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
        result = prime * result + ((wrapping == null) ? 0 : wrapping.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bouquet other = (Bouquet) obj;
        if (flowers == null) {
            if (other.flowers != null)
                return false;
        } else if (!flowers.equals(other.flowers))
            return false;
        if (wrapping == null) {
            if (other.wrapping != null)
                return false;
        } else if (!wrapping.equals(other.wrapping))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [flowers=" + flowers + ", wrapping=" + wrapping + "]";
    }
    
    

}
