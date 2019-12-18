/*
        Задача.
        - Создайте класс Order с полями "имя", "банк"(Sber, Alpha, Vtb) и сумма.

        - Меньший Order тот, у которого сумма меньше, если же суммы одинаковы, то
          меньший тот, у которого "имя" в словаре будет идти первым. Если же и это
          одинаково, то сначала идёт Sber, потом Alpha, потом Vtb.

        - Добавьте в Set N элементов, которые комбинировали бы в себе различные
          ситуации.

        - Выведите на экран.
 */

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Start {
    public static void main(String[] args) {
        Order order1 = new Order("A", "Alpha", 400);
        Order order2 = new Order("B", "Sber", 400);
        Order order3 = new Order("Z", "Alpha", 500);
        Order order4 = new Order("Z", "Sber", 500);
        Order order5 = new Order("D", "Vtb", 300);




        Set<Order> orderSet = new TreeSet<>();
        orderSet.add(order1);
        orderSet.add(order2);
        orderSet.add(order3);
        orderSet.add(order4);
        orderSet.add(order5);

        System.out.println(orderSet);


    }
}
