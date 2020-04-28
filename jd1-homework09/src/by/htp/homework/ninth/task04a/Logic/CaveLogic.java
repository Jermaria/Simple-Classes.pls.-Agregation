package by.htp.homework.ninth.task04a.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.htp.homework.ninth.task04a.bean.Coin;
import by.htp.homework.ninth.task04a.bean.Crown;
import by.htp.homework.ninth.task04a.bean.Cup;
import by.htp.homework.ninth.task04a.bean.Diamond;
import by.htp.homework.ninth.task04a.bean.DragonCave;
import by.htp.homework.ninth.task04a.bean.Ring;
import by.htp.homework.ninth.task04a.bean.Sword;
import by.htp.homework.ninth.task04a.bean.Treasure;

public class CaveLogic {
    
    public void fillCaveWithTreasures(DragonCave cave) {
        
        try {
            FileReader reader = new FileReader("by/htp/homework/ninth/task04a/resourse/treasures.txt");
            
            @SuppressWarnings("resource")
            Scanner scan = new Scanner(reader);
            
            while (scan.hasNextLine()) {
                
                String s;
                s = scan.nextLine();
                
                if (s.trim().length() != 0) {
                    
                    String[] treasureInfo = new String[4];
                    treasureInfo = s.split(" - ");
                    
                    TreasureLogic tl = new TreasureLogic();
                    
                    Treasure t = tl.createCertainTreasure(treasureInfo);
                    cave.getTreasures().add(t);
                    
                }
            }
            
        } catch (FileNotFoundException e) {
            
            System.out.println("File not found. Check the address");
        }
        
    }
    
   
    public Treasure findTheMostExpensive(List<Treasure> list) {
        
        double max;
        int indexOfTreasure;
        
        max = list.get(0).getPrice();
        indexOfTreasure = 0;
        
        for(Treasure t : list) {
            
            if (t.getPrice() > max) {
                
                max = t.getPrice();
                indexOfTreasure = list.indexOf(t);
            }
        }
        
        return list.get(indexOfTreasure);    
    }
    
    
    public List<Treasure> findAffordableTreasures(List<Treasure> list, double sum) {
        
        List <Treasure> affordable = new ArrayList<Treasure>();
        
        for (Treasure t : list) {
            
            if(sum - t.getPrice() >= 0) {
                
                affordable.add(t);            
                sum = sum - t.getPrice();
            }
            
            if (sum == 0) {
                break;
            }
        }
        
        return affordable;
        
    }
}
