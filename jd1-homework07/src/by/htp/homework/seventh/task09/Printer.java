package by.htp.homework.seventh.task09;

public class Printer {
    
    public void printBook(Book b) {
        
        System.out.println(b.getId() + " " + b.getTitle() + " by " + b.getAuthor() + " price: " + b.getPrice()
                            + " published by " + b.getPublisher() + " in " + b.getYear() + " " + b.getPages() + " pages");
    }

   public void printBase(Library lib) {
       
       for (Book b : lib.base) {
           printBook(b);
       }
   }
}
