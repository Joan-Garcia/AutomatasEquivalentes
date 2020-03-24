package automatasequivalentes;

import datos.Captura;
import estructuras.Automata;

public class AutomatasEquivalentes {

    public static void main(String[] args) {
        Captura datosA = new Captura();
        Captura datosB = new Captura();
        
        datosA.capturaDefinicionFormal();
        datosB.capturaDefinicionFormal();
        
        Automata automataA = new Automata(datosA.getAlfabeto(), datosA.getEstados(), datosA.getEstadosFinales(), 
                                     datosA.getEstadoInicial());
        
        Automata automataB = new Automata(datosB.getAlfabeto(), datosB.getEstados(), datosB.getEstadosFinales(), 
                                     datosB.getEstadoInicial());
        
        Moore algoritmo = new Moore();
//        if (algoritmo.algoritmo(automataA, automataB))
//            System.out.println("Los automatas si son equivalentes");
//        else System.out.println("Los automatas no son equivalentes");

        algoritmo.sonEquivalentes(automataA, automataB, "q2", "r0");
        algoritmo.sonEquivalentes(automataA, automataB, "q1", "r1");
        algoritmo.sonEquivalentes(automataA, automataB, "q2", "r1");
        algoritmo.sonEquivalentes(automataA, automataB, "q1", "r0");
        
    }
    
}
