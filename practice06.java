/**
 * practice06
 */
class Business {
    int id=100;
    String name = "Consumer";
}
public class practice06 {   
    public static void main(String[] args) {
        Business b1=new Business();
        System.out.println(b1.id);
        System.out.println(b1.name);
        Business b2=new Business();
        System.out.println(b2.name);
        b1.id=101;  
        b1.name="Sonoo";  
        b2.id=102;  
        b2.name="Amit"; 
        System.out.println(b2.name);
        System.out.println(b1.id);
        System.out.println(b1.name);
    }
}