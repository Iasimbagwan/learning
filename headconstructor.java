public class headconstructor{
   
     int age;
        String name;

    headconstructor(int n ,String s){
        age= n;
        name= s;
    }

    void show(){
        System.out.println("the age is= "+age);
        System.out.println("the name="+name);
    }
    public static void main(String[] args) {
        headconstructor s1=new headconstructor(52,"hi");
        s1.show();
    }
}