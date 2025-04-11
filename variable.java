public class variable {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        variable obj1 = new variable();
        obj1.method1();
        System.out.println(obj1.a);// obj creation
        System.out.println(b);
    }

    // local variable
    public void method1() {
        int d = 50;
        float f = 1.1f;
        System.out.println(d);
        System.out.println(f);
        System.out.println(a);// a is instances

    }
}
