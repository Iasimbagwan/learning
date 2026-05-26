public class ParameterizedCon {
    String bikeName;
    int price;
ParameterizedCon(String bn,int p){
    this.price=p;
    this.bikeName=bn;
    System.out.println("I am back bro yees its me constructor");

}
void show(){
    System.out.println("The bike price is => "+price);
    System.out.println("the bike name is =>"+bikeName);
}
    public static void main(String[] args) {
        ParameterizedCon Bk=new ParameterizedCon("Tvs_Ronnie", 15000);
        Bk.show();
    }
}
