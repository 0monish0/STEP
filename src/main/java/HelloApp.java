public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Join all provided names with a space
            String allNames = String.join(" ", args);
            System.out.println("Hello, " + allNames + "!");
        } else {
            // Default message if no names are provided
            System.out.println("Hello, World!");
        }
    }
}