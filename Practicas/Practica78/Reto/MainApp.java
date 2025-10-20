import javax.swing.*;
import java.awt.*;

public class MainApp extends JFrame {
    private JComboBox<String> tipoMaterialComboBox;
    private JTextField tituloField, autorField, yearField, especificoField;
    private JLabel especificoLabel;
    private JButton agregarButton;
    private JTextArea displayArea;

    public MainApp() {
        // --- Configuración de la ventana principal ---
        setTitle("Gestor de Biblioteca");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // --- Panel de entrada de datos ---
        JPanel panelEntrada = new JPanel(new GridLayout(6, 2, 5, 5));
        panelEntrada.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelEntrada.add(new JLabel("Tipo de Material:"));
        tipoMaterialComboBox = new JComboBox<>(new String[]{"Libro", "Revista", "DVD"});
        panelEntrada.add(tipoMaterialComboBox);
        panelEntrada.add(new JLabel("Título:"));
        tituloField = new JTextField();
        panelEntrada.add(tituloField);
        panelEntrada.add(new JLabel("Autor:"));
        autorField = new JTextField();
        panelEntrada.add(autorField);
        panelEntrada.add(new JLabel("Año:"));
        yearField = new JTextField();
        panelEntrada.add(yearField);
        especificoLabel = new JLabel("Editorial:");
        panelEntrada.add(especificoLabel);
        especificoField = new JTextField();
        panelEntrada.add(especificoField);
        agregarButton = new JButton("Agregar Material");
        panelEntrada.add(new JLabel());
        panelEntrada.add(agregarButton);

        // --- Área de visualización ---
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Materiales Registrados"));
        add(panelEntrada, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // --- LÓGICA DE LOS EVENTOS ---
        tipoMaterialComboBox.addActionListener(e -> {
            String seleccion = (String) tipoMaterialComboBox.getSelectedItem();
            switch (seleccion) {
                case "Libro": especificoLabel.setText("Editorial:"); break;
                case "Revista": especificoLabel.setText("Núm. Edición:"); break;
                case "DVD": especificoLabel.setText("Duración (min):"); break;
            }
        });

        agregarButton.addActionListener(e -> agregarMaterial());
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void agregarMaterial() {
        String tipo = (String) tipoMaterialComboBox.getSelectedItem();
        String titulo = tituloField.getText();
        String autor = autorField.getText();
        String especifico = especificoField.getText();
        int year = Integer.parseInt(yearField.getText());
        Material nuevoMaterial = null;

        switch (tipo) {
            case "Libro":
                nuevoMaterial = new Libro(titulo, autor, year, especifico);
                break;
            case "Revista":
                int numEdicion = Integer.parseInt(especifico);
                nuevoMaterial = new Revista(titulo, autor, year, numEdicion);
                break;
            case "DVD":
                int duracion = Integer.parseInt(especifico);
                nuevoMaterial = new DVD(titulo, autor, year, duracion);
                break;
        }

        if (nuevoMaterial != null) {
            displayArea.append(nuevoMaterial.mostrarInformacion() + "\n");
            tituloField.setText("");
            autorField.setText("");
            yearField.setText("");
            especificoField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainApp());
    }
}