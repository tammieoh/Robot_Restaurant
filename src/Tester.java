import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Food f1 = new Food("Hamburger", 5.00);
        Food f2 = new Food("French Fries", 3.00);
        Food f3 = new Food("Ice Cream", 2.50);
        Food f4 = new Food("Coke", 1.50);

        Customer c1 = new Customer("Bob");
        Customer c2 = new Customer("Sam");
        Customer c3 = new Customer("Celia");
        Customer c4 = new Customer("Amy");
        Customer c5 = new Customer("Susan");


        Robot r1 = new Robot(1, new ArrayList<Customer>() {{
            add(c1);
            add(c3);
        }});
        Robot r2 = new Robot(2, new ArrayList<Customer>() {{
            add(c2);
        }});
        Robot r3 = new Robot(3, new ArrayList<Customer>() {{
            add(c4);
            add(c5);
        }});

        r1.orderFood(c1, f1); // bob = hamburger
        System.out.println(r1.calculateTotal(c1));
        r1.orderFood(c1, f2); // bob french fries
        r1.orderFood(c3, f3); // celia ice cream
        r1.orderFood(c3, f4); // celia coke
        System.out.println(r1.calculateTotal(c1));
        r2.orderFood(c2, f3);
        System.out.println(r1.calculateTotal(c3));
        System.out.println(r2.calculateTotal(c2));
        System.out.println(r3.calculateTotal(c5));

    }
}
