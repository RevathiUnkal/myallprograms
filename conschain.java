public class conschain {
    int rollno;
    String name;
    String course;
    public conschain(){
        this.rollno=20;
        System.out.println("roll no"+rollno);
    }
    public conschain(int rollno,String name,String course){
        this();
        this.name=name;
        this.rollno=rollno;
        this.course=course;
    }
    public static void main(String[] args) {
        conschain obj=new conschain(20,"prateeksha","data mining");
        System.out.println("name is "+obj.name);
        System.out.println("course is "+obj.course);
    }
    }

    