public class AA {
    protected void display() {
        System.out.println("GeeksforGeeks");
    }
}

class B extends AA {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}