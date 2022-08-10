package oop.task;

import java.util.ArrayList;

public class WorkBook {
    private String name;
    private ArrayList<String> companies = new ArrayList<>();

    public WorkBook(String name, ArrayList<String> companies) {
        this.name = name;
        this.companies = companies;
    }

    public void addCompanies(String companyName){
        companies.add(companyName);
    }
}
