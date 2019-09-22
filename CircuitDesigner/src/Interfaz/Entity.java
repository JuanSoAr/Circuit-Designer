package Interfaz;

import java.awt.*;

/**
 * Esta clase suministra los atributos necesarios para poder tener en total funcionalidad la clase palyer
 */
public abstract class Entity {

    protected int x, y, posInicialX, posInicialY;
    protected boolean hovering = false;
    protected Rectangle bounds;
    public String name;

    /**
     * Metodo contructor
     * @param x pos x
     * @param y pos y
     */
    public Entity(int x, int y) {
        this.x = x;
        this.y = y;
        bounds = new Rectangle(0,0,100,100);
    }

    /**
     * Obliga a la clase player e tener un metodo tick para que pueda actulizar sus atributos
     */
    public abstract void tick();

    /**
     * Obliga a la clase player e tener un metodo tick para que pueda actulizar sus graficos
     * @param g pintor
     */
    public abstract void render(Graphics g);
    
}
