package by.htp.homework.ninth.task01.main;

import by.htp.homework.ninth.task01.bean.Directory;
import by.htp.homework.ninth.task01.logic.TextFileLogic;
import by.htp.homework.ninth.task01.view.View;

public class Main {

    public static void main(String[] args) {
        
        Directory dir = new Directory();
        
        TextFileLogic logic = new TextFileLogic();
        
        logic.createFile(dir, "OOP for Dummies");
        
        Directory.TextFile text = (Directory.TextFile)dir.getFiles().get(0);
        
        logic.addContent(text, "Chapter 1");
        
        View view = new View();
        
        view.showContent(text);
        
        logic.deleteFile(dir, text);
        
        System.out.println(dir.getFiles().size());
    

    }

}
