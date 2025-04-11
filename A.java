class A {
    protected void display() {
        System.out.println("GeeksforGeeks");
    }
}

// Class B
class B {
    public static void main(String args[]) {
        A obj = new A();
        // to access private method
        // of another class
        obj.display();
    }
}