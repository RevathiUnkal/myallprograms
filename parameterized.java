public class parameterized {

    int x;

    parameterized(int y) { // parameterized constructor
        x = y;
        System.out.println("x value is : " + x);
    }

    public static void main(String[] args) {
        parameterized myObj = new parameterized(5);

    }
}
