package CompuertasLogicas;

public class CompuertaXnor extends CompuertaLogica {


    public void Comportamiento() {
        if (añadirEntradaA) {
            //Metodo para pedir valor
        }
        if (añadirEntradaB) {
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
                Compuerta.agregarAlFinal(1);
            } else {
                Compuerta.agregarAlFinal(0);
            }
        }
    }
}
