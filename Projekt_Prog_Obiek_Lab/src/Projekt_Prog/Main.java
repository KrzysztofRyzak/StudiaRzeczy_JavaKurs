package Projekt_Prog;

import Projekt_Prog.manager.CustomerManager;
import Projekt_Prog.manager.OrderManager;
import Projekt_Prog.manager.ProductManager;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static CustomerManager customerManager = new CustomerManager();

    private static OrderManager orderManager = new OrderManager();

    private static ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Dodaj zamówienie");
            System.out.println("2. Edytuj zamówienie");
            System.out.println("3. Usuń zamówienie");
            System.out.println("4. Wyświetl zamówienie o podanym id");
            System.out.println("5. Wyświetl wszystkie zamówienia");
            System.out.println("6. Dodaj klienta");
            System.out.println("7. Edytuj klienta");
            System.out.println("8. Usuń klienta");
            System.out.println("9. Wyświetl klienta o podanym id");
            System.out.println("10. Wyświetl wszystkich klientów");
            System.out.println("11. Dodaj produkt");
            System.out.println("12. Edytuj produkt o podanym id");
            System.out.println("13. Usuń produkt");
            System.out.println("14. Wyświetl produkt o podanym id");
            System.out.println("15. Wyświetl wszystkie produkty");
            System.out.println("16. Wyjdź");

            String option = scanner.nextLine();
            switch (Integer.parseInt(option)) {
                case 1:
                    orderManager.add();
                    break;
                case 2:
                    orderManager.update();
                    break;
                case 3:
                    orderManager.delete();
                    break;
                case 4:
                    orderManager.print();
                    break;
                case 5:
                    orderManager.printAll();
                    break;
                case 6:
                    customerManager.add();
                    break;
                case 7:
                    customerManager.update();
                    break;
                case 8:
                    customerManager.delete();
                    break;
                case 9:
                    customerManager.print();
                    break;
                case 10:
                    customerManager.printAll();
                    break;
                case 11:
                    productManager.add();
                    break;
                case 12:
                    productManager.update();
                    break;
                case 13:
                    productManager.delete();
                    break;
                case 14:
                    productManager.print();
                    break;
                case 15:
                    productManager.printAll();
                    break;
                case 16:
                    exit = true;
                    break;
                default:
                    System.out.println("Wybrano niepoprawną opcję");
            }
        }
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Main.scanner = scanner;
    }

    public static CustomerManager getCustomerManager() {
        return customerManager;
    }

    public static void setCustomerManager(CustomerManager customerManager) {
        Main.customerManager = customerManager;
    }

    public static OrderManager getOrderManager() {
        return orderManager;
    }

    public static void setOrderManager(OrderManager orderManager) {
        Main.orderManager = orderManager;
    }

    public static ProductManager getProductManager() {
        return productManager;
    }

    public static void setProductManager(ProductManager productManager) {
        Main.productManager = productManager;
    }
}
