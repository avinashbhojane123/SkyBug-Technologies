import java.util.Scanner;
public class MarkGrade 
{
  Scanner sc=new Scanner(System.in);
  int sum=0;
  void gradecal(String nm,int a[])
   {
    int sum=0;
    for(int r=0; r<5; r++) 
    {
      sum+=a[r];
    } 
     double avg=sum/5.0;
     System.out.println("\n\n");
     System.out.println("\t \t \t STUDENT GRADE CALCULATOR");
     System.out.println("_____________________________________________________________________");
     System.out.println("\tName  |\t\t Total Marks | \t Percentage | \t\t Grade");
    System.out.println("_____________________________________________________________________\n");
       if(avg>=90.1 && avg<=100)
        {
            System.out.println("\t "+nm+"\t \t "+sum+"\t\t    "+avg+" \t   O\n");
             System.exit(0);
        }
       if(avg>=80.1 && avg<=90)
       {
           System.out.println("\t "+nm+"\t \t "+sum+"\t\t    "+avg+" \t   A+\n");  
            System.exit(0);
       }
       if(avg>=70.1 && avg<=80)
       {
           System.out.println("\t "+nm+"\t \t "+sum+"\t\t    "+avg+" \t   A\n");
            System.exit(0);
       }
       if(avg>=60.1 && avg<=70)
       {
           System.out.println("\t "+nm+"\t \t "+sum+"\t\t    "+avg+" \t   B+\n");
            System.exit(0);
       }
       if(avg>=50.1 && avg<=60)
       {
           System.out.println("\t "+nm+"\t \t "+sum+"\t\t    "+avg+" \t   B\n");
            System.exit(0);
       }
       if(avg>=50 && avg<=55)
       {
           System.out.println("\t "+nm+"\t \t "+sum+"\t\t    "+avg+" \t   C\n");   
            System.exit(0);
       }
       if(avg>=40 && avg<=50)
       {
           System.out.println("\t "+nm+"\t \t "+sum+"\t\t    "+avg+" \t   P\n"); 
            System.exit(0);
       }
       else
          System.out.println("\t "+nm+"\t \t "+sum+"\t\t    "+avg+" \t   F\n");     
    } 
    
  void read()
  {
    int a[] = new int[5];
    String nm;

     System.out.println("Enter Your First Name=");
      nm=sc.nextLine();
    System.out.println("Hi "+nm+" Enter Your 5 Subjects Marks=");
     for (int r = 0; r <5; r++)
      a[r]=sc.nextInt();

     gradecal(nm,a);  
  }

public static void main(String[] args)
 {
    MarkGrade m=new MarkGrade();
    m.read();
 }
}

