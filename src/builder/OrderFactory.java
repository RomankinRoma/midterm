package builder;

import MedCenter.*;

public class OrderFactory {
    private static OrderFactory orderFactory;

    public OrderFactory() {
    }

    public static Order createSimpleOrder(Integer id, String address, String date, MedCenter medCenter){
        Order order=new Order.OrderBuilder(id, address, date, medCenter).createOrder();
        return order;
    }

    public static Order createOrderWithMedicine(Integer id, String address, String date, MedCenter medCenter, Boolean medicine){
        Order order=new Order.OrderBuilder(id, address, date, medCenter).withMedicine(true).createOrder();
        return order;
    }

    public static Order createOrderWithFood(Integer id, String address, String date, MedCenter medCenter, Boolean food){
        Order order=new Order.OrderBuilder(id, address, date, medCenter).withFood(true).createOrder();
        return order;
    }

    public static Order createOrderWithFoodAndMedicine(Integer id, String address, String date, MedCenter medCenter, Boolean medicine, Boolean food){
        Order order=new Order.OrderBuilder(id, address, date, medCenter).withFood(true).withMedicine(true).createOrder();
        return order;
    }
}
