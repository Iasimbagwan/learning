public class javaConstructor {
    String Name;
    String adress;

    //Constructor
    javaConstructor (String n,String a){
        Name=n;
        adress=a;
    }
    void show(){
        System.out.println(Name);
        System.out.println(adress);

    }
    public static void main(String[] args) {
        javaConstructor s1=new javaConstructor("asim","ichalkaranji");
        s1.show();
    }


}
