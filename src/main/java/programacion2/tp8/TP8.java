package programacion2.tp8;
import javax.swing.SwingUtilities;
import tp8.gui.Formulario;


public class TP8 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }
}
