package by.htp.homework.ninth.task01.logic;


import by.htp.homework.ninth.task01.bean.Directory;

public abstract class FileLogic {
    
    public void createFile(Directory dir, String fileName) {      
    }
    
    public void renameFile(Directory.File f, String newName) {
       
        f.setName(newName);
    }
    
    public void deleteFile(Directory dir, Directory.File f) {
        
        dir.getFiles().remove(f);
    }

}
