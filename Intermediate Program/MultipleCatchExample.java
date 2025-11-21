import java.util.Scanner;
public class MultipleCatchExample {     
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

try {
System.out.print("Enter an integer: ");  
  int num1 = sc.nextInt();

System.out.print("Enter another integer: ");
int num2 = sc.nextInt();

int result = num1 / num2; 
System.out.println("Division Result: " + result);

int[] arr = new int[3];
arr[5] = 10; 

} 
catch (ArithmeticException e) {
System.out.println("Error: Division by zero is not allowed!");
}
 catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Error: Array index out of bounds!");
} 
catch (Exception e) {
System.out.println("Error: Some other exception occurred.");
}

System.out.println("Program continues after handling exceptions.");
}
}

