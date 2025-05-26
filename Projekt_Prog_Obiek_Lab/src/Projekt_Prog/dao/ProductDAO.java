package Projekt_Prog.dao;

import Projekt_Prog.DatabaseConnection;
import Projekt_Prog.data.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductDAO extends AbstractDAO<Product> {

    private static final Connection dbConnection = DatabaseConnection.getConnection();

    @Override
    public List<Product> readItems() {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * from products";
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                products.add(product);
            }
        } catch (SQLException e) {
            System.out.println("Wystapil blad w ProductDAO:readItems: " + e.getMessage());
        }
        return products;
    }

    @Override
    public Product readItem(int id) {
        String query = "SELECT * from products WHERE products.id = " + id;
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                Product prod = new Product();
                prod.setId(resultSet.getInt("id"));
                prod.setName(resultSet.getString("name"));
                prod.setPrice(resultSet.getDouble("price"));
                return prod;
            }
        } catch (SQLException e) {
            System.out.println("Wystapil blad w ProductDAO:readItem: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void createItem(Product item) {
        String query = "INSERT INTO products(name, price) " +
                "values('" + item.getName() + "', '" + item.getPrice() + "')";
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Wystapil blad w ProductDAO:createItem: " + e.getMessage());
        }
    }

    @Override
    public void updateItem(Product item) {
        String query = "UPDATE products " +
                "SET name = '" + item.getName() + "', price = '" + item.getPrice() + "' " +
                "WHERE id = " + item.getId();
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Wystapil blad w ProductDAO:updateItem: " + e.getMessage());
        }
    }

    @Override
    public void deleteItem(int id) {
        String query = "DELETE FROM products WHERE id = " + id;
        try {
            PreparedStatement statement = dbConnection.prepareStatement(query);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Wystapil blad w ProductDAO:deleteItem: " + e.getMessage());
        }
    }
}
