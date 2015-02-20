
package Unitec.Proyecto.Geometria;


public class Cuadrado {
    
    private float lado;
    //constructor por defecto public Cuadrado(){}
        
    /**
     * Este contructor tiene un arguimento de topo flotante
     * @param lado El parametro que debes ingresar en el valor del lado de tu cuadrado  ↓↓↓↓
     */
   
    
    
    public Cuadrado (float lado) throws NumeroNoNegativoException {//aqui se declara un contructor
    /*validacion*/ ValidarValorNoNegativo.validar(lado);
        this.lado = lado;//asignacion
    
    }
    public Cuadrado(){}
    
    
     public void setLado(float lado) {
        this.lado = lado;
    }
    
      public float getLado() {
        return lado;
    }
      
    public float calcularArea(){
        float area=lado*lado;
        return area;
    }

      
}
