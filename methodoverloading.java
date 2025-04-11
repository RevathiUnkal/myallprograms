public class methodoverloading {
public void add(int i,int j)
{
    System.out.println(i+j);
}
public void add(int i,int j,int k)

{
    System.out.println(i+j+k);
}
public void add(double i,double j)
{
    System.out.println(i+j);
}
public static void main(String[] args) {
    methodoverloading m1 = new methodoverloading();
    m1.add(2,4);
    m1.add(3,7,8);
    m1.add(5.9,3.1);
}
}
