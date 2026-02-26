package oops_Levelup.package_demo.pack1;

public class SamePackageTest {

    public static void main(String[] args) {

        ParentClass obj = new ParentClass();

        // System.out.println(obj.privateVar); Not accessible.. 
        // (only access in same file)

        System.out.println("default: " + obj.defaultVar);
        System.out.println("protected: " + obj.protectedVar);
        System.out.println("public: " + obj.publicVar);
    }
}
