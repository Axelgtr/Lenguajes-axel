
package Unitec.Proyecto.Geometria;

/**
 *
 * @author T-301
 */


public class NumeroNoNegativoException extends Exception {
    //extends.........hereda a la clase excepcion
    public NumeroNoNegativoException(){
        super("Lo siento pero no acepto valores negativos");// 
    }
}
