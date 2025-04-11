class ref_method {
    int x=10;
    int y=90;
}
public class classref{
    public static void main(String[] args) {
        ref_method d1= new ref_method();
        ref_method g1 =d1;
        ref_method m1= new ref_method();
        ref_method q1 =m1;
        q1.x=50;
        System.out.println(g1.x);
        System.out.println(d1.x);
        System.out.println(m1.x);
        System.out.println(q1.x);
      ref_method s1=new ref_method();
      ref_method i1=s1;
      ref_method n1=new ref_method();
      ref_method c1=n1;
      c1.y=20;
          System.out.println(i1.y);
            System.out.println(s1.y);
            System.out.println(n1.y);
            System.out.println(c1.y);  
    }
}
