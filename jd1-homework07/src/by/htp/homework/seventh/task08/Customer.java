package by.htp.homework.seventh.task08;

import java.io.Serializable;

// 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
// метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
// методами. Задать критерии выбора данных и вывести эти данные на консоль.
// Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
// Найти и вывести:
// a) список покупателей в алфавитном порядке;
// b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class Customer implements Serializable {

	private int id;
	private String surname;
	private String name;
	private String patronimic;
	private String address;
	private String creditCardNum;
	private int accountNum;
	
	
	public Customer() {}
	
	
	
	public Customer(int id) {
		this.id = id;
	}

	public Customer(String surname, String name, String patronimic, String address) {

		this.surname = surname;
		this.name = name;
		this.patronimic = patronimic;
		this.address = address;
	}

	public Customer(int id, String surname, String name, String patronimic, String address, String creditCardNum,
						int accountNum) {
		
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronimic = patronimic;
		this.address = address;
		this.creditCardNum = creditCardNum;
		this.accountNum = accountNum;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPatronimic() {
		return patronimic;
	}
	
	public void setPatronimic(String patronimic) {
		this.patronimic = patronimic;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCreditCardNum() {
		return creditCardNum;
	}
	
	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}
	
	public int getAccountNum() {
		return accountNum;
	}
	
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	@Override
	public String toString() {
	    
		return  this.getClass().getName() + "[id = " + id + ", surname = " + surname + ", name = " + name + ", patronimic = " + patronimic
				+ ", address = " + address + ", creditCardNum = " + creditCardNum + ", accountNum = " + accountNum + "]";
	}



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + accountNum;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((creditCardNum == null) ? 0 : creditCardNum.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((patronimic == null) ? 0 : patronimic.hashCode());
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
        Customer other = (Customer) obj;
        if (accountNum != other.accountNum)
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (creditCardNum == null) {
            if (other.creditCardNum != null)
                return false;
        } else if (!creditCardNum.equals(other.creditCardNum))
            return false;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (patronimic == null) {
            if (other.patronimic != null)
                return false;
        } else if (!patronimic.equals(other.patronimic))
            return false;
        if (surname == null) {
            if (other.surname != null)
                return false;
        } else if (!surname.equals(other.surname))
            return false;
        return true;
    }
}
