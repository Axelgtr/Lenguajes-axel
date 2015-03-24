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
public class TestArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuadrado c =new Cuadrado();
        c.setLado(4);
        System.out.println ("El area del cuadrado es: " +c.calcularArea());
        
    }
    
}
