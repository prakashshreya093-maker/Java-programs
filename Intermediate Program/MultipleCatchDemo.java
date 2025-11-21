public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
            String str = null;
            System.out.println(str.length());
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds: " + e.getMessage());
        } 
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("General Exception Caught: " + e.getMessage());
        }
        System.out.println("Program continues normally...");
    }
}
