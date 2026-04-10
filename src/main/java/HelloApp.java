public class HelloApp {
    public static void main(String[] args) {
        // Check if any arguments were provided
        if (args.length > 0) {
            // Access the first element of the array
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Fallback for UC1 behavior (Default Value)
            System.out.println("Hello, World!");
        }
    }
}