import java.util.ArrayList;
import java.util.Comparator;

public class Test0Collections {
    public static void main(String[] args) {
        ArrayList<String> states  = new ArrayList<>();

        states.add("california");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");

        System.out.println("ArrayList: " + states);

        states.set(2,"Texas");
        System.out.println("After updation : " + states);

        String t = states.remove(3);

        System.out.println("State removed is " +t);

        states.sort(Comparator.naturalOrder());

        System.out.println("ArrayList after sorting " + states);

        System.out.println("Is NewYork There ? "  + states.contains("newyork"));

        System.out.println("Texas is at " + states.indexOf("Texas")+" index");

        System.out.println("Is list empty ? " + states.isEmpty());

        states.removeAll(states);

        System.out.println("Is list empty ? " + states.isEmpty());

    }
}
