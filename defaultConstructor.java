public class defaultConstructor {

    String brand;
    int Speed;
     defaultConstructor(){
        System.out.print("Bike created");
     }
     void show(){
        System.out.println("The Speed is "+Speed);
        System.out.print("The brand is " +brand);

     }
     public static void main(String[] args) {
        defaultConstructor obj=new defaultConstructor();
        obj.brand="honda";
        obj.Speed= 2000;
        obj.show();
     }
    
}
