package by.htp.homework.eighth.task01.view;

import by.htp.homework.eighth.task01.bean.*;

public class View {
    
    public View() {} 
    
    public void viewHeader(Text text) {
        System.out.println(text.getHeader());
    }
    
    public void viewWord(Word word) {
        
        for(char ch : word.getSymbols()) {
            
            System.out.print(ch);
        }
        
        System.out.print(" ");
        
    }
    
    public void viewSentence(Sentence sentence) {
       
        for (Word word : sentence.getWords()) {
            viewWord(word);
        }
        System.out.print(" ");
    }
    
    public void viewText(Text text) {
        
        for (Sentence sentence : text.getSentences()) {
            viewSentence(sentence);
        }
    }
}
