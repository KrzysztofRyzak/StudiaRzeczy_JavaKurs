package Projekt_Prog.manager;

import Projekt_Prog.dao.OrderDAO;
import Projekt_Prog.data.Order;

import java.util.List;
import java.util.Scanner;

public class OrderManager implements SimpleManager {

    private final Scanner scanner = new Scanner(System.in);

    private final OrderDAO orderDAO = new OrderDAO();

    @Override
    public void print() {
        System.out.println("Podaj id zamówienia do wyświetlenia:");
        String id = scanner.nextLine();

        Order displayedOrder = orderDAO.readItem(Integer.parseInt(id));
        if (displayedOrder == null) {
            System.out.println("Nie znaleziono zamówienia o podanym id");
            return;
        }

        System.out.println(displayedOrder);
    }

    @Override
    public void printAll() {
        List<Order> orders = orderDAO.readItems();
        System.out.println(orders);
    }

    @Override
    public void delete() {
        System.out.println("Podaj id zamówienia do usunięcia:");
        String id = scanner.nextLine();

        orderDAO.deleteItem(Integer.parseInt(id));
        System.out.println("Usunięto zamówienie o id: " + id);
    }

    @Override
    public void update() {
        System.out.println("Podaj id zamówienia do edycji:");
        String id = scanner.nextLine();

        Order existingOrder = orderDAO.readItem(Integer.parseInt(id));
        if (existingOrder == null) {
            System.out.println("Nie znaleziono zamówienia o podanym id");
            return;
        }

        System.out.println("Podaj nowe id klienta:");
        String customerId = scanner.nextLine();
        System.out.println("Podaj nowe id produktu:");
        String productId = scanner.nextLine();
        System.out.println("Podaj nową ilość:");
        String quantity = scanner.nextLine();

        existingOrder.setCustomerId(Integer.parseInt(customerId));
        existingOrder.setProductId(Integer.parseInt(productId));
        existingOrder.setQuantity(Integer.parseInt(quantity));

        orderDAO.updateItem(existingOrder);
        System.out.println("Zaktualizowano zamówienie: " + existingOrder);
    }

    @Override
    public void add() {
        System.out.println("Podaj id klienta:");
        String customerId = scanner.nextLine();
        System.out.println("Podaj id produktu:");
        String productId = scanner.nextLine();
        System.out.println("Podaj ilość:");
        String quantity = scanner.nextLine();

        Order order = new Order(Integer.parseInt(customerId), Integer.parseInt(productId), Integer.parseInt(quantity));
        orderDAO.createItem(order);
        System.out.println("Dodano zamówienie: " + order);
    }
}
