public class OverloadingConstru {
    String BrandName;
    int price;

    OverloadingConstru(){//constructor
        System.out.print("Default");
    }
    //constructor2
    OverloadingConstru(String Bn){
        BrandName=Bn;
    }
   OverloadingConstru(String Bn,int p){
        BrandName=Bn;
        price=p;
    }
    void show(){
        System.out.println(BrandName);
        System.out.println(price);
    }
    public static void main(String[] args) {
        OverloadingConstru car1= new OverloadingConstru();
        OverloadingConstru car2=new OverloadingConstru("Ace");
        OverloadingConstru car3=new OverloadingConstru("Aze",30);
        car2.show();
        car3.show();
    }
}
