class car {
String Model;
car(String Model){
System.out.println(Model);

}
void display(){
    System.out.println(Model);
}
}

public class StringRef
{
public static void main(String[] args) {
    car c1=new car("BMW");
    car c2 = c1;
     
    c2.Model="toyota";
    c1.display();

    c2.display();
    System.out.println(c1);
    System.err.println(c2);
}
}
