public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            // Default message if no names are provided
            System.out.println("Hello, World!");
        } else {
            // Print the start of the greeting
            System.out.print("Hello,");
            
            // The Enhanced For Loop
            for (String arg : args) {
                System.out.print(" " + arg);
            }
            
            // Print the exclamation mark and move to a new line
            System.out.println("!");
        }
    }
}