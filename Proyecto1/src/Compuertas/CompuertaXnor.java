package Compuertas;

import ListaEnlazada.ListaEnlazada;
import javafx.scene.image.ImageView;

public class CompuertaXnor extends CompuertaLogica {
    ImageView imagenCompuertaXnor = new ImageView();
    ListaEnlazada listaCompuertaXnor = new ListaEnlazada();

    @Override
    public void comportamiento() {
        this.setSalida(!(this.isEntradaA() == this.isEntradaB()));
        boolean salida = this.isSalida();
        System.out.println(salida);
    }
}
