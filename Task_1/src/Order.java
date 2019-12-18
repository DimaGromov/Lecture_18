import java.util.HashMap;
import java.util.Map;

public class Order implements Comparable<Order> {
    private String name;
    private String bank;
    private Integer sum;
    private static Map<String, Integer> banks = new HashMap<String, Integer>() {{
        put("Sber", 1);
        put("Alpha", 2);
        put("Vtb", 3);
    }};


    Order(String name, String bank, Integer sum) {
        this.name = name;
        this.bank = bank;
        this.sum = sum;
    }

    String getName() {
        return name;
    }

    String getBank() {
        return bank;
    }

    Integer getSum() {
        return sum;
    }

    @Override
    public int compareTo(Order order) {
        if (!(this.sum.equals(order.sum))) {
            return this.sum.compareTo(order.sum);
        } else if (!(this.name.equals(order.name))) {
           return this.name.compareTo(order.name);
        } else if (!(this.bank.equals(order.bank))) {
            if (banks.get(this.bank).intValue() > banks.get(order.bank).intValue()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        String str = this.name + " " + this.bank + " " + this.sum;
        return str;
    }
}
