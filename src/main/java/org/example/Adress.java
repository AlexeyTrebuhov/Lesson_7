package org.example;

public abstract class Adress {

    protected static String Country;
    protected static String Subject;
    protected static String Toun;
    protected static String Street;
    protected static int House;
    protected static String Telephone;


    public Adress() {
        Adress.Country = Country;
        Adress.Subject = Subject;
        Adress.Toun = Toun;
        Adress.Street = Street;
        Adress.House = House;
        Adress.Telephone = Telephone;
    }

    public static String getCountry() {
        return Country;
    }

    public static String getSubject() {
        return Subject;
    }

    public static String getToun() {
        return Toun;
    }

    public static String getStreet() {
        return Street;
    }

    public static int getHouse() {
        return House;
    }

    public static String getTelephone() {
        return Telephone;
    }
}
