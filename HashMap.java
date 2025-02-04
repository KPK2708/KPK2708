import java.util.HashMap;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        // Create a HashMap to store student roll numbers and names
        HashMap<Integer, String> students = new HashMap<>();

        // Insert five student records
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Eve");

        // Retrieve and display the name of a student using a specific roll number
        int rollNumber = 103;
        if (students.containsKey(rollNumber)) {
            System.out.println("Student with roll number " + rollNumber + ": " + students.get(rollNumber));
        } else {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }

        // Remove a student entry using a roll number
        students.remove(104);

        // Display all student records
        System.out.println("All student records:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
