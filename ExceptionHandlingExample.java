public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Handling NullPointerException
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after NullPointerException handling.");
        }

        try {
            // Handling ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after ArrayIndexOutOfBoundsException handling.");
        }
    }
}
