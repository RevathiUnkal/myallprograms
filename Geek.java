//default access specifier

class Geek {
    void display() {
        System.out.println("Hello World!");
    }
}

class GeekNew {
    public static void main(String args[]) {

        // Accessing class Geek from package p1
        Geek o = new Geek();

        o.display();
    }
}
