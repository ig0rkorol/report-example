package net.serenitybdd.report.example.model;

public class User {
    private String name;
    private String id;
    public User(String value){
        name = value;
    }
    public void setName(String value){
        name = value;
    }

    public String getName() {
        return name;
    }
    public void setId(String value){
        id = value;
    }
    public String getId(){
        return id;
    }
}
