package StaticVaiable;

public class Counter {
    private static int count = 0; // Global variable
    private int localCount = 0;   // Local variable

    public Counter() {
        localCount = 0;
    }

    public void increment() {
        count++;         // Increment global count
        localCount++;    // Increment local count
    }

    public static int getTotalCount() {
        return count;     // Return global count
    }

    public int getLocalCount() {
        return localCount; // Return local count
    }
}