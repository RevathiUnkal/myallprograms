public class student {
    String name;
    int id;
    int age;
    student(int a, int b){
        id = a; 
        age = b;
    }
    public static void main(String[] args) {
        student s1 = new student(3,8);
        System.out.println(s1.name +" "+s1.age+""+s1.id);

    }
}
