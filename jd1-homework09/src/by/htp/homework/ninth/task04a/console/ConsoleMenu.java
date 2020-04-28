package by.htp.homework.ninth.task04a.console;

import by.htp.homework.ninth.task04a.bean.DragonCave;
import by.htp.homework.ninth.task04a.logic.CaveLogic;
import by.htp.homework.ninth.task04a.logic.TreasureLogic;
import by.htp.homework.ninth.task04a.view.MenuView;
import by.htp.homework.ninth.task04a.view.TreasureView;

public class ConsoleMenu {
    
    public void execute() {
        
        DragonCave cave = new DragonCave();
        
        CaveLogic cl = new CaveLogic();
        TreasureLogic tl = new TreasureLogic();
        TreasureView tw = new TreasureView();
        MenuView mv = new MenuView();
        
        cl.fillCaveWithTreasures(cave);
        
        int command;
        
        do {        

            command = mv.receiveCommand();
        
            switch (command) {
        
            case 1:
            
                tw.showTreasures(cave.getTreasures());
                break;
            
            case 2: 
            
                tw.showTreasure(cl.findTheMostExpensive(cave.getTreasures()));
                break;
            
            case 3:
            
                double sum = mv.receiveSum();
                tw.showTreasures(cl.findAffordableTreasures(cave.getTreasures(), sum));
                break;
            
            case 0:
                break;
            
            }
        
        } while(command != 0);
    }
}
    

