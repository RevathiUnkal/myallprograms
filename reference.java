public class reference {
String name;
static void changename(reference s){
s.name="prat- +";                                                                                                    
}


public static void main(String [] args){
 reference r= new reference();
 r.name="prattu";
 System.out.println("Before passing reference"+r.name);
 changename(r);
 System.out.println("After pasaing reference :"+r.name);
}}
