package locking;

class Singleton {

    private static volatile Singleton obj = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (obj == null) {
            // To make thread safe
            synchronized (Singleton.class) {
                // check again
                if (obj == null) {
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }
}

/**
 * Method is declared 'volatile' - Ensures multiple threads offer the obj variable correctly when being initialized to Singleton instance.
 * Reduces the overgead of calling the synchronized method every time
 */
