// Variables resolution is always taken care by Compiler based on reference type whether variable is static or non-static.
class Parent {
    String s = "Parent";
}

class Child extends Parent {
    String c = "Child";
}

class Test {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.s); // Reference type is Parent.So Parent variable will be invoked


        Child c = new Child();
        System.out.println(c.s); // Reference type is Child.So Child variable will be invoked

        Parent parent = new Child();
        System.out.println(parent.s); // Reference type is Parent.So Parent variable will be invoked
    }
}