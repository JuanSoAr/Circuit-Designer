package Compuertas;

import ListaEnlazada.ListaEnlazada;

public class CompuertaLogica {
    ListaEnlazada Compuerta = new ListaEnlazada();
    int entradaA=2;
    int entradaB = 2;
    public int salida;
    public void Comportamiento() {
        if(entradaA == 2){
            //Metodo para pedir valor
        }
        if (entradaB == 2){
            //Metodo para pedir valor con
        }
        if((entradaA == 0 || entradaA ==1) && (entradaB == 0 || entradaB ==1)){
            Compuerta.agregarAlFinal(entradaA);
            Compuerta.agregarAlFinal(entradaB);
        }
    }

    public CompuertaLogica(int entradaA, int entradaB) {
        this.entradaA = entradaA;
        this.entradaB = entradaB;
    }
}




