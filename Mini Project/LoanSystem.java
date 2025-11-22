import java.util.*;

class Customer {
    String name;
    int age;
    double income;
    int creditScore;
    double loanAmount;

    Customer(String name, int age, double income, int creditScore, double loanAmount) {
        this.name = name;
        this.age = age;
        this.income = income;
        this.creditScore = creditScore;
        this.loanAmount = loanAmount;
    }
}

class LoanEligibility {

    public boolean checkEligibility(Customer c) {
        boolean eligible = true;

        if (c.age < 21 || c.age > 60)
            eligible = false;

        if (c.income < 20000)
            eligible = false;

        if (c.creditScore < 650)
            eligible = false;

        if (c.loanAmount > c.income * 20)
            eligible = false;

        return eligible;
    }
}

class LoanCalculator {

    public double calculateEMI(double principal, double annualRate, int months) {
        double r = annualRate / (12 * 100);  
        return (principal * r * Math.pow(1 + r, months)) / (Math.pow(1 + r, months) - 1);
    }

    public void generateSchedule(double principal, double annualRate, int months) {
        double emi = calculateEMI(principal, annualRate, months);
        double balance = principal;
        double r = annualRate / (12 * 100);

        System.out.println("\n------ Repayment Schedule ------");
        System.out.printf("%-8s %-12s %-12s %-12s %-12s\n",
                "Month", "EMI", "Interest", "Principal", "Balance");

        for (int i = 1; i <= months; i++) {
            double interest = balance * r;
            double principalPaid = emi - interest;
            balance -= principalPaid;

            if (balance < 0) balance = 0;

            System.out.printf("%-8d %-12.2f %-12.2f %-12.2f %-12.2f\n",
                    i, emi, interest, principalPaid, balance);
        }
    }
}

public class LoanSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ Loan Eligibility & EMI System ------");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Credit Score (300-900): ");
        int credit = sc.nextInt();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        Customer c = new Customer(name, age, income, credit, loanAmount);
        LoanEligibility checker = new LoanEligibility();
        LoanCalculator calc = new LoanCalculator();

        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Check Eligibility");
            System.out.println("2. Estimate EMI");
            System.out.println("3. Show Repayment Schedule");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (checker.checkEligibility(c))
                        System.out.println("✔ Eligible for loan.");
                    else
                        System.out.println("✘ Not Eligible for loan.");
                    break;

                case 2:
                    System.out.print("Enter annual interest rate (%): ");
                    double rate = sc.nextDouble();
                    System.out.print("Enter tenure (in months): ");
                    int months = sc.nextInt();

                    double emi = calc.calculateEMI(c.loanAmount, rate, months);
                    System.out.println("Estimated EMI: ₹" + String.format("%.2f", emi));
                    break;

                case 3:
                    System.out.print("Enter annual interest rate (%): ");
                    rate = sc.nextDouble();
                    System.out.print("Enter tenure (in months): ");
                    months = sc.nextInt();

                    calc.generateSchedule(c.loanAmount, rate, months);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}


