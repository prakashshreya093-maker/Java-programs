class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); 
    }
}
public class CustomExceptionDemo{
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age below 18 is not allowed to vote!");
        } else {
            System.out.println("Eligible to vote!");
        }
    }
    public static void main(String[] args) {
        try{
            checkAge(15); 
        } 
        catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Program execution completed.");
        }
    }
}
