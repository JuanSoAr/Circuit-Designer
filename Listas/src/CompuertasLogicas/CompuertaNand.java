package CompuertasLogicas;

public class CompuertaNand extends CompuertaLogica {

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
        if((entradaA == 0 || entradaA ==1) && (entradaB == 0 || entradaB ==1)){
            Compuerta.agregarAlFinal(entradaA);
            Compuerta.agregarAlFinal(entradaB);
            if(entradaA == 1 && entradaB ==1){
                Compuerta.agregarAlFinal(0);
            }
            else{
                Compuerta.agregarAlFinal(1);
            }
        }
    }
}
