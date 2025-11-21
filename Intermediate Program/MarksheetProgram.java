public class MarksheetProgram {
    public static class Student {
        private String name;
        private int rollNo;
        public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        }
        public String getName() {
            return name;
        }
        public int getRollNo() {
            return rollNo;
        }
    }
    public static class Result {
        private Student student;
        private int m1, m2, m3;
        public Result(Student student, int m1, int m2, int m3) {
            this.student = student;
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }
        public void displayMarksheet() {
            int total = m1 + m2 + m3;
            double percentage = total / 3.0;
            System.out.println("----- STUDENT MARK SHEET -----");
            System.out.println("Name       : " + student.getName());
            System.out.println("Roll No    : " + student.getRollNo());
            System.out.println("Marks 1    : " + m1);
            System.out.println("Marks 2    : " + m2);
            System.out.println("Marks 3    : " + m3);
            System.out.println("-------------------------------");
            System.out.println("Total      : " + total);
            System.out.println("Percentage : " + percentage + "%");
            System.out.println("-------------------------------");

            if (percentage >= 60)
                System.out.println("Division   : First Division");
            else if (percentage >= 45)
                System.out.println("Division   : Second Division");
            else if (percentage >= 33)
                System.out.println("Division   : Third Division");
            else
                System.out.println("Division   : Fail");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Shreya", 101);
        Result r1 = new Result(s1, 85, 78, 90);
        r1.displayMarksheet();
    }
}
