public class mobil {
    String name;
    int price;
    mobil(String n, int p){
        name=n;
        price=p;
            
    }
    void show(){
        System.out.println(name);
        System.out.println(price);
    }
    public static void main(String[] args) {
        mobil obj=new mobil("Motorolla",53000);
        obj.show();
    }
}
