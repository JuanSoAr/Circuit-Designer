package Compuertas;
public class CompuertaNot extends CompuertaLogica {
    public CompuertaNot(int entradaA, int entradaB) {
        super(entradaA, entradaB);
    }

    public void Comportamiento() {
        if (entradaA == 2) {
            //Metodo para pedir valor

        }
        if ((entradaA == 0 || entradaA == 1) && (entradaB == 0 || entradaB == 1)) {
            Compuerta.agregarAlFinal(entradaA);

            if (entradaA == 1) {
                Compuerta.agregarAlFinal(0);
            } else {
                Compuerta.agregarAlFinal(1);
            }
        }
    }
}