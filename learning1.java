import java.util.Scanner;
public class learning1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if(number<0){
            System.out.println("its negative number-->"+number);
        }
        else {
            System.out.println("its positive number-->"+number);
        }
    }
    
}
