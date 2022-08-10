package oop.stream.orders;

import com.sun.source.tree.UsesTree;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Controller {

    //принимаем список заказов, избавляемся от дубликатов и печатает каждый из заказов
    public static void removeDuplicateAndPrint(List<Order> orderList) {
        orderList.stream().distinct().forEach(order -> System.out.println(order));
        //distinct() - удалить дубликаты
        //forEach() - убтвает стрим
    }

    //принимаем массив заказов и избавляемся от дубликатов и возвращаем лист  заказов
    public static List<Order> convertArrayToListAndRemoveDuplicate(Order[] arrayOrders) {
        return Arrays.stream(arrayOrders).distinct().toList();
    }

    //принимаем список заказов, возвращаем массив  заказов без дубликатов
    public static Order[] listToArrayRemoveDuplicate(List<Order> orderList) {
        return orderList.stream().distinct().toArray(value -> new Order[value]);
    }

    // принимаем заказы, возвращаем заработанную на них сумму
    public static double getTotalErn(List<Order> orderList) {
        Wrapper wrapper = new Wrapper();
        orderList.stream().distinct().forEach(o -> wrapper.setSum(o.totalBill()));
        return wrapper.getSum();
    }

    //принимаем заказы и дабл число и возвращаем заказы, общая стоимость которых превышаеет это число
    public static List<Order> getOrdersMoreThanSum(List<Order> orderList, double sum) {
        return orderList.stream().distinct().filter(o -> o.totalBill() > sum).toList();
    }

    //принимаем заказы и клиента, возвращаем его заказы
    public static List<Order> clientOrder(List<Order> orderList, Client client) {
        return orderList.stream().distinct().filter(o -> o.getClient().equals(client)).toList();
    }

    //принимаем заказы  и 2 даты - с  и по какую вернуть заказы
    public static List<Order> ordersFromTo(List<Order> orderList, Date dateFrom, Date dateTo) {
//        Predicate<Order> predicate = o -> o.getDateOfOrder().before(dateTo);
//        Predicate<Order> predicate2 = o -> o.getDateOfOrder().after(dateFrom);
//          predicate = predicate.and(predicate2);

        return orderList.stream().distinct().filter(o -> o.getDateOfOrder().before(dateTo) && o.getDateOfOrder().after(dateFrom)).toList();
        //return orderList.stream().distinct().filter(predicate).toList();
        //return orderList.stream().distinct().filter(o -> o.getDateOfOrder().before(dateTo));

    }

    //принимаем заказы и список клиентов и возвращаем множество заказов этих клиентов
    public static Set<Order> getMultipleOrder(List<Order> orderList, List<Client> clientList) {
        return orderList.stream().filter(o -> clientList.contains(o.getClient())).collect(Collectors.toSet());
    }

    // принимаем заказы и находим самый дорогой заказ
    public static Order getVeryExpensiveOrder(List<Order> orderList) {
        return orderList.stream().max((o1, o2) -> Double.compare(o1.totalBill(), o2.totalBill())).get();
    }

    //принимаем заказы, возвращаем список заказов, отсортироваанный по убыванию сумм
    public static List<Order> sortDesc(List<Order> orderList) {
        return orderList.stream().distinct().sorted().toList();
    }

    //принимаем заказі, возвращает списрк заказов,  отсортир по датам
    public static List<Order> sortByDate(List<Order> orderList) {
        return orderList.stream().distinct().sorted((o1, o2) -> -o1.getDateOfOrder().compareTo(o2.getDateOfOrder())).toList();
    }

    // принимаем заказі, и менеджера и возвращаем все заказы оформленные этим менеджеров
    //отсортированные по возрастанию номеров
    public static List<Order> sortByManagerAndNumber(List<Order> orderList, Manager manager) {
        //Comparator<Order> comparator = (o1, o2) -> o1.getId() - o2.getId();
        return orderList.stream().distinct().filter(o -> o.getManager().equals(manager))
                .sorted((o1, o2) -> o1.getId() - o2.getId()).toList();
    }

    //принимаем заказы, возвращаем самый дорогой товар, что продавался
    public static Product getVeryExpensiveProduct(List<Order> orderList) {
        return orderList.stream()
                .distinct()
                .max((o1, o2) -> Double.compare(o1.getVeryExpensiveProduct().getPrice(), o2.getVeryExpensiveProduct().getPrice()))
                .get().getVeryExpensiveProduct();
    }

    // принимаем заказы, и делаем дискаунт на заказы, у которых сумма превышает переданную в ф-ю
    public static List<Order> discount(List<Order> orderList, double sum, double discount) {
        Consumer<Order> orderConsumer = o -> {
            double x = o.totalBill() > sum ? o.setDiscount(discount) : o.setDiscount(1);
        };

        return orderList.stream().distinct().peek(orderConsumer).toList();
    }

    // найти и возвратить менеджера, оформившего самый дешевый заказ
    public static Manager getManagerVeryChipOrder(List<Order> orderList) {
        return orderList.stream().distinct().min((o1, o2) -> Double.compare(o1.totalBill(), o2.totalBill())).get().getManager();
    }

    //принимаем заказы и клиента и возвращаем сумму, заработанную на данном клиенте (с помощью врапера)
    public static double ernSum(List<Order> orderList, Client client) {
        Wrapper wrapper = new Wrapper();
        orderList.stream().distinct().filter(o -> o.getClient().equals(client))
                .forEach(o -> wrapper.setSum(o.totalBill()));
        return wrapper.getSum();
    }

    // Получить все заказы конкретного клиента
    public static List<Order> getAllOrdersClients(List<Order> orderList, Client client) {
        return orderList.stream().distinct().filter(o -> o.getClient().equals(client)).toList();
    }

    //принимаем заказы и дабл число, возвращаем список клиентов, сделавших заказы на сумму, превышающую переданную
    public static List<Client> getClientsList(List<Order> orderList, double sum) {
        return orderList.stream().distinct().filter(o -> o.totalBill() > sum).map(o -> o.getClient()).distinct().toList();
    }

    //принимаем заказы и возвращаем списрк менеджеров, оформлявших заказы, начиная с такой-то даты, переданной в ф-ю
    public static List<Manager> getManagerListFromDate(List<Order> orderList, Date date) {
        return orderList.stream().distinct().filter(o -> o.getDateOfOrder().after(date)).map(o -> o.getManager())
                .distinct().toList();
    }

    //найти список менеджеров кот оформляли заказы в таком-то периоде
    public static List<Manager> getManagerList(List<Order> orderList, Date dateFrom, Date dateTo) {
        return orderList.stream().distinct().filter(o -> o.getDateOfOrder().before(dateTo) &&
                o.getDateOfOrder().after(dateFrom)).map(o -> o.getManager()).distinct().toList();
    }

    //принимаем заказы, просматриваем все товары, которые продавались (без дублей!)
    public static List<Product> getProductList(List<Order> orderList) {
        return orderList.stream().distinct().flatMap(o -> o.getOrderItemList().stream())
                .map(oi -> oi.getProduct()).distinct().toList();
    }

    //найти самій дорогой товар
    public static Product getVeryExpensiveProduct1(List<Order> orderList) {
        return orderList.stream().distinct().max((o1, o2) -> o1.compareTo(o2)).get().getVeryExpensiveProduct();
    }

    //самый дешевый
    public static Product getChipProduct(List<Order> orderList) {
        return orderList.stream().distinct().flatMap(o -> o.getOrderItemList().stream())
                .min((o1, o2) -> Double.compare(o1.getProductPrice(), o2.getProductPrice())).get().getProduct();
    }

    //принимаеем заказы и список товаров и возвращаем спмсок заказов в которых заказывался любой из этих товаров
    public static List<Order> getBreadAndButter(List<Order> orderList, List<OrderItem> orderItemList) {
        return orderList.stream().distinct().filter(o -> o.containsAnyOrderItem(orderItemList)).toList();
    }

    // возвращаем все завказы, где есть данные продукт
    public static List<OrderItem> getOrdersWhereIsProduct(List<Order> orderList, Product product) {
        return orderList.stream().distinct().flatMap(o -> o.getOrderItemList().stream())
                .filter(oi -> oi.getProduct().equals(product)).toList();
    }

    //возвращаем сумму, заработанную на конкретном товаре, передаваемом  в метод
    public static double getErnedSum(List<Order> orderList, Product product) {
        return orderList.stream().distinct().flatMap(o -> o.getOrderItemList().stream())
                .filter(oi -> oi.getProduct().equals(product)).map(oi -> oi.total()).reduce((d1, d2) -> d1 + d2).get();
    }

    //принимаем заказы и стринг. возвращаем заказы, в которых содердатся товары, начинающие в названиях на этот стринг
    public static List<Order> getOrderByTitle(List<Order> orderList, String title) {
        return orderList.stream().distinct().filter(o -> o.containsTitle(title)).toList();
    }

    //принимаем заказі и , 2 дабла (сумма от и до) и возвратить клиентов этих заказов в порядке алфавитном его имет
    public static List<Client> getClientsListByAlphabet(List<Order> orderList, double sumFrom, double sumTo) {
        return orderList.stream().distinct().filter(o -> o.totalBill() >= sumFrom && o.totalBill() <= sumTo)
                .map(o -> o.getClient()).distinct()
                .sorted().toList();
    }

    public static List<Client> getClientsListByAlphabetComparator(List<Order> orderList, double sumFrom, double sumTo) {
        return orderList.stream().distinct().filter(o -> o.totalBill() >= sumFrom && o.totalBill() <= sumTo)
                .map(o -> o.getClient()).distinct()
                .sorted(Comparator.comparing(Client::getName)).toList();
        //(o1, o2) -> o1.getName().compareTo(o2.getName())
    }

    //принимаем заказы и возвращаем список товаров и у товаров  с ценой
    // превыщающей переданнуб делаем уменьшенние цены на 25%
    public static List<Product> getProductListWithDiscount25(List<Order> orderList, double productPrice) {
        return orderList.stream().distinct().flatMap(o -> o.getOrderItemList().stream())
                .map(oi -> oi.getProduct()).distinct()
                .peek(p -> {
                    if (p.getPrice() > productPrice) {
                        p.setPriseWithDiscount(0.75);
                    }
                }).toList();
    }

    public static List<Product> getProductListWithDiscount(List<Order> orderList) {
        return orderList.stream().distinct().flatMap(o -> o.getOrderItemList().stream())
                .map(oi -> oi.getProduct()).distinct().toList();
    }

    //принимаем заказы, возвращаем количество заказов каждого клиента
    public static Map<Client, Integer> getAmountOrders(List<Order> orderList) {
        Map<Client, Integer> map = new HashMap<>();

        orderList.stream().distinct().forEach(o -> {
            Integer x = (!map.containsKey(o.getClient()) ? map.put(o.getClient(), 1) : map.put(o.getClient(), map.get(o.getClient()) + 1));
        });

        return map;
    }

    //принимаем заказі, возвращаем заказі каждого клиента
    public static Map<Client, List<Order>> getListOrdersClients(List<Order> orderList) {
        Map<Client, List<Order>> map = new HashMap<>();

        orderList.stream().distinct().forEach(o -> {
            if (!map.containsKey(o.getClient())) {
                map.put(o.getClient(), new ArrayList<>(Arrays.asList(o)));
            } else {
                List<Order> orders = map.get(o.getClient());
                orders.add(o);
                map.put(o.getClient(), orders);
            }
        });
        return map;
    }

    //сколько заработали на каждом клиенте?
    public static Map<Client, Double> getHowMuchErn(List<Order> orderList){
        Map<Client, Double> map = new HashMap<>();

        orderList.stream().distinct().forEach(o -> {
            if (!map.containsKey(o.getClient())){
                map.put(o.getClient(), o.totalBill());
            }else {
                double sum = map.get(o.getClient());
                map.put(o.getClient(), sum + o.totalBill());
            }
        });
        return map;
    }

    //найти самого результативного менеджела и возвратить его
    public static Manager getVeryResultManager(List<Order> orderList){
        HashMap<Manager, Double> map = new HashMap<>();

        orderList.stream().distinct().forEach(o -> {
            if (!map.containsKey(o.getManager())){
                map.put(o.getManager(), o.totalBill());
            } else {
                double total = map.get(o.getManager());
                map.put(o.getManager(), total + o.totalBill());
            }
        });

       map.entrySet().stream().forEach(m -> System.out.println(m));
        System.out.println();

       return map.entrySet().stream().max((m1,m2) -> m1.getValue().compareTo(m2.getValue())).get().getKey();
    }

    //просмотреть всех клиентов по каждому менеджеру
    public static Map<Manager, Set<Client>> getAllClientsManager(List<Order> orderList){
        Map<Manager, Set<Client>> map = new HashMap<>();

        orderList.stream().distinct().forEach(o -> {
            if (!map.containsKey(o.getManager())){
                map.put(o.getManager(), new HashSet<>(Arrays.asList(o.getClient())));
            } else {
                Set<Client> temp = map.get(o.getManager());
                temp.add(o.getClient());
            }
        });
        return map;
    }
    //Просмотреть все заказы каждого клиента
    public static Map<Client, List<Order>> getAllOrdersClients1(List<Order> orderList){
        return orderList.stream().distinct().collect(Collectors.groupingBy(o -> o.getClient()));
    }

    //принимаем заказы, возвращаем заработанные каждым менеджером суммы
    public static Map<Manager, DoubleSummaryStatistics> getTotalProfitByManager(List<Order> orderList){
        return orderList.stream()
                .distinct()
                .collect(Collectors.groupingBy(o -> o.getManager(), Collectors.summarizingDouble(o -> o.totalBill())));
    }
    //принимаем заказы, возвращаем количество заказов каждого клиента
    public static Map<Client, Long> getAmountEachClient(List<Order> orderList){
        //Map<Client, Integer> map = new HashMap<>();

       return orderList.stream().distinct().collect(Collectors.groupingBy(o -> o.getClient(), Collectors.counting()));

//        orderList.stream().distinct().forEach(o -> {
//            if (!map.containsKey(o.getClient())){
//                map.put(o.getClient(), 1);
//            } else {
//                map.put(o.getClient(), map.get(o.getClient()) + 1);
//            }
//        });
//        return map;
    }
    //принимаем заказы, находим заработанные каждым менеджером суммы за период
    public static Map<Manager, DoubleSummaryStatistics> getProfitByManagerByDate(List<Order> orderList, Date dateFrom, Date dateTo){

        return orderList.stream().distinct()
                .filter(o -> o.getDateOfOrder().before(dateTo) && o.getDateOfOrder().after(dateFrom))
                .collect(Collectors.groupingBy(o -> o.getManager(), Collectors.summarizingDouble(o -> o.totalBill())));
    }

    //принимаем заказы, находим суммы, заработанные по каждому товару
    public static Map<Product, DoubleSummaryStatistics> getProfitByEachProduct(List<Order> orderList){
        //Map<Product, Double> map = new HashMap<>();

//        orderList.stream().distinct().flatMap(o -> o.getOrderItemList().stream())
//                .forEach(oi -> {
//                    if (!map.containsKey(oi.getProduct())){
//                        map.put(oi.getProduct(), oi.total());
//                    } else {
//                        map.put(oi.getProduct(), map.get(oi.getProduct()) + oi.total());
//                    }
//                });
//
//        return map;

        return orderList.stream().distinct().flatMap(o -> o.getOrderItemList().stream())
                .collect(Collectors.groupingBy(oi -> oi.getProduct(), Collectors.summarizingDouble(oi -> oi.total())));
    }



















}
