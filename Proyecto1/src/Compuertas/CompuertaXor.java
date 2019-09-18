package Compuertas;

public class CompuertaXor extends CompuertaLogica {
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
            if (entradaA == entradaB) {
                Compuerta.agregarAlFinal(0);
            } else {
                Compuerta.agregarAlFinal(1);
            }
        }
    }
}
