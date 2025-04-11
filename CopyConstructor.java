public class CopyConstructor {
    String name;
    int age;

    CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    CopyConstructor(CopyConstructor s) {
        name = s.name;
        age = s.age;
        System.out.println("Inside copy constructor");
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public static void main(String[] args) {
        CopyConstructor s1 = new CopyConstructor("Ayush", 25);
        CopyConstructor s2 = new CopyConstructor(s1);
        s1.display();
        s2.display();
    }
}
