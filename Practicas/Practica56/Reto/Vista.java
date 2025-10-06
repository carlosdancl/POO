import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Vista extends JFrame implements ActionListener {
    private JTextField display;
    private final Logic logica; // Referencia a la lógica
    private boolean clear = false;
    public Vista() {
        this.logica = new Logic(); // Crea una instancia de la lógica
        setTitle("Calculadora Simple");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        display = new JTextField("0");
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 40));
        display.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(display, BorderLayout.NORTH);
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 10, 10));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        String[] botones = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };
        for (String texto : botones) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Arial", Font.BOLD, 24));
            boton.addActionListener(this);
            boton.setFocusable(false);
            panelBotones.add(boton);
        }
        add(panelBotones, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if ("0123456789".contains(comando)) {
            if (clear || "0".equals(display.getText())) {
                display.setText(comando);
                clear = false;
            } else {
                display.setText(display.getText() + comando);
            }
        } else if ("+-*/".contains(comando)) {
            logica.setOp1(Double.parseDouble(display.getText()));
            logica.setOperador(comando);
            clear = true;
        } else if ("=".equals(comando)) {
            double Op2 = Double.parseDouble(display.getText());
            String resultado = logica.calcular(Op2);
            display.setText(resultado);
            logica.reset();
            clear = true;
        } else if ("C".equals(comando)) {
            display.setText("0");
            logica.reset();
            clear = false;
        }
    }
}