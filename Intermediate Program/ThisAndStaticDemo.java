class Student {
    String name;
    int age;
    static String college = "ABC University";
    Student(String name, int age) {
        this.name = name;  
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("College: " + college);
        System.out.println("----------------------");
    }
    static void changeCollege(String newCollege) {
        college = newCollege;
    }
}
public class ThisAndStaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);
        s1.display();
        s2.display();
        Student.changeCollege("XYZ Institute");
        s1.display();
        s2.display();
    }
}
