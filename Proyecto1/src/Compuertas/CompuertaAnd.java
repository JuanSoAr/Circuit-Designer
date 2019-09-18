package Compuertas;



public class CompuertaAnd extends CompuertaLogica{
    public CompuertaAnd(int entradaA, int entradaB) {
        super(entradaA, entradaB);
    }

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
            if(entradaA == 1 && entradaB ==1){
                Compuerta.agregarAlFinal(1);
            }
            else{
                Compuerta.agregarAlFinal(0);
            }
        }
        System.out.println(entradaA);
        System.out.println(entradaB);
        System.out.println(salida);
    }

}

