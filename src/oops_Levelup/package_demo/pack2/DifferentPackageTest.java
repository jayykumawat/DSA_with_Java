package oops_Levelup.package_demo.pack2;

import oops_Levelup.package_demo.pack1.ParentClass;

public class DifferentPackageTest {

    public static void main(String[] args) {

        ParentClass parent = new ParentClass();

        // Even though protected, this won't work:
        // System.out.println(parent.protectedVar);

        ChildClass child = new ChildClass();
        child.testaccess();

    }
}
