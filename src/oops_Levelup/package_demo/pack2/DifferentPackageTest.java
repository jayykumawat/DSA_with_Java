package oops_Levelup.package_demo.pack2;

import oops_Levelup.package_demo.pack1.ParentClass;

public class DifferentPackageTest {

    public static void main(String[] args) {

        ParentClass obj = new ParentClass();

        // System.out.println(obj.defaultVar); not access in this package
        // System.out.println(obj.protectedVar); not access in this package
        // System.out.println(obj.privateVar); not access in this package

        System.out.println("public: " + obj.publicVar);
    }
}
