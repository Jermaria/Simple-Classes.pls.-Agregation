package by.htp.homework.seventh.task09;

public class LibraryLogic {
    
    public void addBook(Library lib, Book book) {
        
        lib.base.add(book);
    }
    
    public Library showBooksByAuthor(Library lib, String author) {
        
    Library found = new Library();
        
    for (int i = 0; i < lib.base.size(); i++) {
            
        if (lib.base.get(i).getAuthor().equals(author)) {
           found.base.add(lib.base.get(i));
        }
    }
        
        return found;
    }
    
    public Library showBooksByPublisher(Library lib, String publisher) {
        
        Library found = new Library();
        
        for (int i = 0; i < lib.base.size(); i++) {
            
            if (lib.base.get(i).getPublisher().equals(publisher)) {
                found.base.add(lib.base.get(i));
            }
        }
        
        return found;   
    }
    
    public Library showBooksPublishedAfter(Library lib, int year) {
        
        Library found = new Library();
        
        for (int i = 0; i < lib.base.size(); i++) {
            
            if (lib.base.get(i).getYear() > year) {
                found.base.add(lib.base.get(i));
            }
        }
    
        return found;
    }

}
