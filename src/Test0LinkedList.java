import java.util.LinkedList;
import java.util.Iterator;

public class Test0LinkedList {
    public static void main(String[] args) {


        LinkedList myll = new LinkedList();

        myll.add("Ironman");
        myll.add("Thor");
        myll.add("Hulk");
        myll.add("Loki");

       // System.out.println(myll.get(1));

        myll.addLast("Gamora");
        myll.addFirst("Antman");
        myll.add(2,"Natasha");

        Iterator it = myll.iterator();

        while(it.hasNext()) {
        //    it.remove();
            System.out.println(it.next());
        }
            //while loop is needed with iterators to access the elements else we can't
            System.out.println("_______________");
            System.out.println("Whos at the top" + myll.peek());
            //peek returns first element
            System.out.println("hey first one get out" + myll.poll());
            //poll returns and removes the first element

            System.out.println("who's their standing at the last : " +myll.pop());
            System.out.println("__________________");
         it = myll.iterator();

        while(it.hasNext()) {
          //  it.remove();
            System.out.println(it.next());


        }
        }
    }

