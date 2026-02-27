package oops_Levelup.inheritance_flow;

public class Employee extends Person{
    private String role;

    Employee(String name,String role){
        super(name);
        this.role=role;
        System.out.println("Child Constructor: Employee created");
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("My role is " + role);
    }
}
