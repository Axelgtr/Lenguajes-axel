/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unitec.Proyecto.Geometria;
import java.util.*;
/**
 *
 * @author T-301
 */
public class GenerarSuperficies {
    public static ArrayList<Superficies> obtenerFiguras() throws Exception{
        ArrayList<Superficies>figuritas=new ArrayList <Superficies>();
    //primero creamos cuadrados
        Cuadrado cu1=new Cuadrado(12);
        Cuadrado cu2=new Cuadrado(14);
        Cuadrado cu3=new Cuadrado(13);
        
        //crear 1 resctangulos
        Rectangulo re1=new Rectangulo (15,10);
                
        //crear 2 triangulos
        Triangulo tr1=new Triangulo (14,18);
        Triangulo tr2=new Triangulo (15,12);
        //crear 2 circulos
        Circulo ci1=new Circulo (8);
        Circulo ci2=new Circulo (26);
        
        //Agregarlos al ArrayList
        figuritas.add(cu1);
        figuritas.add(cu2);
        figuritas.add(cu3);
        figuritas.add(re1);
        figuritas.add(tr1);
        figuritas.add(tr2);
        figuritas.add(ci1);
        figuritas.add(ci2);
        
        return figuritas;
        
    }
}
