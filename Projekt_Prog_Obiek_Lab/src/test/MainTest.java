package test;

import Projekt_Prog.Main;
import Projekt_Prog.manager.CustomerManager;
import Projekt_Prog.manager.OrderManager;
import Projekt_Prog.manager.ProductManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

class MainTest {

    @Test
    void testMainWybierzOpcjeDodajZamowienie() {
        OrderManager orderManagerMock = Mockito.mock(OrderManager.class);
        Main.setOrderManager(orderManagerMock);
        Main.setScanner(new Scanner(new ByteArrayInputStream("1\n16\n".getBytes())));

        Main.main(null);

        Mockito.verify(orderManagerMock, Mockito.only()).add();
    }

    @Test
    void testMainWybierzKazdaZOpcjiNaZamowieniach() {
        OrderManager orderManagerMock = Mockito.mock(OrderManager.class);
        Main.setOrderManager(orderManagerMock);
        Main.setScanner(new Scanner(new ByteArrayInputStream("1\n2\n3\n4\n5\n16\n".getBytes())));

        Main.main(null);

        Mockito.verify(orderManagerMock, Mockito.times(1)).add();
        Mockito.verify(orderManagerMock, Mockito.times(1)).update();
        Mockito.verify(orderManagerMock, Mockito.times(1)).delete();
        Mockito.verify(orderManagerMock, Mockito.times(1)).print();
        Mockito.verify(orderManagerMock, Mockito.times(1)).printAll();
    }

    @Test
    void testMainWybierzKazdaZOpcjiNaKlientach() {
        CustomerManager customerManagerMock = Mockito.mock(CustomerManager.class);
        Main.setCustomerManager(customerManagerMock);
        Main.setScanner(new Scanner(new ByteArrayInputStream("6\n7\n8\n9\n10\n16\n".getBytes())));

        Main.main(null);

        Mockito.verify(customerManagerMock, Mockito.times(1)).add();
        Mockito.verify(customerManagerMock, Mockito.times(1)).update();
        Mockito.verify(customerManagerMock, Mockito.times(1)).delete();
        Mockito.verify(customerManagerMock, Mockito.times(1)).print();
        Mockito.verify(customerManagerMock, Mockito.times(1)).printAll();
    }

    @Test
    void testMainWybierzKazdaZOpcjiNaProduktach() {
        ProductManager productManagerMock = Mockito.mock(ProductManager.class);
        Main.setProductManager(productManagerMock);
        Main.setScanner(new Scanner(new ByteArrayInputStream("11\n12\n13\n14\n15\n16\n".getBytes())));

        Main.main(null);

        Mockito.verify(productManagerMock, Mockito.times(1)).add();
        Mockito.verify(productManagerMock, Mockito.times(1)).update();
        Mockito.verify(productManagerMock, Mockito.times(1)).delete();
        Mockito.verify(productManagerMock, Mockito.times(1)).print();
        Mockito.verify(productManagerMock, Mockito.times(1)).printAll();
    }

    @Test
    void testMainWybranoTylkoWyjscie() {
        OrderManager orderManagerMock = Mockito.mock(OrderManager.class);
        Main.setOrderManager(orderManagerMock);
        Main.setScanner(new Scanner(new ByteArrayInputStream("16\n".getBytes())));

        Main.main(null);

        Mockito.verifyNoInteractions(orderManagerMock);
    }

    @Test
    void testMainWybranoZbytDuzaOpcjeZMenu() {
        Main.setScanner(new Scanner(new ByteArrayInputStream("17\n16\n".getBytes())));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(null);

        Assertions.assertTrue(outContent.toString().contains("Wybrano niepoprawną opcję"));
    }

    @Test
    void testMainWybranoUjemnaOpcje() {
        Main.setScanner(new Scanner(new ByteArrayInputStream("-5\n16\n".getBytes())));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(null);

        Assertions.assertTrue(outContent.toString().contains("Wybrano niepoprawną opcję"));
    }

    @Test
    void testMainWybranoZerowaOpcje() {
        Main.setScanner(new Scanner(new ByteArrayInputStream("-5\n16\n".getBytes())));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(null);

        Assertions.assertTrue(outContent.toString().contains("Wybrano niepoprawną opcję"));
    }

    @Test
    void testMainDodanoPo1ZKazdegoObiektuNaBazie() {
        ProductManager productManagerMock = Mockito.mock(ProductManager.class);
        CustomerManager customerManagerMock = Mockito.mock(CustomerManager.class);
        OrderManager orderManagerMock = Mockito.mock(OrderManager.class);
        Main.setProductManager(productManagerMock);
        Main.setCustomerManager(customerManagerMock);
        Main.setOrderManager(orderManagerMock);
        Main.setScanner(new Scanner(new ByteArrayInputStream("1\n6\n11\n16\n".getBytes())));

        Main.main(null);

        Mockito.verify(orderManagerMock, Mockito.times(1)).add();
        Mockito.verify(productManagerMock, Mockito.times(1)).add();
        Mockito.verify(customerManagerMock, Mockito.times(1)).add();
    }

    @Test
    void testMainWypisanoPo1ZKazdegoObiektuNaBazie() {
        ProductManager productManagerMock = Mockito.mock(ProductManager.class);
        CustomerManager customerManagerMock = Mockito.mock(CustomerManager.class);
        OrderManager orderManagerMock = Mockito.mock(OrderManager.class);
        Main.setProductManager(productManagerMock);
        Main.setCustomerManager(customerManagerMock);
        Main.setOrderManager(orderManagerMock);
        Main.setScanner(new Scanner(new ByteArrayInputStream("4\n9\n14\n16\n".getBytes())));

        Main.main(null);

        Mockito.verify(orderManagerMock, Mockito.times(1)).print();
        Mockito.verify(productManagerMock, Mockito.times(1)).print();
        Mockito.verify(customerManagerMock, Mockito.times(1)).print();
    }
}
