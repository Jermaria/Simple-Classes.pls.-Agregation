package by.htp.homework.eighth.task01.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text implements Serializable {
    
    private String header;
    private List <Sentence> sentences = new ArrayList <Sentence>();
    
    public Text() {}

    public Text(String header, ArrayList<Sentence> sentences) {
        this.header = header;
        this.sentences = sentences;
    }
    
    public Text(String header, String sentences) {
        this.header = header;
        
        Sentence sent = new Sentence(sentences);
        
        this.sentences.add(sent);
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(ArrayList<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[header=" + header + ", sentences=" + sentences + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((header == null) ? 0 : header.hashCode());
        result = prime * result + ((sentences == null) ? 0 : sentences.hashCode());
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
        Text other = (Text) obj;
        if (header == null) {
            if (other.header != null)
                return false;
        } else if (!header.equals(other.header))
            return false;
        if (sentences == null) {
            if (other.sentences != null)
                return false;
        } else if (!sentences.equals(other.sentences))
            return false;
        return true;
    }
    
}
