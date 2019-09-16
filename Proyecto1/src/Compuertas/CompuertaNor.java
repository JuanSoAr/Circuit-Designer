package Compuertas;

import ListaEnlazada.ListaEnlazada;
import javafx.scene.image.ImageView;

public class CompuertaNor extends CompuertaLogica {
    ImageView imagenCompuertaNor = new ImageView();
    ListaEnlazada listaCompuertaNor = new ListaEnlazada();

    @Override
    public void comportamiento() {
        this.setSalida(!(this.isEntradaA() || this.isEntradaB()));
        boolean salida = this.isSalida();
        System.out.println(salida);
    }

}
