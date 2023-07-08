package eager;

class Singleton {
    
    private static Singleton obj = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return obj;
    }
}

/**
 * JVM executes static initializer when the class is loaded and hence guaranteed to be thread safe.
 * Used when class is light and is used throughout the execution of the program.
 */