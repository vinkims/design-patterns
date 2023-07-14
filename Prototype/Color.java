// Cloneable - Allows implementing class to have its objects to be cloned.
abstract class Color implements Cloneable {

    protected String colorName;

    abstract void addColor();

    public Object clone() {

        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}