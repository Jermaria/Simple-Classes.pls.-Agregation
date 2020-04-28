package by.htp.homework.ninth.task04a.view;

import java.util.Scanner;

public class MenuView {
    
    public void showMenu() {
        
        String menu = "Choose action below \n"
                + "1 - Show all treasures \n"
                + "2 - Show the most expensive treasure \n"
                + "3 - Show affordable treasure(s) \n"
                + "Press any other key to close";
        
        System.out.println(menu);
    }
    
    public int receiveCommand() {
        
        int command;
        
        showMenu();
  
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        if (scan.hasNextInt()) {
            
            command = scan.nextInt();
            
            if (command < 1 || command > 3) {
                
                return 0;
                
            } else return command;
        }
        
        return 0;
    }
    
    public double receiveSum() {
        
        double sum;
        
        System.out.println("Enter the sum");
        
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        if (scan.hasNextDouble()) {
            
            sum = scan.nextDouble();
            return sum;
            
        } else return 0;
    }
    
    

}
