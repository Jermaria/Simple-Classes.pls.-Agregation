package by.htp.homework.ninth.task05.main;

import java.util.regex.Pattern;

import by.htp.homework.ninth.task05.bean.Bouquet;
import by.htp.homework.ninth.task05.controller.Controller;
import by.htp.homework.ninth.task05.logic.BouquetLogic;
import by.htp.homework.ninth.task05.view.View;

public class Main {
    
    public static void main(String[] args) {
        
        Controller controller = new Controller();
        View view = new View();
        
        String myFlowers = "5 red roses, 1 blue cornflower, 1 red tulip";
        String myWrapping = "30x30 white paper";
        
        view.showBouquet(controller.provideBouquet(myFlowers, myWrapping));
        
       // Bouquet b = controller.provideBouquet(myFlowers, myWrapping);
        
        //System.out.println(b.getClass().getSimpleName());
       
        }

}
