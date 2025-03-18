public class VariableScope {
    // Global variable (accessible throughout the class)
    static int globalCount = 100;

    public static void main(String[] args) {
        // Access the global variable in the main method
        System.out.println("Global Count (from main): " + globalCount);

        // Call the showScope method
        showScope();
    }

    // Method to demonstrate variable scope
    public static void showScope() {
        // Local variable (accessible only within this method)
        int localCount = 50;

        // Access the global variable in the showScope method
        System.out.println("Global Count (from showScope): " + globalCount);

        // Access the local variable in the showScope method
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
