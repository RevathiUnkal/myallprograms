public class method_overloading {
    static int display(int a)
    {
System.out.println("value of a" +a);
return 0;
    }
void display(int a,int b){
System.out.println("value of a and b:"+a+"and"+b);
}
public static void main(String[] args){
    display(5);
    method_overloading obj = new method_overloading();
    obj.display(5,8);
}
    
}
