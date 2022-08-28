package org.example;

import javax.xml.crypto.Data;

public abstract class Person extends Adress{

    protected static String name;
    protected static String surname;
    protected static Data year;

    public Person(String name, String surname, Data year ) {
        super();
        this.name = name;
        this.surname = surname;
        this.year = year;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }



    public Data getYear() {
        return year;
    }

}

