public class Box {
    String name;
    int roll;
    Box(){
        name="asim";
        roll=201;
        System.out.println("I am defult constructor");

    }
    Box(String n, int r){
        name=n;
        roll=r;

        System.out.println("its paramitrized constructoe");
    }
    void show(){
        System.out.println("Name:-> "+name);
         System.out.println("roll:- >"+roll);
         System.out.println();
    }
    public static void main(String[] args) {
        //default
       

        //parameterized
        Box obj1=new Box("Raj", 500);
        obj1.show();

         Box obj=new Box();
        obj.show();
    }
}
