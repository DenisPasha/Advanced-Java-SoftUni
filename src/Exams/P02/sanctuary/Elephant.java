package Exams.P02.sanctuary;

public class Elephant {
    //•	name: String
    //•	age: int
    //•	retiredFrom: String
    private String name;
    private int age;
    private  String retiredFrom;

    public Elephant(String name, int age, String retiredFrom) {
        this.name = name;
        this.age = age;
        this.retiredFrom = retiredFrom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRetiredFrom() {
        return retiredFrom;
    }

    public void setRetiredFrom(String retiredFrom) {
        this.retiredFrom = retiredFrom;
    }

    @Override
    public String toString(){
        //name} {age} - {retiredFrom}"
        return String.format("%s %d - %s",this.name,this.age,this.retiredFrom);
    }
}
