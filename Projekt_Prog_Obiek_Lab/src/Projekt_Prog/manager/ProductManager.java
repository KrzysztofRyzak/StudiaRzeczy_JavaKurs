package Projekt_Prog.manager;

import Projekt_Prog.dao.ProductDAO;
import Projekt_Prog.data.Product;

import java.util.List;
import java.util.Scanner;

public class ProductManager implements SimpleManager {

    private final Scanner scanner = new Scanner(System.in);

    private final ProductDAO productDAO = new ProductDAO();

    @Override
    public void print() {
        System.out.println("Podaj id produktu do wyświetlenia:");
        String id = scanner.nextLine();

        Product displayedProduct = productDAO.readItem(Integer.parseInt(id));
        if (displayedProduct == null) {
            System.out.println("Nie znaleziono produktu o podanym id");
            return;
        }

        System.out.println(displayedProduct);
    }

    @Override
    public void printAll() {
        List<Product> products = productDAO.readItems();
        System.out.println(products);
    }

    @Override
    public void delete() {
        System.out.println("Podaj id produktu do usunięcia:");
        String id = scanner.nextLine();

        productDAO.deleteItem(Integer.parseInt(id));
        System.out.println("Usunięto produkt o id: " + id);
    }

    @Override
    public void update() {
        System.out.println("Podaj id produktu do edycji:");
        String id = scanner.nextLine();

        Product existingProduct = productDAO.readItem(Integer.parseInt(id));
        if (existingProduct == null) {
            System.out.println("Nie znaleziono zamówienia o podanym id");
            return;
        }

        System.out.println("Podaj nową nazwę produktu:");
        String name = scanner.nextLine();
        System.out.println("Podaj nową cene produktu:");
        String price = scanner.nextLine();

        existingProduct.setName(name);
        existingProduct.setPrice(Double.parseDouble(price));

        productDAO.updateItem(existingProduct);
        System.out.println("Zaktualizowano produkt: " + existingProduct);
    }

    @Override
    public void add() {
        System.out.println("Podaj nazwę produktu:");
        String name = scanner.nextLine();
        System.out.println("Podaj cenę produktu:");
        String price = scanner.nextLine();

        Product product = new Product(name, Double.parseDouble(price));
        productDAO.createItem(product);
        System.out.println("Dodano produkt: " + product.getName());
    }
}
