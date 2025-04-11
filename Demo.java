 public class Demo{
     String name;
    Demo(){
        System.out.println("const called");
        name="Programming";
    }
    public static void main(String[]args)
    {
    Demo obj = new Demo();
    System.out.println("The name is" + obj.name);
    }
} 


