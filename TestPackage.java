
class Test {
    public void m1() {
       System.out.println("No Args");
    }
    public void m1(int i) {
        System.out.println("int Args");
    }
    public void m1(double d) {
        System.out.println("double Args");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
        t.m1(10);
        t.m1(10.55);
    }
}

