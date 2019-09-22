package CompuertasLogicas;



public class CompuertaAnd extends CompuertaLogica{
    public void Comportamiento() {
        if(añadirEntradaA){
            //Metodo para pedir valor
        }
        if (añadirEntradaB){
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

