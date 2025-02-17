// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main Class to Demonstrate Custom Exception
public class CustomException {
    // Method to check age validity
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to proceed.");
        } else {
            System.out.println("Access granted. You are eligible.");
        }
    }

    public static void main(String[] args) {
        try {
            int userAge = 16; // Test with an invalid age
            validateAge(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Age validation process completed.");
        }
    }
}
