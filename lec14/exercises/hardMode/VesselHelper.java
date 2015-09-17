/** Does stuff with vessels in a contrived manner to draw out
 *  annoying themes with Generics.
 *  @author Josh Hug
 */

/* Methods can have type parameters too!
 * Specify them BEFORE the return type of the method. */

public class VesselHelper{
    /* Remove the item from the vessel and return it. */
    // care here for static method generics need to pass in
    // the type parameter.
    public static <K> K remove(Vessel<K> v) {
        K rVal = v.peek();
        v.put(null); // displace the occupant.
        return rVal;
    }

    public static <K extends Comparable<K>> K max(Vessel<K> x, Vessel<K> y) {
        K xVal = x.peek();
        K yVal = y.peek();
        if (xVal.compareTo(yVal) > 0) {
            return xVal;
        }
        return yVal;
    }

    public static double ratio(Vessel<? extends Number> x, Vessel<? extends Number> y) {
        return (x.peek().doubleValue()) / (y.peek().doubleValue());
    }
}
