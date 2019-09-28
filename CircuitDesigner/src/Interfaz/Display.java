package Interfaz;

import CompuertasLogicas.CompuertaAnd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase configura el frame e inicialisa el canvas
 */
public class Display {
    private Player player;
    private JFrame frame;
    private Canvas canvas;// graphics
    private String title;
    private boolean And12;
    private int width, height;

    /**
     * Configura el titulo y el tamaño de la pantalla
     *
     * @param title  titulo
     * @param width  ancho
     * @param height alto
     */
    public Display(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;

        //initialize JFrame
        createDisplay();
    }

    /**
     * Inicalisa el frame
     */

    private void createDisplay() {

        JButton simular = new JButton();
        simular.setText("Simular");
        simular.setBounds(10, 780, 140, 30);
        simular.setEnabled(true);

        JButton tabla = new JButton();
        tabla.setText("Tabla de verdad");
        tabla.setBounds(10, 820, 140, 30);
        tabla.setEnabled(true);

        JButton guardar = new JButton();
        guardar.setText("Guardar circuito");
        guardar.setBounds(10, 860, 140, 30);
        guardar.setEnabled(true);

        frame = new JFrame();
        frame.setSize(width, height);
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.add(simular);
        frame.add(tabla);
        frame.add(guardar);


        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setFocusable(false);
        frame.add(canvas);


        frame.pack();
    }

    /**
     * Permite acceder el canvas
     *
     * @return canvas
     */
    public Canvas getCanvas() {
        return canvas;
    }
    /**
     * Permite acceder al frame
     *
     * @return frame
     */
    public JFrame getFrame() {
        return frame;
    }
}