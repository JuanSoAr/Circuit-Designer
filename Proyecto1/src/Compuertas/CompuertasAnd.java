package Compuertas;

import ListaEnlazada.ListaEnlazada;
import javafx.scene.image.ImageView;

public class CompuertasAnd extends CompuertaLogica{
    ImageView imagenCompuertaAnd =new ImageView();
    ListaEnlazada listaCompuertaAnd = new ListaEnlazada();

    @Override
    public void comportamiento() {
        this.setSalida(this.isEntradaA() && this.isEntradaB());
        boolean salida = this.isSalida();
        System.out.println(salida);
    }
}

