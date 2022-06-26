public class Copy
{
private int a; private int b;
public Copy()
{
this.a=111;
this.b=222;
}
public Copy (Copy obj) 
{
a=obj.a;b=obj.b;

}
public static void main(String[] args)
{
Copy obj= new Copy();
Copy obj1= new Copy(obj); System.out.println("--");
System.out.println("Obj.a is="+ obj.a);
System.out.println("Obj.b_is=" +obj.b);
System.out.println("--");
System.out.println("Obj1.a is="+ obj1.a); System.out.println("Obj1.b is=" +obj1.b);
}}