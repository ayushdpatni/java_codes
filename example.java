public class example {//inheritence example with person.java,student.java,example.java
    public static void main(String[] args) {
        student s1 =new student();
        s1.setRollno(12011056);
        s1.setName("Rahul");
        s1.setAge(18);
        System.out.println(s1.getAge()+" "+s1.getName()+" "+s1.getRollno());
    }
}
