package Unitec.Proyecto.Geometria;

/**
 *
 * @author T-301
 */
public class ValidarValorNoNegativo {
    //static es palabra reservada ||| y no se necesita crear un objeto de es a clase,
    public static void validar(float valor)throws NumeroNoNegativoException{
        //codigo que pudiera lanzar una excepcion... para poner mas excepciones se separa por comas,,,
     if (valor<0) {
         //lanzar una excelcion mediante throw ↓
         throw new NumeroNoNegativoException();
         
     }
    }


    
    
}
