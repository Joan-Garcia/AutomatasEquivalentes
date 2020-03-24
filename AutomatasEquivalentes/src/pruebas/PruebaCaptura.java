package pruebas;

import datos.Captura;
import estructuras.Automata;

public class PruebaCaptura {
  
  public static void main(String[] args) {
    Captura datos = new Captura();
    datos.capturaDefinicionFormal();
    
    Automata automata = new Automata(datos.getAlfabeto(), datos.getEstados(), datos.getEstadosFinales(), 
                                     datos.getEstadoInicial());
    
    System.out.println(automata.getEstadoSiguiente("q2", "a"));
    System.out.println(automata.getTablaTransiciones().toString());
  }
}
