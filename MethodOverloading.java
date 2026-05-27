public class MethodOverloading {
    //method
    int add(int number1,int number2){

        return number1+number2;
    
    }
    //method
    double add(double number1,double number2){
            return number1+number2;
    }
     int add(int n1, int n2, int n3){
        return n1+n2+n3;
     }
     public static void main(String[] args) {
        MethodOverloading obj1=new MethodOverloading();
        System.out.println("The addition "+obj1.add(1.55, 52.2));
        System.out.println("The addition of "+obj1.add(2, 55,65));
     }


}
