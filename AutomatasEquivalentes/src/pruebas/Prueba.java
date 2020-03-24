package pruebas;

import automatasequivalentes.Moore;
import estructuras.Automata;

public class Prueba {

    public static void main(String[] args) {

        String[] alfabetoA = {"a", "b"};
        String[] estadosA = {"q0", "q1", "q2"};
        String[] estadosFinalesA = {"q0", "q2"};
        String estadoInicialA = "q0";
        
        String[] alfabetoB = {"a", "b"};
        String[] estadosB = {"r0", "r1"};
        String[] estadosFinalesB = {"r0"};
        String estadoInicialB = "r0";
        
        Automata automataA = new Automata(alfabetoA, estadosA, estadosFinalesA, 
                                     estadoInicialA);
        
        Automata automataB = new Automata(alfabetoB, estadosB, estadosFinalesB, 
                                     estadoInicialB);
        
        Moore algoritmo = new Moore();
        if (algoritmo.algoritmo(automataA, automataB))
            System.out.println("Los automatas si son equivalentes");
        else System.out.println("Los automatas no son equivalentes");

//        algoritmo.sonEquivalentes(automataA, automataB, "q2", "r0");
//        algoritmo.sonEquivalentes(automataA, automataB, "q1", "r1");
//        algoritmo.sonEquivalentes(automataA, automataB, "q2", "r1");
//        algoritmo.sonEquivalentes(automataA, automataB, "q1", "r0");
        
    }
    
}
