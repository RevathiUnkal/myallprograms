public class value {
static void display(int a)
{
    a=a+5;
    System.out.println(a);
}
public static void main(String[] args) {
    int a = 5;
    System.out.println("before passing the value :"+a);
    display(a);
    System.out.println("After passing the value :"+a);
}
}
 