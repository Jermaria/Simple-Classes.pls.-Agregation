package by.htp.homework.ninth.task01.logic;

import by.htp.homework.ninth.task01.bean.Directory;


public class TextFileLogic extends FileLogic {

    public void createFile(Directory dir, String fileName) {
       
        dir.getFiles().add(new Directory().new TextFile(fileName));
    }
    
    public void addContent(Directory.TextFile t, String s) {
        
        if (t.getContent() == null) {
            
            t.setContent(s);
            
        } else {
            
            t.setContent(t.getContent() + " " + s);
        }
    }
}
