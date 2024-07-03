

//Child class member cannot be part of Parent Class
class Parent {
    int x1 = 10;
    String s1 = "Parent Variable";

    public void m1() {
        System.out.println("Parent Method");
    }
}

//All member of parent class will be available in child class
class Child extends Parent {

    int y1 = 10;
    String t1 = "Child Variable";

    public void m2() {
        System.out.println("Child Method");
    }
}

class Test {
    public static void main(String[] args) {
        //Parent reference can be used to hold Parent object. Parent reference can only call it's parent class members but not child class members
        Parent p = new Parent();
        p.m1();
        p.m2(); // Error

        // Child reference can be used to hold child object. Child reference can call Parent class members
        Child c = new Child();
        c.m1();
        c.m2();

        // Parent reference can be used to hold child object. But using parent reference we can't call Child class members
        Parent parent = new Child();
        parent.m1();
        parent.m2(); // Error
    }
}

