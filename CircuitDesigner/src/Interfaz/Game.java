package Interfaz;

import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * La clase principal del programa, desde esta clase se inicialisan todas las demas clases para poder usarlas.
 *  Crea un hilo que se va a encargar de crear un buucle para llamar constantemente el metodo tick y render de la clase
 *  PlayerManager y AreaManager
 */
public class Game implements Runnable {

    private Display display;
    public int width, height;
    public String title;

    private Thread thread;
    private boolean running = false;

    private BufferStrategy bs;
    private Graphics g;


    //states
    public State gameState;
    public State menuState;

    private Handler handler;

    //input
    private MouseManager mouseManager;
    private MouseControler mouseControler;

    private PlayerManager playerManager;
    private AreaManager areaManager;

    /**
     * Meododo constructor
     * @param title titulo
     * @param width ancho
     * @param height alto
     */
    public Game(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
        mouseManager = new MouseManager();
        mouseControler = new MouseControler();
    }

    /**
     * Metodo que se encargar de instanciar la clase display y decirle a los controladores del mause hacia donde
     * deben prestar su atencion, ademas instancia las clases que se van a utilizar para la ejecucion del programa
     */
    private void init() {
        display = new Display(title, width, height);
        display.getFrame().addKeyListener(mouseManager);
        display.getFrame().addMouseListener(mouseControler);
        display.getFrame().addMouseMotionListener(mouseControler);
        display.getCanvas().addMouseListener(mouseControler);
        display.getCanvas().addMouseMotionListener(mouseControler);
        Assets.init();

        handler = new Handler(this);
        playerManager = new PlayerManager(handler);
        areaManager = new AreaManager(handler);
        gameState = new GameState(handler,playerManager, areaManager);
        mouseControler.setPlayerManager(playerManager);

        State.setState(gameState);

    }

    /**
     * Se encarga de decirle a todas las clase co el metodo tick que ya es hora de ejecutarse
     */
    private void update() {

        mouseManager.tick();

        if(State.getState() != null) {
            State.getState().tick();

        }
    }

    /**
     * Se encarga de decirle a todas las clase co el metodo render que ya es hora de ejecutarse
     */
    private void render() {

        // bs le dice a la computadora como dibujar cosas usando buffers
        //buffer = a hidden computer screen
        bs = display.getCanvas().getBufferStrategy();
        if(bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();

        //Clear screen
        g.clearRect(0, 0, width, height);
        //Draw here
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, width, height);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 160, height);

        if(State.getState() != null) {
            State.getState().render(g);
        }


        //End drawing
        bs.show();
        g.dispose();

    }

    /**
     * Su logica permite que mi juego se ejecute 60 veces por segundo y ademas por cada segundo llama a los metodos
     * tick y render
     */
    @Override
    public void run() {
        init();

        int fps = 60;
        double timePerUpdate = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int updates = 0;

        while(running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerUpdate;
            timer += now - lastTime;
            lastTime = now;

            if(delta >= 1) {
                update();
                render();
                updates++;
                delta--;
            }
            if(timer >= 1000000000) {
                //System.out.println("Updates and Frames : " + updates);
                updates = 0;
                timer = 0;
            }


        }
        stop();

    }

    /**
     * Permite obtener la instancia de la clase MauseManager
     * @return La instancias MauseManager
     */
    public MouseManager getMouseManager() {
        return mouseManager;

    }

    /**
     *Permite obtener la instancia de la clase MauseControler
     * @return La instancias MauseControler
     */
    public MouseControler getMouseControler() {
        return mouseControler;
    }

    /**
     *Permite obtener la instancia de la clase AreaManager
     * @return La instancias AreaManager
     */
    public AreaManager getAreaManager() {
        return areaManager;
    }

    /**
     *Permite obtener la instancia de la clase PlayerManager
     * @return La instancias PlayerManager
     */
    public PlayerManager getPlayerManager() {
        return playerManager;
    }

    /**
     * Metodo que permite poner en ejecucion la clase game creando e iniciando el hilo principal
     */
    public synchronized void start() {
        if(running) {
            return;
        }
        running = true;
        thread = new  Thread(this);
        thread.start();

    }

    /**
     * Metodo que permite detener la ejecucion de la clase game.
     */
    public synchronized void stop() {
        if(!running) {
            return;
        }
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
