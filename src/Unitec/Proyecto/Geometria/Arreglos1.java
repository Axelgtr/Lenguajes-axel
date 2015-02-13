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
public class Arreglos1 {
    
    
    
    
    //metodo main
    public static void main (String args[]){
//el 3 es el numero de lugares...
        
        
        //tipos de arreglos correcto ↓↓↓    ||| crear un arreglo y llamarlo Y
        int x[]=new int[3];
        int [] y =new int[3];
        //  int z[]=(1,-200,45);
        
        
        //el elemento x del indice 2 .... vale .....
        x[0]=127;
        x[1]=200;
        x[2]=-23;
        //x[3]=127;  tiene que marcar error por que solo hay 3........0,1,2        || el 3 no existe
        
        
        
        //ITERAR....CICLAR O HACER EL RECORRIDO CON EL CICLO FOR ↓↓↓
        
        for (int i =0; i<x.length; i++){   /*Ajusta al tamaño del arreglo el.....  """LENGTH""  */
            System.out.println (x[i]);
            
        }
        

        
    }
    
}
