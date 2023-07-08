package synchronized_impl;

class Singleton {
 
    private static Singleton obj;

    private Singleton() {}

    // Only one thread can execute
    public static synchronized Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }
}
