/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pjaraba
 */
public class Sustantivo {
    private List<Palabra> palabras;

    /**
     *
     * @param palabras
     */
    public Sustantivo(List<Palabra> palabras) {
        this.palabras = palabras;
    }
    
    public Sustantivo(Palabra palabra){
        palabras = new ArrayList<>();
        palabras.add(palabra);
    }
    
    /**
     * @return the palabras
     */
    public List<Palabra> getPalabras() {
        return palabras;
    }

    /**
     * @param palabras the palabras to set
     */
    public void setPalabras(List<Palabra> palabras) {
        this.palabras = palabras;
    }
    
}
