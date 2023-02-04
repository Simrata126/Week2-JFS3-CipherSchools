import java.util.HashSet;

public class Test3Hashset {
    public static void main(String[] args) {

        HashSet myhs = new HashSet();

        myhs.add("Red");
        myhs.add("Orange");
        myhs.add("Red");
        myhs.add("Pink");
        myhs.add("Black");

        System.out.println(myhs);

    }
}
