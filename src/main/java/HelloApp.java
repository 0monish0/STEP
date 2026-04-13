public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            // Default message if no names are provided
            System.out.println("Hello, World!");
        } else {
            String names = "";
            
            // The Enhanced For Loop
            for (String arg : args) {
                names += arg + " "; // Add the name and a space (the delimiter)
            }
            
            // Chop off the trailing space using substring
            names = names.substring(0, names.length() - 1);
            
            System.out.println("Hello, " + names + "!");
        }
    }
}