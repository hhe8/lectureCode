/** Your job: Convert this into a generic Vessel so that TestGoalOne works.
 *  @author Josh Hug
 */

public class Vessel<K> {
    K occupant;

    public void put(K x) {
        occupant = x;
    }

    public K peek() {
        return occupant;
    }
}
