import java.util.Scanner;
public class learning2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks:");
        int Marks= sc.nextInt();
         if(Marks>=100){
            System.out.println("A+ grade");

         }
         else if (Marks>=90){
            System.out.println("A grade");
         }
         else if(Marks>=80){
            System.out.println("B+ grade");
         }
          else if(Marks>=70){
            System.out.println("B grade");
         }
          else if(Marks>=60){
            System.out.println("C+ grade");
         }
          else if(Marks>=50){
            System.out.println("C grade");
         }
          else if(Marks>=40){
            System.out.println("D + grade");
         }
         else{
            System.out.println("Fail......!");
         }

        
        }

    }


    

