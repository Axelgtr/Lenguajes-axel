/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo.threads;

/**
 *
 * @author T-301
 */
public class Facil extends Thread {
    //hereda a la clase thread
    
    
    public void run (){
        
        try{    //obliga a que tarde 3 segundos    
            Thread.sleep(3000);//dormir tres segundos
        
        System.out.println("Soy un threads facil");
        //pedir el thread atual
        String nombre=Thread.currentThread().getName();
        System.out.println("Me llamo "+nombre);
    }catch(InterruptedException e){  }
//NO ES BUENO.
    //1)    THREADS HEREDANDO LA CLASE THREADS
    
    
}
}