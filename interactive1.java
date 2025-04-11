import java.util.Scanner;
public class interactive1 {
public static void main(String[] args) {
    int choice;int i;
   
    {
    Scanner scan=new Scanner(System.in);do{
    System.out.println("***********MENU***********");
    System.out.println("1.Addition");
    System.out.println("2.subtraction");
    System.out.println("3.Multiplication");
    System.out.println("4.Division");
    System.out.println("5.modulus");
    System.out.println("6.increment");
    System.out.println("7.decrement");
    System.out.println("8.exit");

    System.out.println("enter the choice");

    choice=scan.nextInt();
    if(choice>=1 && choice<8){
     switch(choice)
    {   case 1 -> {
        int sum=0;
        int n;
        System.out.println("enter the no of values u want to add");
        n=scan.nextInt();
        for(i=0;i<n;i++)
        {
            sum=sum+scan.nextInt();
        }
        System.out.println("The sum of the numbers is "+sum);
            }
    
    case 2 -> {
        int sum1=0;
        int n1;
        System.out.println("enter the no of values u want to subtract");
        n1=scan.nextInt();
        for(i=0;i<n1;i++)
        {
            sum1=sum1-scan.nextInt();
        }
        System.out.println("The sum of the numbers is "+sum1);
            }
        case 3 -> {
            int sum2=1;
            int n2;
            System.out.println("enter the no of values u want to multiply");
            n2=scan.nextInt();
            for(i=0;i<n2;i++)
            {
                sum2=sum2*scan.nextInt();
            }
            System.out.println("The sum of the numbers is "+sum2);
            }
       case 4 -> {
           double x,y,z;
           System.out.println("Enter the 1st number");
           x=scan.nextInt();
           System.out.println("Enter the 2nd number");
           y=scan.nextInt();
           z=x/y;
           System.out.println("Division result is"+z);
            }

       case 5 -> {
           double q1,q2,q3;
           System.out.println("Enter the 1st number");
           q1=scan.nextInt();
           System.out.println("Enter the 2nd number");
           q2=scan.nextInt();
           q3=q1%q2;
           System.out.println("modulus result is"+q3);
            }

       case 6 -> {
           
           System.out.println("Enter the number for incrementing");
           int inc;
           inc=scan.nextInt();
          inc++;
           System.out.println("increment result is"+inc);
            }
       

       case 7 -> {
           int dec;
           System.out.println("Enter the number for decrementing");
           dec=scan.nextInt();
           dec--;
           System.out.println("increment result is"+dec);
            }

       case 8 -> {
        System.out.println("exiting");
        break;
        
        }        
     }
} scan.close();
}
while(choice!=8);
}}}