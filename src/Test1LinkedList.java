import java.util.LinkedList;

public class Test1LinkedList {

    public static void main(String[] args) {
        LinkedList myll = new LinkedList();

        myll.push("ironman");
        myll.push("thor");
        myll.push("thanos");

        System.out.println(myll.pop());

        System.out.println(myll);
    }
}
