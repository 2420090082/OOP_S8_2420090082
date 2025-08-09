package task4;


public class Student {
	private int RollNumber;
    protected char Grade;
    public String name;

    public void setDetails(int RollNumber, char Grade, String name) {
        this.RollNumber = RollNumber;
        this.Grade = Grade;
        this.name = name;
    }
    public void showDetails() {
        System.out.println("Roll Number: " + RollNumber);
        System.out.println("Grade: " + Grade);
        System.out.println("name: " + name);
    }
}