package com.rajkr.pkg;

public class TestPackage {
    public static void main(String args[]){
        System.out.println("Test Package");
    }
}

// Class A is in package - pack1, and Class B is in package- pack2
package pack1;
class A {
    protected void m1() {
        Sopln("A class protected method");
    }
}
---------------------------------------------------
package pack2;

public class B extends A {
    public static void main(String args[]) {
        A a = new A();
        a.m1();

        B b = new B();
        b.m1();

        A a1 = new B();
        a1.m1();
    }
}
