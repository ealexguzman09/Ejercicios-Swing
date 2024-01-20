import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

Aquí está tu código con algunas mejoras y etiquetas para facilitar la comprensión:

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 extends JFrame implements ActionListener {
    /* Sistema de validación de usuario y contraseña. Si se escribe “admin” y
     * con contraseña “admin1234” se mostrará un diálogo diciendo “La contraseña es correcta”,
     * en caso contrario, el diálogo mostrará “La Contraseña no es correcta”.
     */

    // Componentes de la interfaz de usuario
    JLabel lblUsuario, lblContra, lblRespuesta;
    JTextField txtUsuario;
    JButton btnValidar;
    JPasswordField pswContra;

    // Constructor de la clase
    Ejercicio1() {
        // Configuración del diseño de la ventana
        setLayout(new FlowLayout());

        // Inicialización de componentes
        lblUsuario = new JLabel("Usuario: ");
        lblContra = new JLabel("Contraseña: ");
        lblRespuesta = new JLabel(" ");
        txtUsuario = new JTextField("admin");
        pswContra = new JPasswordField("1234");
        btnValidar = new JButton("Validar");

        // Agregar componentes a la ventana
        add(lblUsuario);
        add(txtUsuario);
        add(lblContra);
        add(pswContra);
        add(btnValidar);
        add(lblRespuesta);

        // Configuración de la ventana
        setTitle("Valida tu usuario y contraseña.");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Configuración del botón para escuchar eventos
        btnValidar.addActionListener(this);
    }

    // Método llamado cuando se hace clic en el botón
    public void actionPerformed(ActionEvent e) {
        // Obtener el texto de los campos de usuario y contraseña
        String usuario = txtUsuario.getText();
        char[] contraseña = pswContra.getPassword();
        String contraseñaIngresada = new String(contraseña);

        // Verificar si el usuario y la contraseña son correctos
        if (usuario.equals("admin") && contraseñaIngresada.equals("1234")) {
            JOptionPane.showMessageDialog(this, "La contraseña es correcta");
        } else {
            JOptionPane.showMessageDialog(this, "La contraseña y/o usuario no es correcta, intente de nuevo");
        }
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        new Ejercicio1();
    }
}
