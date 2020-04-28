package by.htp.homework.eighth.task01.bean;

import java.io.Serializable;
import java.util.Arrays;

public class Word implements Serializable {
    
    private char[] symbols;
    
    public Word () {}

    public Word(char[] symbols) {
        this.symbols = symbols;
    }
    
    public char[] getSymbols() {
        return symbols;
    }

    public void setSymbols(char[] symbols) {
        this.symbols = symbols;
    }
    
    public void setSymbols(String symbols) {
        this.symbols = symbols.toCharArray();
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[symbols=" + Arrays.toString(symbols) + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(symbols);
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
        Word other = (Word) obj;
        if (!Arrays.equals(symbols, other.symbols))
            return false;
        return true;
    }
    
    

}
