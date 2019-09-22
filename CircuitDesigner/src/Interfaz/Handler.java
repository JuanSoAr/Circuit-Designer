package Interfaz;

/**
 * Permite entregar el puntero relacionado a cada clase creada en game desde cualquier otra clase si esta lo recibe
 * como parametro
 */
public class Handler {
    private Game game;

    /**
     * Constructor
     * @param game game
     */
    public Handler(Game game) {
        this.game = game;

    }

    /**
     * Retorna el ancho de la pantalla de juego
     * @return Ancho
     */
    public int getWidth() {
        return game.width;
    }

    /**
     * Retorna el Alto de la pantalla de juego
     * @return alto
     */
    public int getHeight() {
        return game.height;
    }

    /**
     * Retorna el MauseManager
     * @return MauseManaer
     */
    public MouseManager getMouseManager() {
        return game.getMouseManager();
    }

    /**
     *Retorna el MouseControler
     * @return MouseControler
     */
    public MouseControler getMouseControler() {
        return game.getMouseControler();
    }

    /**
     *Retorna el AreaManager
     * @return AreaManager
     */
    public AreaManager getAreaManager() {
        return game.getAreaManager();
    }

    /**
     *Retorna el PlayerManager
     * @return PlayerManager
     */
    public PlayerManager getPlayerManager() {
        return game.getPlayerManager();
    }

    /**
     *Retorna Game
     * @return Game
     */
    public Game getGame() {
        return game;
    }

    /**
     *Cambia a game
     * @param game Game
     */
    public void setGame(Game game) {
        this.game = game;
    }

}