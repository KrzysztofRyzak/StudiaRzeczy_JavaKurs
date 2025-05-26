package Projekt_Prog.manager;

import Projekt_Prog.dao.CustomerDAO;
import Projekt_Prog.data.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerManager implements SimpleManager {
    private final Scanner scanner = new Scanner(System.in);
    private final CustomerDAO customerDAO = new CustomerDAO();

    @Override
    public void print() {
        System.out.println("Podaj id klienta do wyświetlenia:");
        String id = scanner.nextLine();

        Customer displayedCustomer = customerDAO.readItem(Integer.parseInt(id));
        if (displayedCustomer == null) {
            System.out.println("Nie znaleziono klienta o podanym id");
            return;
        }

        System.out.println(displayedCustomer);
    }

    @Override
    public void printAll() {
        List<Customer> customers = customerDAO.readItems();
        System.out.println(customers);
    }

    @Override
    public void delete() {
        System.out.println("Podaj id klienta do usunięcia:");
        String id = scanner.nextLine();

        customerDAO.deleteItem(Integer.parseInt(id));
        System.out.println("Usunieto klienta o id: " + id);
    }

    @Override
    public void update() {
        System.out.println("Podaj id klienta do edycji:");
        String id = scanner.nextLine();

        Customer existingCustomer = customerDAO.readItem(Integer.parseInt(id));
        if (existingCustomer == null) {
            System.out.println("Nie znaleziono klienta o podanym id");
            return;
        }

        System.out.println("Podaj nowe imię:");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nowe nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Podaj nowy adres:");
        String address = scanner.nextLine();

        existingCustomer.setFirstName(firstName);
        existingCustomer.setLastName(lastName);
        existingCustomer.setAddress(address);

        customerDAO.updateItem(existingCustomer);
        System.out.println("Zaktualizowano klienta: " + existingCustomer);
    }

    @Override
    public void add() {
        System.out.println("Podaj imię:");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String surname = scanner.nextLine();
        System.out.println("Podaj adres:");
        String address = scanner.nextLine();

        Customer customer = new Customer(name, surname, address);
        customerDAO.createItem(customer);
        System.out.println("Dodano klienta: " + customer);
    }
}
