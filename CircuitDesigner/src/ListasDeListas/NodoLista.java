package ListasDeListas;

import Lista.ListaEnlazada;

import static ListasDeListas.ListaDeListas.largo;

public class NodoLista {
    public ListaEnlazada lista = new ListaEnlazada(largo);
    public NodoLista siguiente;
    public NodoLista(ListaEnlazada lista){
        this.lista = lista;
        this.siguiente = null;

    }
}
