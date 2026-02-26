package oops_Levelup.package_demo.pack2;
import oops_Levelup.package_demo.pack1.ParentClass;
public class ChildClass extends ParentClass{
    public void testaccess(){
        // System.out.println("private: " + privateVar); not accessible
       // System.out.println("default: " + defaultVar); not accessible in different package
        System.out.println("protected: " + protectedVar); //accessible via inheritance
        System.out.println("public: " + publicVar);//always accessible..
    }
}
