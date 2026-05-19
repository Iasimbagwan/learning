import java.util.*;

public class Marks {

    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in); 
            System.out.println("Please enter the 1 subject marks--> ");
            double marks1=sc.nextInt();
            
            System.out.println("Please enter the 2 subject marks-->");
            double marks2=sc.nextInt();
            
            System.out.println("Please enter the 3 subject marks-->");
            double marks3=sc.nextInt();

                System.out.println("Please enter the 4 subject marks-->");
                double marks4=sc.nextInt();

                System.out.println("Plese enter the 5 th subject marks");
                double marks5=sc.nextInt();

                double total=marks1+marks2+marks3+marks4+marks5;
                double percentage=(total/500)*100;

                        System.out.println("The toatal of marks is"+total);
        
                        System.out.println("------------------------------------");
        
                         System.out.println("the percentage=>"+percentage+"%");
        
                        System.out.println("------------------------------------");
        
        
    }
}