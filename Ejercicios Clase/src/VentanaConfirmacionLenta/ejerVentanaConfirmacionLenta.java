package VentanaConfirmacionLenta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class ejerVentanaConfirmacionLenta {
    private static Random r = new Random();

    // Este método simula un proceso que tarda un tiempo en hacerse (entre 5 y 10 segundos)
    private static void procesoConfirmar() {
        try {
            Thread.sleep(5000 + 1000 * r.nextInt(6));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Ventana de Confirmación");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Crear el campo de texto y el botón de confirmar
        JTextField textField = new JTextField(20);
        JButton confirmButton = new JButton("Confirmar");

        // Agregar el campo de texto y el botón a la ventana
        frame.add(textField);
        frame.add(confirmButton);

        // Manejador de eventos para el botón de confirmar
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Deshabilitar el botón para evitar múltiples clics
                confirmButton.setEnabled(false);

                // Realizar el proceso de confirmación en un hilo separado
                Thread confirmationThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        procesoConfirmar();

                        // Habilitar nuevamente el botón después de que se complete el proceso
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                confirmButton.setEnabled(true);
                            }
                        });
                    }
                });

                confirmationThread.start();
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
