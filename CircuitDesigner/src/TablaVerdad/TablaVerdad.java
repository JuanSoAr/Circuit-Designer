package TablaVerdad;

public class TablaVerdad {
    int valores;
    String entradaA ="entradaA";
    String entradaB = "entradaB";
    String entradaC = "entradaC";
    String entradaD ="entradaD";
    String entradaE = "entradaE";
    String salidas = "salidas";


    public void TablaVerdad(int entradas){
         valores = 2^(entradas);
    }
    public void MostrarTabla(int entradas){
        if(entradas == 1) {
            System.out.println(entradaA + "/"+ salidas);
            System.out.println(1);
            System.out.println(0);

        }
        if(entradas == 2){
            System.out.println(entradaA+" / "+ entradaB+ " / "+ salidas);
            System.out.println(1 + "/ " + 1 +" / ");
            System.out.println(1+ " / "+0 + " / ");
            System.out.println(0+" / "+1+" / ");
            System.out.println(0+" / "+0 + " / ");

        }
        if(entradas == 3){
            System.out.println(entradaA+" / "+ entradaB+ " / "+ entradaC +" / "+ salidas);
            System.out.println(1+" / "+1+" / "+1+ " / ");
            System.out.println(1+" / "+1+" / "+0+" / ");
            System.out.println(1+" / "+0+" / "+1+" / ");
            System.out.println(1+" / "+0+" / "+0+" / ");
            System.out.println(0+" / "+1+" / "+1+" / ");
            System.out.println(0+" / "+1+" / "+1+" / ");
            System.out.println(0+" / "+0+" / "+1+" / ");
            System.out.println(0+" / "+0+" / "+1+" / ");
        }

    }
}
