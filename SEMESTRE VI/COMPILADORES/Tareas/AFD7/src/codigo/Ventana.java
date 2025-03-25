package codigo;

import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana() {
        setTitle("Mi Primera Ventana");
        setSize(400, 300); // Tamaño de la ventana (ancho x alto)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar al salir
        setLocationRelativeTo(null); // Centrar ventana
        setVisible(true); // Mostrar ventana
    }

    public static void main(String[] args) {
        new Ventana(); // Crear instancia de la ventana
    }
}
