package Compuertas;

import ListaEnlazada.ListaEnlazada;
import javafx.scene.image.ImageView;

public class CompuertaOr extends CompuertaLogica {
    ImageView imagenCompuertaOr = new ImageView();
    ListaEnlazada listaCompuertaOr = new ListaEnlazada();

    @Override
    public void comportamiento() {
        this.setSalida(this.isEntradaA() || this.isEntradaB());
        boolean salida = this.isSalida();
        System.out.println(salida);
    }
}