
package Unitec.Proyecto.Geometria;


//constructor por defecto public Cuadrado(){}
        
    /**
     * Este contructor tiene un arguimento de topo flotante
     * @param lado El parametro que debes ingresar en el valor del lado de tu cuadrado  ↓↓↓↓
     */
   
    
    
    public class Cuadrado  implements Superficies {
    
private float lado;

/**
 * Este constructor tiene un argumento de tipo flotante
 * @param lado  El parametro que debes ingresar es el valor
 * del lado de tu cuadrado
 */
    public Cuadrado(float lado) throws FueraDeRangoException, ValorNegativoException {
               ValidarValores.validarValorNoNegativo(lado);
        ValidarValores.validarRango(lado);
 
        this.lado = lado;
    }
    
    public Cuadrado(){
        
    }
   
  
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) throws FueraDeRangoException, ValorNegativoException {
        ValidarValores.validarValorNoNegativo(lado);
        ValidarValores.validarRango(lado);
       
        this.lado = lado;
    }
    
      public float calcularArea() {
  
          float area=lado*lado;
          System.out.print("El area del cuadrado es: ");
  return area;
    }

}