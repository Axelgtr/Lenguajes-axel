/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unitec.Proyecto.Geometria;

/**
 *
 * @author T-107
 */
public class Rectangulo {
    private float LadoMayor;
    private float LadoMenor;
     
    //clic derecho insert codigo/poner metodos get y set

    
    //insertar constructor.... clic derecho / inser cod/constructor/seleccionar todo/aceptar
    public Rectangulo() {
    }

    public Rectangulo(float LadoMayor, float LadoMenor) {
        this.LadoMayor = LadoMayor;
        this.LadoMenor = LadoMenor;
    }
    
    public float calcularArea(){
        return LadoMayor * LadoMenor;
        }

    public float getLadoMayor() {
        return LadoMayor;
    }

    public void setLadoMayor(float LadoMayor) {
        this.LadoMayor = LadoMayor;
    }

    public float getLadoMenor() {
        return LadoMenor;
    }

    public void setLadoMenor(float LadoMenor) {
        this.LadoMenor = LadoMenor;
    }
    
    
  
    
}
