import javax.swing.JFrame;

public class ventana extends JFrame {

    public ventana() {
        setSize(400, 300); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Acción al cerrar la ventana
        setTitle("Mi ventana"); // Título de la ventana
    }

    public static void main(String[] args) {
        ventana ventana = new ventana();
        ventana.setVisible(true); // Hacer visible la ventana
    }
}
