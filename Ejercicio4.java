import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio4 extends JFrame implements ActionListener {

    // Un botón, que cada vez que se clique, se visualizan 3 etiquetas,
    // cada una de ellas con valores al azar. Estos valores pueden ser dígitos o imágenes.
    // Tras visualizar, se mostrará, en una etiqueta alguno de estos textos:
    // Los tres valores son diferentes
    // Hay dos valores iguales
    // Los tres valores son iguales

    JButton btnBoton;
    Random random = new Random();
    JLabel lblEtiquetas[] = new JLabel[3];
    JLabel lblResultado;

    Ejercicio4() {
        setLayout(new GridLayout(5, 2));

        // Inicialización de componentes
        btnBoton = new JButton("Pulsar");
        add(btnBoton);

        for (int i = 0; i < lblEtiquetas.length; i++) {
            lblEtiquetas[i] = new JLabel();
            add(lblEtiquetas[i]);
            lblEtiquetas[i].setVisible(false);
        }

        lblResultado = new JLabel();
        add(lblResultado);

        // Configuración del botón para escuchar eventos
        btnBoton.addActionListener(this);

        // Configuración de la ventana
        setTitle("Etiquetas");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Generar valores aleatorios y mostrar etiquetas
        for (int i = 0; i < lblEtiquetas.length; i++) {
            int valor = (int) Math.floor(Math.random() * 4); // Valor recomendado *100, pero, he puesto 4 para comprobar el label respuesta.
            lblEtiquetas[i].setText(String.valueOf(valor));
            lblEtiquetas[i].setVisible(true);
        }

        // Obtener valores de las etiquetas
        String valor1 = String.valueOf(lblEtiquetas[0].getText());
        String valor2 = String.valueOf(lblEtiquetas[1].getText());
        String valor3 = String.valueOf(lblEtiquetas[2].getText());

        // Comparar valores y mostrar resultado
        if (valor1.equals(valor2) && valor2.equals(valor3) && valor3.equals(valor1)) {
            lblResultado.setText("Los tres valores son iguales");
        } else if (valor1.equals(valor2) || valor2.equals(valor3) || valor3.equals(valor1)) {
            lblResultado.setText("Hay dos valores iguales");
        } else {
            lblResultado.setText("Los tres valores son diferentes");
        }
    }

    public static void main(String[] args) {
        new Ejercicio4();
    }
}
