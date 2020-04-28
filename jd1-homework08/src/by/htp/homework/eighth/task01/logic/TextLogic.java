package by.htp.homework.eighth.task01.logic;

import by.htp.homework.eighth.task01.bean.Sentence;
import by.htp.homework.eighth.task01.bean.Text;

public class TextLogic {
    
    public TextLogic() {}
    
    public void addSentence (Text text, Sentence sentence) {
        
        text.getSentences().add(sentence);
    }

}
