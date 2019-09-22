package Interfaz;

import java.awt.*;
import java.util.LinkedList;

/**
 * Permite manipular la clase area como un todo, de esta manera podemos controlar todas las areas que aparecen en la
 * pantalla
 */
public class AreaManager {
    LinkedList<Area> listaAreas;
    Handler handler ;

    /**
     * Metodo constructor
     * @param handler me permite acceder a cualquier otra clase facilmente
     */
    public AreaManager(Handler handler) {
        this.handler = handler;
        listaAreas = new LinkedList<Area>();
    }

    /**
     * Permite llamar al metodo render de todas la areas que se ecuentra en la pantalla
     * @param g pintor
     */
    public void render(Graphics g) {
        for(Area area : listaAreas) {
            area.render(g);
        }
    }

    public void addArea(Area area) {
        listaAreas.add(area);
    }
}
