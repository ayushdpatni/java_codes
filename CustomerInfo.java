public class CustomerInfo {
    int id;
    String name;  
    int billvalue;
    static int bill;
    CustomerInfo(String name,int billvalue){
        this.id=bill;
        this.name=name;
        this.billvalue=billvalue;
        bill++;
    }
    static{
        bill=1001;
    }
    public static void main(String args[]){  
    CustomerInfo c1=new CustomerInfo("Rohit",1200);
    System.out.println("Bill Id: "+"V"+c1.id+"\nName of Customer: "+c1.name+"\nTotal Bill= "+c1.billvalue+"\n");
    CustomerInfo c2=new CustomerInfo("Sayali",1520);
    System.out.println("Bill Id: "+"V"+c2.id+"\nName of Customer: "+c2.name+"\nTotal Bill= "+c2.billvalue+"\n");
    }
}
