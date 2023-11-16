package pruebas;

import javax.swing.*;
import java.awt.*;

public class prueba_interfaz extends JFrame {
    public prueba_interfaz() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Panel principal con BoxLayout vertical
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Panel para la primera fila de componentes
        JPanel firstRowPanel = new JPanel();
        firstRowPanel.setLayout(new BoxLayout(firstRowPanel, BoxLayout.X_AXIS));
        firstRowPanel.add(new JButton("Botón 1"));
        firstRowPanel.add(new JButton("Botón 2"));
        firstRowPanel.add(new JButton("Botón 3"));

        // Panel para la segunda fila de componentes
        JPanel secondRowPanel = new JPanel();
        secondRowPanel.setLayout(new BoxLayout(secondRowPanel, BoxLayout.X_AXIS));
        secondRowPanel.add(new JButton("Botón 4"));
        secondRowPanel.add(new JButton("Botón 5"));
        secondRowPanel.add(new JButton("Botón 6"));

        // Otro componente en el eje Y
        mainPanel.add(new JLabel("Este es otro componente en Y"));

        // Agregar los paneles de filas al panel principal
        mainPanel.add(firstRowPanel);
        mainPanel.add(secondRowPanel);

        setContentPane(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new prueba_interfaz();
        });
    }
}
