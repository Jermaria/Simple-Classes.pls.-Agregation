package by.htp.homework.ninth.task04a.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DragonCave implements Serializable {
    
    List<Treasure> treasures = new ArrayList<Treasure>();
    
    public DragonCave() {}

    public DragonCave(List<Treasure> treasures) {

        this.treasures = treasures;
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((treasures == null) ? 0 : treasures.hashCode());
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
        DragonCave other = (DragonCave) obj;
        if (treasures == null) {
            if (other.treasures != null)
                return false;
        } else if (!treasures.equals(other.treasures))
            return false;
        return true;
    }

    @Override
    public String toString() {
       
        return this.getClass().getName() + "[treasures=" + treasures + "]";
    }

}
