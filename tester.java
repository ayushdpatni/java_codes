public class tester {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.getInput();
        float base = t.getA();
        float height = t.getB();
        t.setArea(base, height);

        square s = new square();
        s.setArea(t.getA());

        Circle c = new Circle();
        // float radius = t.getA();
        c.setArea(t.getB());
    }
}
