package by.htp.homework.eighth.task01.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.htp.homework.eighth.task01.bean.Word;

public class Sentence implements Serializable {
    
    private List <Word> words = new ArrayList <Word> ();
    
    public Sentence() {}

    public Sentence(ArrayList<Word> words) {
        this.words = words;
    }
    
    public Sentence (String sentence) {
        
        Scanner scan = new Scanner(sentence);
  
        while (scan.hasNext()) {

            this.words.add(new Word(scan.next().toCharArray()));
        }
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[words=" + words + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((words == null) ? 0 : words.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Sentence other = (Sentence) obj;
        if (words == null) {
            if (other.words != null)
                return false;
        } else if (!words.equals(other.words))
            return false;
        return true;
    }
    
    
}
