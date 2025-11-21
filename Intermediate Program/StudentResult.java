interface Student {
    void getDetails(String name, int rollNo);
}
interface Marks {
    void getMarks(int m1, int m2, int m3);
}
interface Result {
    void calculateResult();
}
class ResultSheet implements Student, Marks, Result {
    String name;
    int rollNo;
    int m1, m2, m3;
    double total, average;
    String grade;
    public void getDetails(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    public void getMarks(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public void calculateResult() {
        total = m1 + m2 + m3;
        average = total / 3.0;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 75) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }
        System.out.println("----- STUDENT RESULT SHEET -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("--------------------------------");
    }
}
public class StudentResult {
    public static void main(String[] args) {
        ResultSheet rs = new ResultSheet();
        rs.getDetails("Shreya Prakash", 101);
        rs.getMarks(85, 90, 80);
        rs.calculateResult();
    }
}

