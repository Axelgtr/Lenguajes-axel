/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

/**
 *
 * @author T-107
 */

import java.util.*;

public class ModeloGaleria {
    
    public static ArrayList<Galeria> generarGaleria(){
    //arreglo de la clase Galeria
    ArrayList<Galeria> arreglo=new ArrayList<Galeria>();
    
    //crear los constructores de la clase galeria con los atributos....
    Galeria g1=new Galeria("Titulo 1", "Mi descripcion 1","/imagenes/uno.jpg");
    Galeria g2=new Galeria("Titulo 2", "Mi descripcion 2","/imagenes/dos.jpg");
    Galeria g3=new Galeria("Titulo 3", "Mi descripcion 3","/imagenes/tres.jpg");
    
    arreglo.add(g1);
    arreglo.add(g2);
    arreglo.add(g3);
    
    return arreglo;
    
    }
    
}
