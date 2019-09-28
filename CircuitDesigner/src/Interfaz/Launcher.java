package Interfaz;

/**
 *Llamar a game
 */
public class Launcher{
    /**
     * Metodo principal de todo el programa
     * @param args Argumento principal
     */
    public static void main(String[] args){
        Game game = new Game("Circuit Designer", 1800, 910);
        game.start();
    }
}
