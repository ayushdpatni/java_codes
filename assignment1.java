class Participantid {
    static int counter;
    String RegId;
    private String name, branch;
    private long contactNumber;

    static {
        counter = 1000;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public void setcontactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public long getcontactNumber() {
        return this.contactNumber;
    }

    public void setbranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return this.branch;
    }

    public Participantid(String name, long contactNumber, String branch) {
        setname(name);
        setcontactNumber(contactNumber);
        setbranch(branch);
        counter++;
        RegId = "D"+counter;
    }
}

public class assignment1 {
    public static void main(String[] args) {
        Participantid Student1 = new Participantid("Rohit", 1234567890L, "Computer");
        System.out.println("Hi " + Student1.getname() + " Your RegistrationId is " + Student1.RegId);

        Participantid Student2 = new Participantid("Sayli", 1988612300L, "Mechanical");
        System.out.println("Hi " + Student2.getname() + " Your RegistrationId is " + Student2.RegId);

        Participantid Student3 = new Participantid("Rahul", 875985971L, "Computer");
        System.out.println("Hi " + Student3.getname() + " Your RegistrationId is " + Student3.RegId);
    }
}
