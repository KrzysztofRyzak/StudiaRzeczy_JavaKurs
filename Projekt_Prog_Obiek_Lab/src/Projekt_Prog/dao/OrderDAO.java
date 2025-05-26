package Projekt_Prog.dao;


import Projekt_Prog.DatabaseConnection;
import Projekt_Prog.data.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO extends AbstractDAO<Order> {

    private static final Connection dbConnection = DatabaseConnection.getConnection();

    @Override
    public List<Order> readItems() {
        List<Order> orders = new ArrayList<>();
        String query = "SELECT * from orders";
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Order order = new Order();
                order.setId(resultSet.getInt("id"));
                order.setCustomerId(resultSet.getInt("customer_id"));
                order.setProductId(resultSet.getInt("product_id"));
                order.setQuantity(resultSet.getInt("quantity"));
                orders.add(order);
            }
        } catch (SQLException e) {
            System.out.println("Wystapil blad w OrderDAO:readItems: " + e.getMessage());
        }
        return orders;
    }

    @Override
    public Order readItem(int id) {
        String query = "SELECT * from orders WHERE orders.id = " + id;
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                Order order = new Order();
                order.setId(resultSet.getInt("id"));
                order.setCustomerId(resultSet.getInt("customer_id"));
                order.setProductId(resultSet.getInt("product_id"));
                order.setQuantity(resultSet.getInt("quantity"));
                return order;
            }
        } catch (SQLException e) {
            System.out.println("Wystapil blad w OrderDAO:readItem: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void createItem(Order item) {
        String query = "INSERT INTO orders(customer_id, product_id, quantity) " +
                "values('" + item.getCustomerId() + "', '" + item.getProductId() + "', '" + item.getQuantity() + "')";
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Wystapil blad w OrderDAO:createItem: " + e.getMessage());
        }
    }

    @Override
    public void updateItem(Order item) {
        String query = "UPDATE customers " +
                "SET customer_id = '" + item.getCustomerId() + "', product_id = '" + item.getProductId() + "', quantity = '" + item.getQuantity() + "' " +
                "WHERE id = " + item.getId();
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Wystapil blad w OrderDAO:updateItem: " + e.getMessage());
        }
    }

    @Override
    public void deleteItem(int id) {
        String query = "DELETE FROM orders WHERE id = " + id;
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Wystapil blad w OrderDAO:deleteItem: " + e.getMessage());
        }
    }
}