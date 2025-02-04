import java.util.HashSet;

public class HashSet {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> cities = new HashSet<>();

        // Add five city names to the set (including a duplicate)
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("New York"); // Duplicate entry

        // Display the elements of the HashSet
        System.out.println("Cities in the HashSet:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Check if a particular city exists in the set
        String checkCity = "Chicago";
        if (cities.contains(checkCity)) {
            System.out.println(checkCity + " exists in the set.");
        } else {
            System.out.println(checkCity + " does not exist in the set.");
        }

        // Remove a city from the set
        cities.remove("Houston");
        
        // Display the updated HashSet
        System.out.println("Updated HashSet after removal:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
