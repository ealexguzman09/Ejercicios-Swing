import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio2 extends JFrame implements ActionListener {
    /* Un cuadro desplegable (combo) que muestre 3 opciones (por ejemplo: gato, perro y caballo),
    y, al seleccionar, se mostrará una imagen relacionada. */

    // Componentes de la interfaz de usuario
    JComboBox cboAnimales;
    JLabel lblImagen;
    ImageIcon imgGato, imgPerro, imgCaballo;
    String[] animales = {"Gato", "Perro", "Caballo"};

    // Constructor de la clase
    Ejercicio2() {
        setLayout(new FlowLayout());

        // Inicialización de componentes
        //Advertencia: Si el programa no funciona el posible fallo a tomar en cuenta son los directorios de las imagenes.
        //Recomendacion: Descargar la carpeta de imagenes y situarla en el mismo directorio  que el programa menciona.
        //Recomendacion2: Descargar imagenes a gusto y cambiar el direcctorio de el programa por el de la imagen descargada.
        cboAnimales = new JComboBox(animales);
        imgGato = new ImageIcon("C:\\Users\\eguzm\\Desktop\\Imagenes\\cat.jpg");
        imgPerro = new ImageIcon("C:\\Users\\eguzm\\Desktop\\Imagenes\\dog.jpg");
        imgCaballo = new ImageIcon("C:\\Users\\eguzm\\Desktop\\Imagenes\\horse.jpg");

        lblImagen = new JLabel(imgGato);
        lblImagen.setVisible(false);

        // Agregar componentes a la ventana
        add(cboAnimales);
        add(lblImagen);

        // Configuración de la ventana
        setTitle("Imágenes");
        setSize(700, 700);
        setVisible(true);

        cboAnimales.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cboAnimales) {
            String seleccion = (String) cboAnimales.getSelectedItem();
            lblImagen.setVisible(true);

            // Mostrar la imagen correspondiente a la opción seleccionada
            if ("Gato".equals(seleccion)) {
                lblImagen.setIcon(imgGato);
            } else if ("Perro".equals(seleccion)) {
                lblImagen.setIcon(imgPerro);
            } else if ("Caballo".equals(seleccion)) {
                lblImagen.setIcon(imgCaballo);
            } else {
                lblImagen.setVisible(false);
            }
        }
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        new Ejercicio2();
    }
}
