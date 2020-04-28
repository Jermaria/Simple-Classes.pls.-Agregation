package by.htp.homework.ninth.task04a.view;

import java.util.List;

import by.htp.homework.ninth.task04a.bean.Treasure;

public class TreasureView {
    
    public void showTreasure(Treasure t) {
        
        System.out.printf("%-15s %-35s %-10 %s" +  t.getTreasureType(), t.getName(), t.getPrice(), t.getDescription());

        System.out.println();
    }
    
    public void showTreasures(List<Treasure> list) {
        
        for(Treasure t : list) {
            
            showTreasure(t);
        }
    }
}
