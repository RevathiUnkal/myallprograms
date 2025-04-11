class ref_method {
    int x=10;
}
public class xyz{
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
    }
}
