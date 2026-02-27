package oops_Levelup.inheritance_flow;

public class Person {
    protected String name;

    Person(String name){
        this.name=name;
        System.out.println("Parent Constructor: Person created");
    }
    public void introduce(){
        System.out.println("I am the person named "+name);
    }
}
