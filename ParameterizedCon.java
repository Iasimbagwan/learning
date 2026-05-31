public class ParameterizedCon {
 
    String bikename;
    int price;
    ParameterizedCon(String bk,int pri){
        this.bikename=bk;
        this.price=pri;

    }
    void show(){
        System.out.println("bik name is - "+bikename+ " and the price is "+price);
        
    }
    public static void main(String[] args) {
        ParameterizedCon Bikinf= new ParameterizedCon(" Splendor ", 1000);
        Bikinf.show();
    }
}
