public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            // Default message if no names are provided
            System.out.println("Hello, World!");
        } else {
            // Use String.join to elegantly combine the names with a space
            String names = String.join(" ", args);
            System.out.println("Hello, " + names + "!");
        }
    }
}