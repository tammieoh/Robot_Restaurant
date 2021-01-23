import java.util.*;

public class Robot {
    int id;
    ArrayList<Customer> customers = new ArrayList<>();
    HashMap<Customer, ArrayList<Food>> orders = new HashMap<Customer, ArrayList<Food>>();

    // default constructor
    public Robot() {

    }
    public Robot(int id, ArrayList<Customer> customers) {
        this.id = id;
        this.customers = customers;
    }
//    public Robot(int id, HashMap<Customer, ArrayList<Food>> orders) {
//        this.id = id;
//        this.orders = orders;
//    }

    // methods
    // get customer's orders and store each food into the values
    // customers can only order 1 food at a time
    public void orderFood(Customer customer, Food food) {
        // if customer is new, initialize new array list with first food item
        if(!orders.containsKey(customer)) {
            orders.put(customer, new ArrayList<Food>() {{
                    add(food);
                }}
            );
        }
        // if customer already ordered and wants to order again
        // update array list
        else {
            orders.get(customer).add(food);
        }
    }

    // calculate the total cost for each customer
    // if customers do not exist, in the hash map (aka they didn't order anything)
    // return 0
    public double calculateTotal(Customer customer) {
        double total = 0;
        if(!orders.containsKey(customer)) {
            return 0;
        }
        else {
            for(int i = 0; i < orders.get(customer).size(); i++) {
                total += orders.get(customer).get(i).price;
            }
        }
        return total;
    }
    // function to remove customer
    // take their order and store in hash map
    // key = customer
    // value = arraylist of orders [name, price], [name,price]
    // keep track of their total


}
