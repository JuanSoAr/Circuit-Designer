package Compuertas;

public class CompuertaOr extends CompuertaLogica {
    public CompuertaOr(int entradaA, int entradaB) {
        super(entradaA, entradaB);
    }

    public void Comportamiento() {
        if (entradaA == 2) {
            //Metodo para pedir valor
        }
        if (entradaB == 2) {
            //Metodo para pedir valor con
        }
        if ((entradaA == 0 || entradaA == 1) && (entradaB == 0 || entradaB == 1)) {
            Compuerta.agregarAlFinal(entradaA);
            Compuerta.agregarAlFinal(entradaB);
        }
        if((entradaA == 0 || entradaA ==1) && (entradaB == 0 || entradaB ==1)) {
            Compuerta.agregarAlFinal(entradaA);
            Compuerta.agregarAlFinal(entradaB);
            if (entradaA == 1 || entradaB == 1) {
                Compuerta.agregarAlFinal(1);
            } else {
                Compuerta.agregarAlFinal(0);
            }
        }
    }
}

