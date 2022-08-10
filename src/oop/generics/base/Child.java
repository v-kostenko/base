package oop.generics.base;

import java.util.Date;

public class Child extends FirstGeneric<String>{
    private Date date;

    public Child(String field1, Date date) {
        super(field1);
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Child{" +
                "date=" + date +
                '}';
    }
}
