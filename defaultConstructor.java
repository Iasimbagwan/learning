public class defaultConstructor {
    String Employ_name;
    float salary;
   
    
    void show(){
         System.out.println("The employe name is"+Employ_name);
        System.out.println("the salary is "+salary);

    }
    public static void main(String[] args) {
        defaultConstructor em1=new defaultConstructor();
        em1.Employ_name="Asim";
        em1.salary=52000;
        em1.show();
    }
    
}
