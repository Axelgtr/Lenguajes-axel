/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unitec.Proyecto.Geometria;

/**
 *
 * @author T-301
 */
public class Cuadrado {
    
    private float lado;
    //constructor por defecto public Cuadrado(){}
    
    public Cuadrado (float lado) {//aqui se declara un contructor
    this.lado = lado;
    
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
