package Interfaz;

import javax.swing.*;
import java.awt.*;

/**
 * Esta clase configura el frame e inicialisa el canvas
 */
public class Display {
    private JFrame frame;

    private Canvas canvas;// graphics

    private String title;

    private int width, height;

    /**
     * Configura el titulo y el tamaño de la pantalla
     * @param title titulo
     * @param width ancho
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
        frame = new JFrame();
        frame.setSize(width, height);
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

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
     * @return canvas
     */
    public Canvas getCanvas() {
        return canvas;
    }

    /**
     * Permite acceder al frame
     * @return frame
     */
    public JFrame getFrame() {
        return frame;
    }


}
