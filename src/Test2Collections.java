import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test2Collections {


    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        Product p = new Product();
        p.title="xmen";
        p.price=333;
        products.add(p);


    }
}
class Product {
    String title;
    int price;



}

