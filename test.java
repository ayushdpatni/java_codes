public class test {
    private int x;
    {
        System.out.println("Initialization Block: x= "+x);
        x=5;
        x++;
    }
    public test() {
        System.out.println("Constructor: x= "+x);
    }
    public static void main(String[] args) {
        test t1=new test();
        System.out.println(t1.x);
        test t2=new test();
        System.out.println(t2.x);
    }
}
