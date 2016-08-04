/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.util.List;

/**
 *
 * @author pjaraba
 */
public interface IExtractorSustantivos {
    String obtenerSustantivosStr(String texto);
    List<Sustantivo> obtenerSustantivos(String texto);
}
