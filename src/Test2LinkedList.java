import java.util.LinkedList;
import java.util.Scanner;

public class Test2LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList myll = new LinkedList();

        for(int i=1; i <=5;i++) {
            String item = sc.next();

            if(myll.contains(item)) {
                continue;

            }
            myll.add(item);
        }
        System.out.println(myll);

    }
}
