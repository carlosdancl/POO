// Ventana.java
import javax.swing.*;
import java.awt.event.*;

public class Ventana extends JFrame {
    JButton boton;
    Mensajes controlador;
    double x0, y0, x1, y1;

    public Ventana(Mensajes controlador, double x0, double y0, double x1, double y1) {
        this.controlador = controlador;
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;

        setTitle("Distancia Entre 2 Puntos");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        boton = new JButton("Haz clic aqui para ver el resultado");

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = controlador.mensaje(x0, y0, x1, y1);
                JOptionPane.showMessageDialog(null, mensaje);
            }
        });

        add(boton);
    }
}