public class Employee {
    String name;
    int id;
    double salary;
    String Dependencies;
    public Employee(String name,int id, double salary,String Dependencies){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.Dependencies=Dependencies;
    }
    public void displayInfo(){
        System.out.println("Employee ID:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Salary:"+salary);
        System.out.println("Dependencies: "+Dependencies);
    }
    public static void main(String[] args){
        Employee emp1=new Employee("XYZ", 101, 50000.0,"Brother");
        emp1.displayInfo();
    }
    
}