// import javax.sound.sampled.SourceDataLine;

class practice {
    int id;
    String name;
    String branchName;
    int phoneNo;
    static int r;

    practice(String name, int phoneNo, String branchName) {
        this.id = r;
        this.name = name;
        this.branchName = branchName;
        this.phoneNo = phoneNo;
        r++;
    }

    static {
        r = 1001;
    }

    public static void main(String args[]) {
        practice s1 = new practice("Rohit", 1234567889, "Computer");
        System.out.println(
                "Roll No.:" + "D" + s1.id + "\nName of student: " + s1.name + "\nBranch Name: " + s1.branchName);
        System.out.println("Hi " + s1.name + "! Your Registration Id is " + s1.id + ".");

        practice s2 = new practice("Sayali", 1988612300, "Mechanical");
        System.out.println(
                "Roll No.:" + "D" + s2.id + "\nName of student: " + s2.name + "\nBranch Name: " + s2.branchName);
        System.out.println("Hi " + s2.name + "! Your Registration Id is " + s2.id + ".");
    }
}