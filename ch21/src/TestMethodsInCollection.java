public class TestMethodsInCollection {
    public static void main(String[] args) {
        // Create set1
        java.util.Set<String> set1 = new java.util.HashSet<>();

        // Add strings to set1
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");

        System.out.println("set1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        // Delete  string from set1
        set1.remove("London");
        System.out.println("\nset1 is " + set1);
        System.out.println(set1.size() + " elements in set1");
    }
}
