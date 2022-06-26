/**
 * sample
 */
class sample {
    static int id = 100;
    String country;
}

public class practice7 {
    public static void main(String[] args) {
        sample s1 = new sample();
        System.out.println(sample.id);// static variable use
        System.out.println(s1.country);
        s1.country = "England";
        System.out.println(s1.country);
    }
}
