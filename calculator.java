import java.util.Scanner;
public class calculator {
    int num1;
    int num2;
    calculator(int n1,int n2){
        num1=n1;
        num2=n2;
    }
    void addition(){
        System.out.println("the addition is " +(num1+num2));
    }
     void substraction(){
        System.out.println("the substration " +(num1-num2));
    }
     void multiplication(){
        System.out.println("the multiplicatuiom " +(num1*num2));
    }
    void dividation(){
        System.out.println("the division "+(num1/num2));
    }
    void modulu(){
        System.out.println("the mod is" + (num1 % num2));
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number to perfom the opertaion->");
        int num1= sc.nextInt();
        System.out.println("Please enrter the secnd number to perform the operation -> ");
        int num2=sc.nextInt();
        calculator cal=new calculator(num1,num2);
        cal.addition();
        cal.dividation();
        cal.multiplication();
        cal.substraction();
        cal.modulu();
    }
    
}
