package classic;

class Singleton {

    private static Singleton obj;

    // Private constructor to force use of getInstance() to create SIngelton object
    private Singleton() {}

    public static Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }
}

/**
 * The getInstance() method has been declared static so that it can be called without instantiating the class.
 * Lazy instantiation - SIngleton object is not created until we need it and call getInstance() method.
 * It is not thread safe.
 */