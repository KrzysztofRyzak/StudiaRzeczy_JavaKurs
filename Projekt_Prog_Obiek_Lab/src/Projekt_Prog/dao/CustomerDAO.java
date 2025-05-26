package Projekt_Prog.dao;


import Projekt_Prog.DatabaseConnection;
import Projekt_Prog.data.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO extends AbstractDAO<Customer> {

    private static final Connection dbConnection = DatabaseConnection.getConnection();

    @Override
    public List<Customer> readItems() {
        List<Customer> customers = new ArrayList<>();
        String query = "SELECT * from customers";
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setId(resultSet.getInt("id"));
                customer.setAddress(resultSet.getString("address"));
                customer.setFirstName(resultSet.getString("firstname"));
                customer.setLastName(resultSet.getString("lastname"));
                customers.add(customer);
            }
        } catch (SQLException e) {
            System.out.println("Wystapil blad w CustomerDAO:readItems: " + e.getMessage());
        }
        return customers;
    }

    @Override
    public Customer readItem(int id) {
        String query = "SELECT * from customers WHERE customers.id = " + id;
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                Customer customer = new Customer();
                customer.setId(resultSet.getInt("id"));
                customer.setAddress(resultSet.getString("address"));
                customer.setFirstName(resultSet.getString("firstname"));
                customer.setLastName(resultSet.getString("lastname"));
                return customer;
            }
        } catch (SQLException e) {
            System.out.println("Wystapil blad w CustomerDAO:readItem: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void createItem(Customer item) {
        String query = "INSERT INTO customers(firstname, lastname, address) " +
                "values('" + item.getFirstName() + "', '" + item.getLastName() + "', '" + item.getAddress() + "')";
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Wystapil blad w CustomerDAO:createItem: " + e.getMessage());
        }
    }

    @Override
    public void updateItem(Customer item) {
        String query = "UPDATE customers " +
                "SET firstname = '" + item.getFirstName() + "', lastname = '" + item.getLastName() + "', address = '" + item.getAddress() + "' " +
                "WHERE id = " + item.getId();
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Wystapil blad w CustomerDAO:updateItem: " + e.getMessage());
        }
    }

    @Override
    public void deleteItem(int id) {
        String query = "DELETE FROM customers WHERE id = " + id;
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Wystapil blad w CustomerDAO:deleteItem: " + e.getMessage());
        }
    }
}