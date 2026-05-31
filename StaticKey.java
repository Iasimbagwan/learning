public class StaticKey {
    static String collegeName="Fuel";
    //instance variable
    String name;
    int rollNo;

        //constructor
        StaticKey(String n, int r ){
            name=n;
            rollNo=r;
        }
        //showmethod
        void show(){
        
            System.out.println("the name "+name);
            System.out.println("the roll"+rollNo);
            System.out.println("the college"+collegeName);
        }
        public static void main(String[] args) {
            StaticKey s1=new StaticKey("asim", 1060);
            StaticKey s2=new StaticKey("raj", 900);

            s1.show();
            s2.show();
        }

}
