public class test { 
    static
    {
        System.out.println("instance block 1");
    }
    static
    {
        System.out.println("static block 1");
    }
    static
   {
        System.out.println("instance block 2");
    }
    static
    {
        System.out.println("static block 2");
    }
    public static void main(String[] args) {
        System.out.println("main block");
    }

}
