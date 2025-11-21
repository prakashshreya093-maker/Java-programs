import java.util.Scanner;
class Customer {     
String name;
int units;
Customer(String name, int units) {         
this.name = name;
this.units = units;
}
}
class ElectricityBill extends Customer {
ElectricityBill(String name, int units) {         
super(name, units);
}
double calculateBill() 
{       
  double bill = 0;
int u = units;
if (u <= 100) {
bill = u * 1.5;       
  } 
else if (u <= 200) {
bill = 100 * 1.5 + (u - 100) * 2.5;
} 
else if (u <= 300) {
bill = 100 * 1.5 + 100 * 2.5 + (u - 200) * 4;
}
 else {
bill = 100 * 1.5 + 100 * 2.5 + 100 * 4 + (u - 300) * 6;
}

return bill;
}

void displayBill() {
System.out.println("Customer Name: " + name);
System.out.println("Units Consumed: " + units);
System.out.println("Electricity Bill: Rs. " + calculateBill());
}
}

public class ElectricityBillTest {     
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter customer name: ");
String name = sc.nextLine();

System.out.print("Enter units consumed: ");
int units = sc.nextInt();

ElectricityBill bill = new ElectricityBill(name, units);        
 bill.displayBill();
}
}


