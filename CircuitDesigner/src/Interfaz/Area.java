package Interfaz;

import java.awt.*;

/**
 * Esta clase permite simular pequeños rectangulos invisibles en la pantalla que le premiten al usuario
 * areas en donde colocar las compuertas logicas
 */
public class Area {

    protected int x, y,width, height;
    protected Rectangle bounds = new Rectangle(0,0,100,100);


    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }

/**
 * Permite obtener el rectangulo asociado a la clase
 */
    public Rectangle getBounds() {
        return bounds;
    }

    /**
     * Permite darle valores al rectangulo
     * @param bounds Rectangulo
     */
    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }

    /**
     * Metodo contructor de la clase
     * @param x posicion en x
     * @param y posicion en y
     * @param width ancho del rectangulo
     * @param height alto del rectangulo
     */
    public Area(int x, int y, int width, int height) {

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        bounds.x = x;
        bounds.y = y;
        bounds.width = width;
        bounds.height = height;
    }

    /**
     * Actualiza los dibujitos
     * @param g pintor
     */
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        //g.drawRect(bounds.x,bounds.y,width,height);
    }


}