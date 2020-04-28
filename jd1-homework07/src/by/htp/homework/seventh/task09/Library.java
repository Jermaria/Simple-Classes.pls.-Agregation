package by.htp.homework.seventh.task09;

import java.io.Serializable;
import java.util.ArrayList;

import by.htp.homework.seventh.task09.Book;

public class Library implements Serializable {
	
	ArrayList <Book> base = new ArrayList <Book>(2);
	
	
	public Library() {}
	
	public Library(ArrayList<Book> base) {
		this.base = base;
	}

    public ArrayList<Book> getBase() {
        return base;
    }

    public void setBase(ArrayList<Book> base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [base=" + base + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((base == null) ? 0 : base.hashCode());
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
        Library other = (Library) obj;
        if (base == null) {
            if (other.base != null)
                return false;
        } else if (!base.equals(other.base))
            return false;
        return true;
    }
	
}
