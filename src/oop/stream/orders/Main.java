package oop.stream.orders;

import com.sun.source.doctree.CommentTree;

import javax.naming.ldap.Control;
import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Ivan Petrov", 3805552211l);
        Manager manager11 = new Manager("Ivan Petrov", 3805552211l);
        Manager manager2 = new Manager("Сергей Николаевич", 380998887766l);
        Manager manager3 = new Manager("Вася Иванов", 3803214576l);
        Manager manager4 = new Manager("Алина Сергеевна", 38012345678l);

        Client client1 = new Client("*********** ООО ПАТ Агросторй ***********", 80991112233l, "Poltava. Shevchenko 3, str", 10001);
        Client client2 = new Client("*********** ТОВ Уголь и металл **********", 8099555555l, "Донецк. Артема 5, str", 10002);
        Client client3 = new Client("******** Rozetka *********", 80991112233l, "Kyiv. Skymall", 10003);
        Client client4 = new Client("********* Comfy ************", 80991117733l, "Kyiv. River mall", 10004);

        //---------------------
        Product product1 = new Product(22.11, "Bread", "Poltava_Bread");
        Product product2 = new Product(33.33, "Butter", "Kharkyv_Butter");
        Product product3 = new Product(44.44, "Milk", "Mykolaiv_Milk");

        OrderItem orderItem1 = new OrderItem(20, product1);
        OrderItem orderItem2 = new OrderItem(30, product2);
        OrderItem orderItem3 = new OrderItem(40, product3);

        List<OrderItem> orderItemList1 = new ArrayList<>();
        Collections.addAll(orderItemList1, orderItem1, orderItem2, orderItem3);
        //-----------------------

        //-----------------------------------------------------------------------------
        Product product21 = new Product(221.41, "Мяч", "Детские игрушки");
        Product product22 = new Product(93.33, "Ракетка", "Импорт-Toys");
        Product product33 = new Product(10.44, "Шайба", "West-Market");

        OrderItem orderItem21 = new OrderItem(20, product21);
        OrderItem orderItem22 = new OrderItem(30, product22);
        OrderItem orderItem23 = new OrderItem(40, product33);

        List<OrderItem> orderItemList2 = new ArrayList<>();
        Collections.addAll(orderItemList2, orderItem21, orderItem22, orderItem23);
        //----------------------------------------------------------------------

        //------------------
        Product product31 = new Product(99.99, "Phone", "Iphone");
        OrderItem orderItem31 = new OrderItem(1, product31);
        List<OrderItem> orderItemList3 = new ArrayList<>();
        Collections.addAll(orderItemList3, orderItem31);
        //-------------

        //-----------
        Product product41 = new Product(3333, "MackBook Air", "Apple");
        OrderItem orderItem41 = new OrderItem(2, product41);
        List<OrderItem> orderItemList4 = new ArrayList<>();
        Collections.addAll(orderItemList4, orderItem41);
        //----------

        //-------
        Product product51 = new Product(1.99, "Phone", "Iphone");
        Product product52 = new Product(3333, "MackBook Air", "Apple");
        Product product53 = new Product(12.99, "HeadPhonse", "Apple");

        OrderItem orderItem51 = new OrderItem(1, product51);
        OrderItem orderItem52 = new OrderItem(1, product52);
        OrderItem orderItem53 = new OrderItem(1, product53);

        List<OrderItem> orderItemList5= new ArrayList<>();
        Collections.addAll(orderItemList5, orderItem51, orderItem52, orderItem53);
        //------

        //------
        Product productTest = new Product(22.11, "Bread", "Poltava_Bread");
        OrderItem orderItemTest = new OrderItem(20, productTest);
        List<OrderItem> orderItemListTest = new ArrayList<>();
        Collections.addAll(orderItemListTest, orderItemTest);

        Product product61 = new Product(99.99, "Phone", "Iphone");
        Product product62 = new Product(3333, "MackBook Air", "Apple");
        Product product63 = new Product(12.99, "HeadPhonse", "Apple");

        OrderItem orderItem61 = new OrderItem(1, product51);
        OrderItem orderItem62 = new OrderItem(1, product52);
        OrderItem orderItem63 = new OrderItem(1, product53);

        List<OrderItem> orderItemList6= new ArrayList<>();
        Collections.addAll(orderItemList6, orderItem61, orderItem62, orderItem63);
        //----

        //----
        Product product71 = new Product(1000.50, "Samsung Phone", "Samsung");
        OrderItem orderItem71 = new OrderItem(5, product71);
        List<OrderItem> orderItemList7= new ArrayList<>();
        Collections.addAll(orderItemList7, orderItem71);

        //--



        Date date1 = new Date(2022 - 1900, 10, 12);
        Date date2 = new Date(2021 - 1900, 3, 4);
        Date date3 = new Date(2020 - 1900, 1, 1);
        Date date4 = new Date(2019 - 1900, 2, 2);

        //////



        ////////////////////



        Order order1 = new Order(10001, date1, client1, manager1, orderItemList1);
        Order order2 = new Order(10002, date2, client2, manager2, orderItemList2);
        Order order3 = new Order(10003, date3, client3, manager3, orderItemList3);
        Order order4 = new Order(10004, date4, client4, manager4, orderItemList4);
        Order order5 = new Order(10005, date4, client2, manager1, orderItemList5);
        Order order6 = new Order(10006, date1, client2, manager2, orderItemList6);
        Order order7 = new Order(10007, date3, client3, manager3, orderItemList6);
        Order order8 = new Order(10007, date3, client3, manager3, orderItemList6);
        Order order9 = new Order(100013, date1, client1, manager1, orderItemList1);
        Order order10 = new Order(100099, date3, client1, manager11, orderItemList1);
        Order orderTest = new Order(100099, date3, client1, manager11,orderItemListTest);

        List<Order> orderList = new ArrayList<>();
        Collections.addAll(orderList, order1, order2, order3, order4, order5, order6, order7, order1, order6, order3,
                order3, order7, order8, order9, order10, orderTest);


        //Controller.removeDuplicateAndPrint(orderList);

        Order[] arrayOrder = orderList.toArray(new Order[1]);
        //System.out.println(Controller.convertArrayToListAndRemoveDuplicate(arrayOrder));

        //System.out.println(Arrays.toString(Controller.listToArrayRemoveDuplicate(orderList)));

        //System.out.println( Controller.getTotalErn(orderList));

        //System.out.println( Controller.getOrdersMoreThanSum(orderList, 7000.8));

        //System.out.println(Controller.clientOrder(orderList, client1));

        //System.out.println(Controller.ordersFromTo(orderList, date3, date1));
//
//        List<Client> clientList = new ArrayList<>();
//        Collections.addAll(clientList, client1, client2, client3, client4);

        //System.out.println(Controller.getMultipleOrder(orderList, clientList));

//        Order order = Controller.getVeryExpensiveOrder(orderList);
//        System.out.println(order);

//        List<Order> sortedDescList = Controller.sortDesc(orderList);
//        System.out.println(sortedDescList);

//        List<Order> orders = Controller.sortByDate(orderList);
//        System.out.println(orders);

//        Consumer<Order> orderConsumer = o -> System.out.println(o);
//        Controller.sortByManagerAndNumber(orderList, manager1).forEach(o -> System.out.println(o));
//

//        Product product = Controller.getVeryExpensiveProduct(orderList);
//        System.out.println(product);

//        List<Order>  orders = Controller.discount(orderList, 100.0, 0.1);
//        orders.forEach(o -> System.out.println(o));

//        Manager manager = Controller.getManagerVeryChipOrder(orderList);
//        System.out.println(manager);

//        List<Order> clientsOrders = Controller.getAllOrdersClients(orderList, client1);
//        clientsOrders.forEach(o -> System.out.println(o));
//
//        System.out.println();
//        double summ = Controller.ernSum(orderList, client1);
//        System.out.println(summ);

//        List<Client> clientList = Controller.getClientsList(orderList, 3000.0);
//        clientList.forEach(c -> System.out.println(c));

//        List<Manager> managerList = Controller.getManagerListFromDate(orderList, date4);
//        managerList.forEach(m -> System.out.println(m));

       // Controller.getManagerList(orderList, date4, date2).forEach(m -> System.out.println(m));

        //Controller.getProductList(orderList).forEach(p -> System.out.println(p));

//       Product cheepestProduct = Controller.getChipProduct(orderList);
//        System.out.println(cheepestProduct);

//        List<OrderItem> orderItemList = new ArrayList<>();
//        Collections.addAll(orderItemList, orderItem1, orderItem2);
//
//        Controller.getBreadAndButter(orderList, orderItemList).forEach( oi -> System.out.println(oi));





//        Controller.getOrdersWhereIsProduct(orderList, product1).forEach(oi -> System.out.println(oi));
//
//        System.out.println();
//        double sumProduct1 = Controller.getErnedSum(orderList, product1);
//        System.out.println("Summ " + product1 + " is " + sumProduct1);

//        Controller.getClientsListByAlphabet(orderList, 100.0, 4000.0)
//                .forEach(c -> System.out.println(c));

//        System.out.println();
//
//        Controller.getClientsListByAlphabetComparator(orderList, 100.0, 4000.0)
//                .forEach(c -> System.out.println(c));

        //Controller.getOrderByTitle(orderList, "Milk").forEach(o -> System.out.println(o));

//        Controller.getProductListWithDiscount(orderList).forEach(p -> System.out.println(p));
//        System.out.println();

  //      Controller.getProductListWithDiscount25(orderList, 200).forEach(p -> System.out.println(p));

//Controller.getAmountOrders(orderList).forEach((k, v) -> System.out.println(k + " " + v));

       // Controller.getListOrdersClients(orderList).forEach((k, v) -> System.out.println(k.getName() + "\n " + v ));

       // Controller.getHowMuchErn(orderList).forEach((c, d) -> System.out.println(c + " \n Заработали " + d));

//       Manager managerResult = Controller.getVeryResultManager(orderList);
//        System.out.println(managerResult);

//        Controller.getAllClientsManager(orderList).forEach((m, c) -> {
//            System.out.println(m + "\nКлиенты: ");
//            c.forEach(cl -> System.out.println(cl));
//        });

       // Controller.getAllOrdersClients1(orderList).forEach((c, o) -> System.out.println("Client " + c + " \n " + o));

       // Controller.getAmountEachClient(orderList).forEach((c, a) -> System.out.println(c + " \nКоличество заказов: " + a));

        //Controller.getProfitByManagerByDate(orderList, date4, date2).forEach((m, p) -> System.out.println(m + " \nПрофит :" + p.getSum()));

        Controller.getProfitByEachProduct(orderList).forEach((p, a) -> System.out.println(p + "\nProfit " + a.getSum()));


















    }
}
