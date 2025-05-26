import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okno extends JFrame implements ActionListener {
    private JButton dodaj;
    private JTextField pole1, pole2;

    public Okno() {
        super ("Okno");
        setLayout(new FlowLayout());
        dodaj = new JButton("Dodaj");
        pole1 = new JTextField(10);
        pole2 = new JTextField(10);

        add(dodaj);
        add(pole1);
        add(pole2);

        dodaj.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dodaj) {
            String liczbaStr = pole1.getText();
            int liczba = Integer.parseInt(liczbaStr);
            liczba *= 2;
            pole2.setText(Integer.toString(liczba));
        }
    }

    public static void main(String[] args) {
        new Okno();
    }
}



