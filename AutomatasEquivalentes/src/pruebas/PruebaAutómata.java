package pruebas;

import estructuras.Automata;

public class PruebaAutómata {
  
  public static void main(String[] args) {
    String[] alfabeto = {"a", "b"};
    String[] estados = {"q0", "q1", "q2"};
    String[] estadosFinales = {"q0", "q2"};
    String estadoInicial = "q0";
    
    
    Automata automata = new Automata(alfabeto, estados, estadosFinales, 
                                     estadoInicial);
    System.out.println(automata.getEstadoSiguiente("q2", "a"));
    System.out.println(automata.getTablaTransiciones().toString());
      for (int i = 0; i < estados.length; i++) {
          System.out.println(estados[i] + " --- " + automata.esEstadoFinal(estados[i]));
          
      }
  }
}
