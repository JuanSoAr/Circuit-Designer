package ListaEnlazada;

public class NodoLista {
    ListaEnlazada lista = new ListaEnlazada();
    NodoLista siguiente;
    public NodoLista(ListaEnlazada lista){
        this.lista = lista;
        this.siguiente = null;
    }
}
