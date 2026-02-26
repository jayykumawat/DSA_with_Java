package oops_Levelup.package_demo.pack1;

public class ParentClass {

    private int privateVar = 10;
    int defaultVar = 20;           // default access
    protected int protectedVar = 30;
    public int publicVar = 40;

    public void showAll() {
        System.out.println("Inside ParentClass");
        System.out.println("private: " + privateVar);
        System.out.println("default: " + defaultVar);
        System.out.println("protected: " + protectedVar);
        System.out.println("public: " + publicVar);
    }
}

