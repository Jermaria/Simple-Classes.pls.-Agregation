package by.htp.homework.seventh.task03;

import java.io.Serializable;
import java.util.Arrays;

// 3. Создайте класс с именем Student, содержащий поля: 
// фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
// Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
// номеров групп студентов, имеющих оценки, равные только 9 или 10.


public class Student implements Serializable {
	
	private String name;
	private String surname;
	private int group;
	private int[] marks = new int[5];
	
	public Student() {}
	
	public void setName(String _name) {
		this.name = _name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurname(String _surname) {
		this.surname = _surname;
	}
	
	public String getSurame() {
		return surname;
	}
	
	public void setGroup(int _group) {
		this.group = _group;
	}
	
	public int getGroup() {
		return group;
	}
	
	public void setMarks(int[] _marks) {
		this.marks = _marks;
	}
	
	public int[] getMarks() {
		return marks;
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + group;
        result = prime * result + Arrays.hashCode(marks);
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
        Student other = (Student) obj;
        if (group != other.group)
            return false;
        if (!Arrays.equals(marks, other.marks))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (surname == null) {
            if (other.surname != null)
                return false;
        } else if (!surname.equals(other.surname))
            return false;
        return true;
    }
	
	

}
