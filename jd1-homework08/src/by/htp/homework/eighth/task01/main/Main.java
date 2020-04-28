package by.htp.homework.eighth.task01.main;

import java.util.Arrays;

import by.htp.homework.eighth.task01.bean.Sentence;
import by.htp.homework.eighth.task01.bean.Text;
import by.htp.homework.eighth.task01.logic.TextLogic;
import by.htp.homework.eighth.task01.view.View;

public class Main {

    public static void main(String[] args) {
        
        Text text = new Text("Chapter 1", "All happy families resemble one another.");
        
        Sentence secondSentence = new Sentence("Each unhappy family is unhappy in its own way.");
        
        TextLogic logic = new TextLogic();
        
        logic.addSentence(text, secondSentence);
        
        View view = new View();
        
        view.viewHeader(text);
        view.viewText(text);
        

    }

}
